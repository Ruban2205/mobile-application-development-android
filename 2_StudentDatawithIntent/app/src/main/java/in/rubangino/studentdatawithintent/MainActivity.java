package in.rubangino.studentdatawithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText registerNumber, fullName, degree, mobileNumber;
    Button submitButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerNumber = findViewById(R.id.regno);
        fullName = findViewById(R.id.fullname);
        degree = findViewById(R.id.degree);
        mobileNumber = findViewById(R.id.ph_number);

        submitButton = findViewById(R.id.submit_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String regNumber = registerNumber.getText().toString();
                String fullname = fullName.getText().toString();
                String deg = degree.getText().toString();
                String phNumber = mobileNumber.getText().toString();

                Intent intent = new Intent(getApplicationContext(), resultActivity.class);

                intent.putExtra("regno", regNumber);
                intent.putExtra("fullname", fullname);
                intent.putExtra("degree", deg);
                intent.putExtra("phone", phNumber);

                startActivity(intent);
            }
        });

    }
}