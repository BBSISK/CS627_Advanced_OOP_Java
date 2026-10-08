
# Programming Module Repository

## Student Information
Name:     Barry Sisk / Aine Boland
Student Number: 

## Project Description
This project sets up a Car Sales Dealership - it will classes for Cars , Customers and Dealerships.

## How to Build & Run
(Commands to compile and run the program)

## How to Test
(If applicable — how to run any tests)


## Design Decisions
Explain:
· Why you chose this scenario.  - Fits the requirements of the brief with 3 distinct classes
· Why you selected your classes.  -  Each class represents a real entity within a Car Dealership
· How the classes relate to each other. - Customers buy cars , Dealerships have arrays of cars and arrays of customers 
· Any important design decisions you made. - 
. Add static valiable to class Car and Customer to allow for unique identification.
. Added a Boolean to track if the car status was sold (isSold) allowing for defining current stock and allocated stock
. Used an ArrayList rather than standard array for tracking Cars and customers - allowing for easier additions
. Used a toString() function with Override to allow for simplified Print statements




## Class Summary
For each class, provide:
· Class name Car
· Purpose : Container for the class car
· Main attributes :  String make, String carReg , int cost, String colour, Boolean isSold
· Main methods :   constructor , getMake() , getCarReg() , getCost(), getColour() , isSold() , setMake() , setCost(), setReg(),  setColour(), setSold() , toString()


· Class name Customer
· Purpose : Container for the customer information
· Main attributes :  int custID, String name , String phoneNumber
· Main methods :  , constructor , getCustID() , getName() , getPhoneNumber(), , setName() ,          setPhoneNumber() , toString()

· Class name Dealership
· Purpose : Container for the customer information
· Main attributes :  int dealerID, String location, String managerName
· Main methods :  constructor , getDealerID() , getLocation() , geManagerName(), , setLocation (),          setManagerName() , toString()


4. Object Interaction
Explain how objects interact within your system.
Example:
Car and Customer objects are added to a Dealership object. The Dealership class manages a collection of customers and cass
and displays information about all cars and customer in the dealership. Each car object will have a customer or none.
Each customer object can have a Car object (carPurchased) associated with it

5. Running the Program
Program will be run from main method from main.java
cd cs267-99190989
javac CS627B_Lab2_AB_BS/*.java
java Lab02.CarDealershipManager 

6. Team Collaboration
Great brainstorming on resolving challanges and understadning how classes work together
Both coded their own copies ensuring alignment to have matched copies - one in CLI and one in VScode
Both uploaded their own matched copies to the Gitlab repo
Signficant help from AB on troubleshooting errors in BBS code


7. Additional Notes

Very useful exercise in understanding class and class interactions
