import Model.Employee;

import java.util.List;
import java.util.stream.DoubleStream;

public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public double totalSalary(List<Employee> employees) {
        return employees.stream().mapToDouble(Employee::getSalary).sum();
    }

    @Override
    public void totalBonus(List<Employee> employeesBonus) {

    }
}
