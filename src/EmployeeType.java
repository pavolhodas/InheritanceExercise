public enum EmployeeType {
    PROGRAMMER, TEACHER;

//    EmployeeType(String employeeName, float salary, int bonus) {
//        employeeName = employeeName;
//        salary = salary;
//        bonus = bonus;
//    }

    public class Main {
        public void main(String[] args) {
            EmployeeType myVar = EmployeeType.PROGRAMMER;

            switch (myVar) {
                case PROGRAMMER:
                    System.out.println("Low level");
                    break;
                case TEACHER:
                    System.out.println("Medium level");
                    break;
            }
        }
    }
}
