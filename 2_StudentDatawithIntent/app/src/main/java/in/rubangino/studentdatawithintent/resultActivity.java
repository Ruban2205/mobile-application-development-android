package in.rubangino.studentdatawithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resultActivity extends AppCompatActivity {

    TextView registerNumber, fullName, degree, phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        registerNumber = findViewById(R.id.regno_result);
        fullName = findViewById(R.id.name_result);
        degree = findViewById(R.id.degree_result);
        phoneNumber = findViewById(R.id.phno_result);

        Intent intent = getIntent();

        String regno = intent.getStringExtra("regno");
        String fname = intent.getStringExtra("fullname");
        String deg = intent.getStringExtra("degree");
        String phone = intent.getStringExtra("phone");

        registerNumber.setText(regno);
        fullName.setText(fname);
        degree.setText(deg);
        phoneNumber.setText(phone);
    }
}