
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author t00166011
 */
public class Employee {

    private List<Employee> users;
    private String name;
    private String role;
    private int salary;

    public Employee(String name, String role, int salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
        users = new ArrayList<Employee>();

    }

    public void add(Employee e) {
        users.add(e);
    }

    public void remove(Employee e) {
        users.remove(e);
    }

    public List<Employee> getEmployees() {
        return users;
    }

    public String toString() {
        return ("Employee: Name: " + name + ", Job Role: " + role + ", Salary: " + salary);
    }
}
