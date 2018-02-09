package ie.wit.hitchalift;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class Home_User_Screen_Activity extends AppCompatActivity {

    AutoCompleteTextView userScreenTo;
    AutoCompleteTextView userScreenFrom;
    TextView dateSelector;

    String journeyForm;
    String journeyTo;
    String date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__user__screen_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        userScreenFrom = findViewById(R.id.userScreenFrom);
        userScreenTo = findViewById(R.id.userScreenTo);
        dateSelector = findViewById(R.id.dateSelector);

        journeyForm = userScreenFrom.getText().toString();
        journeyTo = userScreenTo.getText().toString();
        date = dateSelector.getText().toString();







    }

}
