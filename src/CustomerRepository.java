package Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
    Customer findById(Integer id);
    void saveOrUpdate(Customer customer);
    void delete(Integer id);
}
