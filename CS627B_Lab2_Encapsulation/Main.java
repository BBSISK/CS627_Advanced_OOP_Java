package CS627B_Lab2_Encapsulation;

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
    
}
