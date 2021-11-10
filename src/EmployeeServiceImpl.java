import Model.Employee;

import java.util.List;
import java.util.stream.DoubleStream;

public class EmployeeServiceImpl implements EmployeeService{

    public void totalSalary(List<Employee> employees) {
        System.out.println(employees.stream().mapToDouble(Employee::getSalary).sum());
    }


    public void totalBonus(List<Employee> employees) {
        System.out.println(employees.stream().mapToInt(Employee::getBonus).sum());
    }
}
