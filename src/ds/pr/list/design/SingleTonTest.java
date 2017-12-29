package ds.pr.list.design;

public class SingleTonTest {

    public static void main(String[] args) {
        SingleTon ds = SingleTon.getInstance();
        ds.setName("rahul");
        SingleTon xy = SingleTon.getInstance();
        System.out.println("The result is " + " " + xy.getName());

    }
}
