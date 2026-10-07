package CS627B_Lab2_AB_BS; 

import java.util.*;

public class Dealership {
    private int dealerID;
    private String location;
    private String managerName;
    private List<Car> carsInStock;
    private List<Customer> customers;

    private static int nextDealerID = 1000001;
   

    public Dealership(String location, String managerName) {
        this.dealerID = nextDealerID++;
        this.location = location;
        this.managerName = managerName;
        this.carsInStock = new ArrayList<>();
        this.customers = new ArrayList<>(); 
    }
//

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addCar(Car car) {
        carsInStock.add(car);
    }



    public int getDealerID() {
        return dealerID;
    }

    public String getLocation() {
        return location;
    }

    public String getManagerName() {
        return managerName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }   

    public List<Car> getCarsInStock() {
        return carsInStock;
    }


    public void setLocation(String location) {
        this.location = location;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public String toString() {
        return "Dealership ID: " + dealerID + ", Location: " + location + ", Manager: " + managerName;
    }   

}
