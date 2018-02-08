package ie.wit.hitchalift;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.net.PasswordAuthentication;

public class Registration_Activity extends AppCompatActivity {

    EditText fNameBox;
    EditText lNameBox;
    EditText emailBox;
    EditText passwordBox;
    EditText rePasswordBox;
    Button submmit;

    String fName;
    String lName;
    String email;
    String password;
    String rePassword;
    CustomerManager cust = new CustomerManager();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_);

        fNameBox = findViewById(R.id.fName);
        lNameBox = findViewById(R.id.lName);
        emailBox = findViewById(R.id.email);
        passwordBox = findViewById(R.id.password);
        rePasswordBox = findViewById(R.id.retypePassword);
        submmit = findViewById(R.id.submit);



        submmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean ifCutomerAdded;
                fName = fNameBox.getText().toString();
                lName = lNameBox.getText().toString();
                email = emailBox.getText().toString();
                password = passwordBox.getText().toString();
                rePassword = rePasswordBox.getText().toString();


                //try {
                if(fNameBox.getText().toString().trim().length() >0) {
                    if (password.equals(rePassword)) {
                        Customer cus = new Customer(fName, lName, email, password);
                        ifCutomerAdded = cust.addCustomer(cus);

                        if (ifCutomerAdded == true) {
                            Toast.makeText(getApplicationContext(), "Customer Added", Toast.LENGTH_LONG).show();
                            Intent myIntent = new Intent(view.getContext(), Home_User_Screen_Activity.class);
                            startActivityForResult(myIntent, 0);

                        } else if (ifCutomerAdded == false) {
                            Toast.makeText(getApplicationContext(), "Customer Not Added", Toast.LENGTH_LONG).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Passwords Don't Match", Toast.LENGTH_LONG).show();


                    }
                }else if(lNameBox.getText().toString().trim().length() >0){
                    if (password.equals(rePassword)) {
                        Customer cus = new Customer(fName, lName, email, password);
                        ifCutomerAdded = cust.addCustomer(cus);

                        if (ifCutomerAdded == true) {
                            Toast.makeText(getApplicationContext(), "Customer Added", Toast.LENGTH_LONG).show();
                            Intent myIntent = new Intent(view.getContext(), Home_User_Screen_Activity.class);
                            startActivityForResult(myIntent, 0);

                        } else if (ifCutomerAdded == false) {
                            Toast.makeText(getApplicationContext(), "Customer Not Added", Toast.LENGTH_LONG).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Passwords Don't Match", Toast.LENGTH_LONG).show();


                    }

                }else if(emailBox.getText().toString().trim().length() >0){
                    if (password.equals(rePassword)) {
                        Customer cus = new Customer(fName, lName, email, password);
                        ifCutomerAdded = cust.addCustomer(cus);

                        if (ifCutomerAdded == true) {
                            Toast.makeText(getApplicationContext(), "Customer Added", Toast.LENGTH_LONG).show();
                            Intent myIntent = new Intent(view.getContext(), Home_User_Screen_Activity.class);
                            startActivityForResult(myIntent, 0);

                        } else if (ifCutomerAdded == false) {
                            Toast.makeText(getApplicationContext(), "Customer Not Added", Toast.LENGTH_LONG).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Passwords Don't Match", Toast.LENGTH_LONG).show();


                    }

                }else if(passwordBox.getText().toString().trim().length() >0){
                    if (password.equals(rePassword)) {
                        Customer cus = new Customer(fName, lName, email, password);
                        ifCutomerAdded = cust.addCustomer(cus);

                        if (ifCutomerAdded == true) {
                            Toast.makeText(getApplicationContext(), "Customer Added", Toast.LENGTH_LONG).show();
                            Intent myIntent = new Intent(view.getContext(), Home_User_Screen_Activity.class);
                            startActivityForResult(myIntent, 0);

                        } else if (ifCutomerAdded == false) {
                            Toast.makeText(getApplicationContext(), "Customer Not Added", Toast.LENGTH_LONG).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Passwords Don't Match", Toast.LENGTH_LONG).show();


                    }

                }else if(rePasswordBox.getText().toString().trim().length() >0){
                    if (password.equals(rePassword)) {
                        Customer cus = new Customer(fName, lName, email, password);
                        ifCutomerAdded = cust.addCustomer(cus);

                        if (ifCutomerAdded == true) {
                            Toast.makeText(getApplicationContext(), "Customer Added", Toast.LENGTH_LONG).show();
                            Intent myIntent = new Intent(view.getContext(), Home_User_Screen_Activity.class);
                            startActivityForResult(myIntent, 0);

                        } else if (ifCutomerAdded == false) {
                            Toast.makeText(getApplicationContext(), "Customer Not Added", Toast.LENGTH_LONG).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Passwords Don't Match", Toast.LENGTH_LONG).show();


                    }

                }else{
                    Toast.makeText(getApplicationContext(), "Enter Your Details", Toast.LENGTH_LONG).show();

                }
            }
        });

    }
}
