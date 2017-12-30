package ds.pr.list.Tree;

import java.util.LinkedList;

public class GenericTree<T extends Comparable> {


    TreeNode root;

    public GenericTree() {
        this.root = null;
    }

    public void add(T d) {
        if (root == null) {
            root = new TreeNode(null, null, d);
        } else {

        }
    }

    public void insert(T d) {
        if (d == null || root == null)
            return;
        else {
            TreeNode<T> tmp = root;
            this.addTree(tmp, d);

        }
    }

    public void addTree(TreeNode<T> tmp, T add) {

        if (tmp.data.compareTo(add) == 1) {
            if (tmp.leftNode != null) {
                this.addTree(tmp.leftNode, add);
            } else {
                tmp.leftNode = new TreeNode<>(null, null, add);
                return;
            }
        } else if (tmp.data.compareTo(add) < 0) {
            if (tmp.rightnode != null) {
                this.addTree(tmp.rightnode, add);
            } else {
                tmp.rightnode = new TreeNode<>(null, null, add);
                return;
            }
        }

    }

    public void traverse() {
        TreeNode<T> tmp = root;
        this.preOrder(tmp);

    }

    public void preOrder(TreeNode<T> tmp) {
        if (tmp != null) {
            System.out.println(tmp.data);
            if (tmp.leftNode != null) {
                this.preOrder(tmp.leftNode);
            }
            if (tmp.rightnode != null) {
                this.preOrder(tmp.rightnode);
            }
        }


    }


    private static class TreeNode<T extends Comparable> {

        TreeNode leftNode = null;
        TreeNode rightnode = null;
        T data;

        public TreeNode(TreeNode leftNode, TreeNode rightnode, T data) {
            this.leftNode = leftNode;
            this.rightnode = rightnode;
            this.data = data;

        }


    }
}
