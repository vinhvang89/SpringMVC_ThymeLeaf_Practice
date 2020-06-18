package Com.Service;

import Com.Model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements iCustomerService {
    private static final Map<Integer, Customer> customers;
    static {
        customers = new HashMap<>();
        customers.put(1,new Customer(1,"Bin Laden","usama_handsome@Al-queda.as","Dubai"));
        customers.put(2,new Customer(2,"Lê Đình Kình","lanhtu_dongtam@gmail.com","Hanoi"));
        customers.put(3,new Customer(3,"Ngô Đình Diệm","diem_la_anh@vnrp.com","Saigon"));
        customers.put(4,new Customer(4,"Edogawa Conan","friend_of_thanatos@jav.jp","Tokyo"));
        customers.put(5,new Customer(5,"Conan the Barbarian","fucking_japan_conan@barbarian.ge","Cologe"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
