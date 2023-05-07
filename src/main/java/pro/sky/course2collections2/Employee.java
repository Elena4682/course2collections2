package pro.sky.course2collections2;

public class Employee {
    private final String firstName;
    private final String lastName;

    public Employee(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){

        return lastName;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
    @Override
    public String toString() {
        return "Employee ( firstName:" + firstName + " , lastName:" + lastName + " )";
    }
    @Override
    public boolean equals(Object i){
        if (this == i)return true;
        if (i == null || getClass() != i.getClass())return false;
        Employee employee = (Employee) i;
        return firstName.equals(employee.firstName)&& lastName.equals(employee.lastName);
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(firstName, lastName);
    }
}
