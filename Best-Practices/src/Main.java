import Records.EmployeeRecord;

public class Main {
    public static void main(String[] args) {
        System.out.println("Demo for record");
        // in this, its just the same, but in the class its just one line

        EmployeeRecord employeeRecord = new EmployeeRecord("Bazen", -32434);
        // if the empNumber is negarive, the following number will be printed
        //Exception in thread "main" java.lang.IllegalArgumentException: This number can not be negative
        System.out.println(employeeRecord);
        System.out.println(employeeRecord.name());
        System.out.println(employeeRecord.empNumber());
    }
}