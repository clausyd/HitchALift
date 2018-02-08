package ie.wit.hitchalift;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by clausyd on 08/02/18.
 */

public class JourneyManager {

    private List<Journey> journeyList;

    public JourneyManager() {journeyList = new ArrayList<Journey>();
    }

    public boolean journey(Journey journeyIn) {
        Journey journey = journeyIn;

            journeyList.add(journey);
            return true;
    }

//    public int search(Journey jourIn) {
//
//        int index;
//        Collections.sort(journeyList, nameComparator);
//        index = Collections.binarySearch(customerList, customer, nameComparator);
//
//        return index;
//    }
//
//    public static Comparator<Customer> nameComparator = new Comparator<Customer>() {
//        public int compare(Customer a, Customer b) {
//            return a.emial.compareTo(b.emial);
//        }
//    };
}
