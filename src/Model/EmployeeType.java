package Model;

public enum EmployeeType {
    PROGRAMMER("Programmer"), TEACHER("Teacher"), DRIVER("Driver");

    String name;
    EmployeeType(String name) {
        this.name = name;
    }
}
