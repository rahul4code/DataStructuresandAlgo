package ds.pr.list.Factory;

public class Factory {

    public Vehicle getInstance(String name) {

        if (name.equals("Car")) {
            return new Car();
        }
        if (name.equals("Truck")) {
            return new Truck();
        } else {
            return null;
        }
    }
}
