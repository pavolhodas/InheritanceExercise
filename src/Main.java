import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employe = new ArrayList<>();
        employe.add(new Programmer(1200, 50));
        employe.add(new Teacher(800, 100));
        employe.add(new Driver(200000, 300000));

        employe.forEach(Employee::getInfo);

    }
}
