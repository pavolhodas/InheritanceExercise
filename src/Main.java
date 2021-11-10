import Model.Driver;
import Model.Employee;
import Model.Programmer;
import Model.Teacher;

import java.util.ArrayList;

public class Main extends EmployeeServiceImpl{

    public static void main(String[] args) {
        ArrayList<Employee> employee = new ArrayList<>();
        EmployeeServiceImpl emp = new EmployeeServiceImpl();
        employee.add(new Programmer(1200, 50));
        employee.add(new Teacher(800, 100));
        employee.add(new Driver(2000, 30));

        employee.forEach(Employee::getInfo);
        emp.totalSalary(employee);
        emp.totalBonus(employee);

    }
}
