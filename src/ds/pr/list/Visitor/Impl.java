package ds.pr.list.Visitor;

public class Impl {

    public static void main(String[] args) {
        Car car = new Car();
        Element truck = new Truck();
        VisitorImpl vis = new VisitorImpl();

        car.accept(vis);
    }
}
