import Customer.Customer;
import Customer.CustomerController;
import Customer.CustomerControllerImpl;

public class App {

    private static CustomerControllerImpl customerController;


    public static void main(String [] args){

        CustomerController cust= new CustomerControllerImpl();
        Customer cust1= new Customer(0, "Tanya", "Esenina");
        Customer cust2= new Customer(0, "Inga", "Gogolya");
        cust.addCustomer(cust1);
        cust.addCustomer(cust2);
        cust.customerList();





    }
}
