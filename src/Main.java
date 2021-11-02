public class Main {

    public static void main(String[] args) {

        Programmer programmer = new Programmer("Programmer",1200, 50);
        Teacher teacher = new Teacher("Teacher",800, 100);
        EmployeeType a = EmployeeType.PROGRAMMER;

        System.out.println(a);
        programmer.getInfo();
        teacher.getInfo();
    }
}
