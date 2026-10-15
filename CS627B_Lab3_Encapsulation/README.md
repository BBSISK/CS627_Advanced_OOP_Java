The README should contain the following sections:
1. Team Members
Include:
· Student Names.  Barry Sisk  -    QianchenSun
· Student Numbers. 99110989   -     25250028
2. Project Overview
Creatd 2 classes (one student , one module) - also a Main to execute the classes
3. Design Decisions
Explain:
· To demonstrate the use of validation at classes
· The student and module classes work togther to allow for tracking of marks 
· Kept it simple to demonstrate the key concepts
4. Topic Application
Main cannot acceess the Student or Module infomration directly - must use a getter to access info , and a setter
change the values - so the getter / setters deal with inputs and get an output.
Include:
· So that they can not be modified from the Main programme 
· How getters and setters were used. 
Getters and setters can use method in main. 
· Checked that the mark was between 0 and 100

· How encapsulation improved your design.
5. Class Summary
For Student.java class provide:
· Class Name.    Student
· Purpose        Encapsulate the Student details , provide Getters and setters and printDetails ; also constructors for new students
· Main Attributes.   Student Name, Student ID , age ; Student ID was generated using a Static variable
· Main Methods.  Constructor , getName, getStudentID, getAge, setName, set StudentID , setAge, printStudentDetails

For Module.java class provide:
· Class Name. Modeul
Purpose        Encapsulate the Module details , provide Getters and setters and printDetails ; also constructors for new modeuls
· Main Attributes.   modeleName, moduleCode , credits 
· Main Methods.  Constructor , getModuleName, getModuelCode, getCredits, setModuleName, set moduleCode , setCredits, printModuleDetails

For Main.java class provide:
· Class Name. Main
Purpose Create 5 objects and use tow methods to test what Student.class and Module.class are working or not.
Main Methods: Main(), testStudentClass(), testModuleClass(), runTests().


6. Object Relationships
The Main class creates Student and Module objects. We can use getter methods to get the information and setter methods to change the information. Student and Module have their own data and methods. They use encapsulation to protect the data.
7. Running the Program
Open the terminal and run: "javac *.java"
And then run: "java Main"

Finally, we can see the following content in the terminal

Student Name: John Doe
Student Age: 20
Student ID: S12345
Updated Student Name: Jane Doe
Updated Student Age: 21
Module Name: Computer Science
Module Code: CS627B
Module Credits: 10
Updated Module Name: Advanced Computer Science
Updated Module Credits: 15

8. Reflection
In this lab, I learned how to use encapsulation in Java. I learned how to use private variables, getter and setter methods.