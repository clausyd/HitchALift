package ie.wit.hitchalift;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class Registration_Form_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration__form_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void creatUser(){

        EditText firstNameBox;
        EditText lastNameBox;
        EditText emailBox;
        EditText passwordBox;
        EditText rePasswordBox;

        firstNameBox = findViewById(R.id.fname);
        lastNameBox = findViewById(R.id.lname);
        emailBox = findViewById(R.id.email);
        passwordBox = findViewById(R.id.password);
        rePasswordBox = findViewById(R.id.retypePassword);

        String firstName = String.valueOf(firstNameBox.getText());
        String LastName = String.valueOf(lastNameBox.getText());
        String email = String.valueOf(emailBox.getText());
        String password = String.valueOf(passwordBox.getText());
        String retypePassword = String.valueOf(rePasswordBox.getText());


    }

}
