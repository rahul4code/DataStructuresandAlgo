package ds.pr.list;


public class ListOps {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId("4");
        emp.setName("rahul");
        Employee empNew = new Employee();
        empNew.setName("preeti");
        empNew.setId("3");
        Employee empNew1 = new Employee();
        empNew1.setName("rohit");
        empNew1.setId("2");
        Employee empNew2 = new Employee();
        empNew2.setName("asim");
        empNew2.setId("1");
        Employee empNew3 = new Employee();
        empNew3.setName("Piyush");
        empNew3.setId("5");


        SinglyLinkedList<Employee> sEmp = new SinglyLinkedList<>();
        if (sEmp.addFirst(emp)) {
            System.out.println("Employee added succesfully");
        }

        if (sEmp.add(empNew)) {
            System.out.println("Employee added successfully");
        }
        if (sEmp.add(empNew1)) {
            System.out.println("Employee added successfully");
        }
        if (sEmp.add(empNew2)) {
            System.out.println("Employee added successfully");
        }

        System.out.println("The length of list is " + " " + sEmp.getLength());
       // sEmp.add(2, empNew3);
       // System.out.println("The length of list is " + " " + sEmp.getLength());

        for (Employee arr : (Employee[]) sEmp.toArray()) {
            System.out.println("The name is = " + " " + arr.getId());
        }

        sEmp.reverse();

        for (Employee arr : (Employee[]) sEmp.toArray()) {
            System.out.println("The name is = " + " " + arr.getId());
        }

    }
}
