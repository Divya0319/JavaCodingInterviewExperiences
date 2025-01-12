package vectorstack.restApiEmpJoinedLast30Days;

import java.time.LocalDate;

public class Employee {

    private Long id;
    private String name;
    private LocalDate doj;

    public Employee(Long id, String name, LocalDate doj) {
        this.id = id;
        this.name = name;
        this.doj = doj;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", doj=" + doj +
                '}';
    }
}
