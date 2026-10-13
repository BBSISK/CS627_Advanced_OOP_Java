package CS627B_Lab3_Encapsulation;

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
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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