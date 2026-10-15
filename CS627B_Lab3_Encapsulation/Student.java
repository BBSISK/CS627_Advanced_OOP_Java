

public class Student {  
    private String name;
    private int age;
    private String studentId;
    static int studentIDNumber = 1000; // Static variable to keep track of the number of Student instances

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        studentIDNumber++; // Increment the student ID number each time a Student instance is created
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("Name cannot be empty");
            return;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Please enter a positive value.");
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void printStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student ID: " + studentId);
    }

}  