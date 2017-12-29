package ds.pr.list.Factory;

public class Imple {

    public static void main(String[] args) {
        Factory s = new Factory();
        System.out.println(s.getInstance("Car").getClass().getName());
        System.out.println(s.getInstance("Truck").getClass().getName());


    }
}
