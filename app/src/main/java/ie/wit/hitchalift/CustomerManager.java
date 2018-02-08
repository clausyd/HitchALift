package ie.wit.hitchalift;

import java.util.*;

/**
 * Created by clausyd on 08/02/18.
 */

public class CustomerManager {
    private List<Customer> customerList;

    public CustomerManager() {
        customerList = new ArrayList<Customer>();
    }

    public boolean addCustomer(Customer custIn) {
        Customer cus = custIn;
        int index = search(custIn);
        if (index == 0) {
            return false;
        } else {
            customerList.add(cus);
            return true;
        }

    }

    public int search(Customer customer) {

        int index;
        Collections.sort(customerList, nameComparator);
        index = Collections.binarySearch(customerList, customer, nameComparator);

        return index;
    }

    public static Comparator<Customer> nameComparator = new Comparator<Customer>() {
        public int compare(Customer a, Customer b) {
            return a.emial.compareTo(b.emial);
        }
    };

}
