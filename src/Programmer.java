public class Programmer extends Employee {

    public Programmer(float salary, int bonus) {
        super(EmployeeType.PROGRAMMER, salary, bonus);
    }
    private final float programmerSalary = salary + bonus;

    public void getInfo() {
        System.out.println(employeeType + "'s salary is " + programmerSalary);
    }
}
