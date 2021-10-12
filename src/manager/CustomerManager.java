package manager;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager implements GeneralManager<Customer> {

    private List<Customer> customerList=new ArrayList<>();

    @Override
    public List<Customer> findAll() {

        return customerList;
    }

    @Override
    public void save(Customer customer) {
        customerList.add(customer);
    }


    @Override
    public void delete(int index) {
        customerList.remove(index);
    }

    public void showAll(){
        System.out.println(customerList);
    }
}
