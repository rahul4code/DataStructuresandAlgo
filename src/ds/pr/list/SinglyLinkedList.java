package ds.pr.list;

import java.util.NoSuchElementException;

public class SinglyLinkedList<T> {


    private ListNode<T> head = null;

    private int length = 0;

    public boolean addFirst(T e) {
        boolean flg = false;
        if (head == null) {
            head = new ListNode<>(e, null);
            length++;
            flg = true;
        }
        return flg;
    }

    public boolean add(T e) {
        boolean flg = false;

        if (head == null) {
            return flg;
        } else {
            ListNode<T> tmp = new ListNode<>(head.data, head.nextNode);
            head.data = e;
            head.nextNode = tmp;
            flg = true;
            length++;
        }
        return flg;
    }

    public boolean add(int index, T e) {
        boolean flg = false;
        if (head == null || (index >= length - 1) || index <= 0) {
            flg = false;
        } else {
            ListNode<T> tmp;
            tmp = head;
            int i = 0;
            while (i != index - 1) {
                tmp = tmp.getNextNode();
                i++;
            }
            tmp.setNextNode(new ListNode<>(e, tmp.getNextNode()));
            length++;
            flg = true;

        }
        return flg;
    }


    public <T> T[] toArray() {
        T[] arr;
        if (head == null || length == 0) {
            throw new NoSuchElementException();
        } else {

            ListNode tmp = new ListNode<>(head.data, head.nextNode);

            arr = (T[]) java.lang.reflect.Array.newInstance(head.getData().getClass(), length);
            int i = 0;
            while (i < length) {
                arr[i] = (T) tmp.data;
                tmp = tmp.nextNode;
                i++;
            }
        }
        return arr;
    }

    public int getLength() {
        return length;
    }

    private static class ListNode<T> {
        private T data;
        private ListNode nextNode;

        ListNode(T e, ListNode nxt) {
            this.data = e;
            this.nextNode = nxt;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        ListNode<T> getNextNode() {
            return nextNode;
        }

        void setNextNode(ListNode nextNode) {
            this.nextNode = nextNode;
        }


    }
}
