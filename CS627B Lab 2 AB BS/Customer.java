public class Customer {     
    private int customerID;
    private String name;
    private String phoneNumber;
    private Car carPurchased;
    private static int nextCustID = 1001;

// constructor for customer with car

    public Customer( String name, String phoneNumber, Car car) {
        this.customerID = nextCustID++;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.carPurchased = car;
    }   

// constructor for customer with no car
    public Customer( String name, String phoneNumber) {
        this.customerID = nextCustID++;
        this.name = name;
        this.phoneNumber = phoneNumber; 
    }    
//getters for customer class

    public int getCustomerID() {
        return customerID;
    }


    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Car getCar() {
        return car;
    }



    // setters for customer class


    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
