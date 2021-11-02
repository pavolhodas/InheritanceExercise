public abstract class Employee{
    String employeeType;
    float salary;
    int bonus;

    public Employee(String employeeType, float salary, int bonus) {
        this.employeeType = employeeType;
        this.salary = salary;
        this.bonus = bonus;
    }

    public void getInfo(){
        System.out.println(employeeType + "'s salary is " + salary + " and bonus is " + bonus);
    }

    EmployeeType e = EmployeeType.TEACHER;

//    enum EmployeeType {
//        EMPLOYEE("Programmer" ,1200, 50);
//
//        float salary;
//        int bonus;
//        String employeeType;
//
//        EmployeeType(String employee, float s, int b) {
//            salary = s;
//            bonus = b;
//            employeeType = employee;
//        }
//
//        public void getEmployeeInfo() {
//            System.out.println(EmployeeType.EMPLOYEE.employeeType + " salary is " + EmployeeType.EMPLOYEE.salary + " and bonus is " + EmployeeType.EMPLOYEE.bonus);
//        }
//    }


//    public static void main(String[] args) {
//        EmployeeType.EMPLOYEE.getEmployeeInfo();
//    }
}
