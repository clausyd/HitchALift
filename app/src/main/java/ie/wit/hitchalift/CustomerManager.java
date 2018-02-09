package ie.wit.hitchalift;

import android.content.Context;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.*;

import static android.content.Context.*;

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

//    public void writeArrayToFile(){
//        ObjectOutputStream outputStream;
//        //Context context = null;
//        //File directory = null;
//        String directory ="directory";
//
////        File directory = new File(Context.getFilesDir().getAbsolutePath() );
////        if(!directory.exists()){
////            directory.mkdir();
//        }
////
////        ObjectOutput out = null;
//        try {
//            //out = new ObjectOutputStream(new FileOutputStream(directory + File.separator + fileName));
//            outputStream = outputStream(directory, Context.MODE_PRIVATE);
//        outputStream.writeObject(customerList);
//            out.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}
