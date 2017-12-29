package ds.pr.list.Visitor;

public class VisitorImpl implements Visitor {


    @Override
    public void visit(Element element) {
        if(element instanceof Car){
            System.out.println("Do this Car");
        }

        else
        if( element instanceof Truck){
            System.out.println("Do this Truck");
        }
    }
}
