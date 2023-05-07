package Records;

// records are final classes used to transfer constant datas
// the class is by default final
// it gives us both constuctors, getters, equals, hashcode and toString methods
// they never have setter methods, as they are final classes, we can't alter objects already created

// in normal class, we have writeen all the getters, constructors, toString, and hashCode methods
public record EmployeeRecord(String name, int empNumber) {
    // we cant have instance variables
    // but we can have static methods and variables
    public static String names = "king";
   // public String age ="23"; // this is error

    public String toUpperCase(){
        //return name.toUpperCase(); // we can use this string methods
        return name.toUpperCase();
    }

    // we can also override the already define constructor

    // this creates the conical constructor by default
    public EmployeeRecord {
        if(empNumber <0)
            throw new IllegalArgumentException("This number can not be negative");
        // this.name = name    // by default implemented
        // this.empNumber = empNumber // by default implemented
    }

}
