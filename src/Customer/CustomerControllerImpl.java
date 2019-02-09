package Customer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomerControllerImpl implements CustomerController {

    static Map <Integer, Customer> listOfCustomer = new HashMap <Integer, Customer> ();


    @Override
    public void addCustomer(Customer customer) {
        int id=0;
        for (int key: listOfCustomer.keySet()){
            if (id<=key){
                id=key;
            }
        }

        customer.setId(id+1);
        listOfCustomer.put((id+1), customer);
        id=id+1;
    }

    @Override
    public void customerList() {
        for(Map.Entry<Integer, Customer> pair : listOfCustomer.entrySet())
        {
            Customer custList = pair.getValue();
            System.out.println(custList);
        }


    }
}
