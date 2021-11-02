public class EnumClass {

    enum Employee {
        Programmer(1200, 50), Teacher(900, 100);

        float salary;
        int bonus;

        Employee(float s, int b) {
            salary = s;
            bonus = b;
        }

        public void getProgrammerInfo() {
            System.out.println("Programmer's salary is " + EnumClass.Employee.Programmer.salary + " and bonus is " + EnumClass.Employee.Programmer.bonus);
        }

        public void getTeacherInfo() {
            System.out.println("Teacher's salary is " + EnumClass.Employee.Teacher.salary + " and bonus is " + EnumClass.Employee.Teacher.bonus);
        }
    }


    public static void main(String[] args) {

        EnumClass.Employee.Teacher.getProgrammerInfo();
        EnumClass.Employee.Programmer.getTeacherInfo();
    }
}
