

public class Main { 

    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", 20, "S12345");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentId());

        // Update student details
        student.setName("Jane Doe");
        student.setAge(21);
        System.out.println("Updated Student Name: " + student.getName());
        System.out.println("Updated Student Age: " + student.getAge());

        // Create a Module object
        Module module = new Module("Computer Science", "CS627B", 10);
        System.out.println("Module Name: " + module.getModuleName());
        System.out.println("Module Code: " + module.getModuleCode());
        System.out.println("Module Credits: " + module.getCredits());

        // Update module details
        module.setModuleName("Advanced Computer Science");
        module.setCredits(15);
        System.out.println("Updated Module Name: " + module.getModuleName());
        System.out.println("Updated Module Credits: " + module.getCredits());
    }
    
    //Test cases for Student class
    public static void testStudentClass() {
        Student student = new Student("Alice", 22, "S1001");
        student.printStudentDetails();

        // Test setting invalid name
        student.setName("");
        student.setName(null);

        // Test setting invalid age
        student.setAge(-5);
    }
    //Test cases for Module class
    public static void testModuleClass() {
        Module module = new Module("Data Structures", "CS101", 20);
        module.printModuleDetails();

        // Test setting invalid module code
        module.setModuleCode("MATH101");
        module.setModuleCode("cs102");

        // Test setting invalid credits
        module.setCredits(-10);
        module.setCredits(150);
    }

    // Run test cases
    public static void runTests() {
        System.out.println("Running Student class tests...");
        testStudentClass();
        System.out.println("\nRunning Module class tests...");
        testModuleClass();
    }
}
