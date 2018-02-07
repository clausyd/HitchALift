package ie.wit.hitchalift;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Calendar;

public class Home_Screen_Activity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    AutoCompleteTextView autoCompleteTextView1;
    AutoCompleteTextView autoCompleteTextView2;
    String [] Country_Names;
    int day, month, year;
    int finalDay, finalMonth, finalYear;
    TextView date;
    ImageButton loginSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // YouTube. (2018). Android Studio Tutorial - 10 - Working with AutoCompleteTextView. [online] Available at: https://www.youtube.com/watch?v=dEhE9MMR7mg&list=PL70y70C-OGAZucFOcbWyTmXZmB4amoHP3&index=1 [Accessed 7 Feb. 2018].        autoCompleteTextView1 = findViewById(R.id.to);
        autoCompleteTextView1 = findViewById(R.id.from);
        autoCompleteTextView2 = findViewById(R.id.to);
        Country_Names = getResources().getStringArray(R.array.country);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Country_Names);
        autoCompleteTextView1.setAdapter(adapter);
        autoCompleteTextView2.setAdapter(adapter);

        loginSignUp = findViewById(R.id.loginSignUp);

        loginSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Login_Choice_Activity.class);
                startActivityForResult(myIntent, 0);
            }
        });

        //YouTube. (2018). Using Date/Time Picker Dialog in Android Studio. [online] Available at: https://www.youtube.com/watch?v=a_Ap6T4RlYU&index=9&list=PL70y70C-OGAZucFOcbWyTmXZmB4amoHP3 [Accessed 7 Feb. 2018].
        date = findViewById(R.id.dateSelector);

        date.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View veiw){
                Calendar calender = Calendar.getInstance();
                year = calender.get(Calendar.YEAR);
                month = calender.get(Calendar.MONTH);
                day = calender.get(Calendar.DAY_OF_MONTH);


                DatePickerDialog datePickerDialog = new DatePickerDialog(Home_Screen_Activity.this, Home_Screen_Activity.this,
                        day, month, year);
                datePickerDialog.show();
            }
        });
    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

        finalYear = i;
        finalMonth = i1;
        finalDay = i2;

        Calendar calendar = Calendar.getInstance();
        finalYear = calendar.get(Calendar.YEAR);
        finalMonth = calendar.get(Calendar.MONTH);
        finalDay = calendar.get(Calendar.DAY_OF_MONTH);

        date.setText(finalDay + "/" + finalMonth + "/" + finalYear);

    }
}
