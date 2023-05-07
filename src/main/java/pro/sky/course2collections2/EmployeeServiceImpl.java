package pro.sky.course2collections2;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private static final int MAX_SIZE = 50;
    private final Map<String, Employee> employees = new HashMap<>();
    @Override
    public Employee add(String firstName, String lastName){
        Employee employee = new Employee(firstName,lastName);
        if (employees.size()> MAX_SIZE){
            throw new EmployeeStorageIsFullException();
        }
        if (employees.containsKey(employee.getFullName())){
            throw new EmployeeAlreadyAddedException();
        }
        employees.put(employee.getFullName(),employee);
        return employee;
    }
    @Override
    public Employee delete(String firstName, String lastName){
        Employee employee = new Employee(firstName,lastName);
        if(employees.containsKey(employee.getFullName())){
            return employees.remove(employee.getFullName());
        }
        throw  new EmployeeNotFoundException();
    }
    @Override
    public Employee find (String firstName, String lastName){
        Employee employee = new Employee(firstName,lastName);
        if(employees.containsKey(employee.getFullName())){
            return employees.get(employee.getFullName());
        }
        throw new EmployeeNotFoundException();
    }
    @Override
    public Collection<Employee> findAll() {
        return employees.values();
    }
}
