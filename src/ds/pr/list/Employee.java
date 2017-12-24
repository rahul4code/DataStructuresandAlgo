package ds.pr.list;

import org.jetbrains.annotations.NotNull;

public class Employee {

    public String name;

    @NotNull
    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                '}';
    }

    public String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
