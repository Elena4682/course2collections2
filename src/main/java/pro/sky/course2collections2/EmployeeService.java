package pro.sky.course2collections2;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firstName, String lastName);
    Employee delete(String firstName, String lastName);
    Employee find (String firstName, String lastName);
    Collection<Employee> findAll();
}
