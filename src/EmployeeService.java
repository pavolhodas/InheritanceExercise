import Model.Employee;

import java.util.List;

public interface EmployeeService {
    public double totalSalary(List<Employee> employeesSalary);

    public void totalBonus(List<Employee> employeesBonus);
}
