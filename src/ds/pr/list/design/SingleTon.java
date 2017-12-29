package ds.pr.list.design;

public class SingleTon {

    private static SingleTon sn = null;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private SingleTon() {

    }

    static synchronized SingleTon getInstance() {

        if (sn == null) {
            sn = new SingleTon();
        } else {
            return sn;
        }
        return sn;
    }
}
