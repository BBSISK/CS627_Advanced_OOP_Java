package CS627B_Lab2_AB_BS;

public class CarDealershipManager {
    
    public static void main(String[] args) {
       
        Dealership dealership = new Dealership("Maynooth", "Aine Boland");
        Car car1 = new Car("Toyota", "212-MH-001", 20000, "Red");   
        Car car2 = new Car("Honda", "212-MH-002", 22000, "Blue");
        Customer customer1 = new Customer("Barry Sisk", "0871234567", car1);
        Customer customer2 = new Customer("Sean Keane", "0879876543");


        dealership.addCar(car1);
        dealership.addCar(car2);
        dealership.addCustomer(customer1);
        dealership.addCustomer(customer2);

        customer2.setCarPurchased(car2); // Assign car2 to customer2



        System.out.println("Dealership ID: " + dealership.getDealerID());
        System.out.println("Location: " + dealership.getLocation());
        System.out.println("Manager: " + dealership.getManagerName());

            System.out.println("Customer: ");

        for(int i = 0; i < dealership.getCustomers().size(); i++) {
            System.out.println( dealership.getCustomers().get(i).toString());
        }

         System.out.println("Car in Stock: " );

        for(Car car : dealership.getCarsInStock()) {
            System.out.println(car.toString());
        }


    }


}
