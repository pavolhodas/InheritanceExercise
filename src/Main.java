import Model.Driver;
import Model.Employee;
import Model.Programmer;
import Model.Teacher;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(new Programmer(1200, 50));
        employee.add(new Teacher(800, 100));
        employee.add(new Driver(200000, 300000));

        employee.forEach(Employee::getInfo);

    }
}
