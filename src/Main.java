public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer(1200, 50);
        Teacher teacher = new Teacher(800, 100);
        Driver driver = new Driver(200000, 300000);

        programmer.getInfo();
        teacher.getInfo();
        driver.getInfo();
    }
}
