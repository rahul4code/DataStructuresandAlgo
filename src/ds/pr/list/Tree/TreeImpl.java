package ds.pr.list.Tree;

public class TreeImpl {

    public static void main(String[] args) {
        GenericTree<Integer> a = new GenericTree<>();
        a.add(2);
        a.insert(3);
        a.insert(1);
        a.traverse();
    }
}
