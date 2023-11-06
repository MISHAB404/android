package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormActivity extends AppCompatActivity {
    private EditText n;
    private EditText e;
    private EditText p;
    private EditText a;
    private EditText pass;
    private EditText cpass;
    private RadioButton male;
    private RadioButton female;
    private CheckBox checkBox;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        n = findViewById(R.id.name);
        e = findViewById(R.id.email);
        p = findViewById(R.id.phone);
        a = findViewById(R.id.address);
        pass = findViewById(R.id.password);
        cpass = findViewById(R.id.cpassword);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        checkBox = findViewById(R.id.checkBox);
        loginButton = findViewById(R.id.loginButton);
    }

    public void login(View view) {
        String name = n.getText().toString().trim();
        String email = e.getText().toString().trim();
        String phone = p.getText().toString().trim();
        String address = a.getText().toString().trim();
        String password = pass.getText().toString();
        String cpassword = cpass.getText().toString();



        if (name.isEmpty()) {
            Toast.makeText(this, "Please Enter Your Name", Toast.LENGTH_SHORT).show();
        } else if (email.isEmpty()) {
            Toast.makeText(this, "Please Enter Your Email", Toast.LENGTH_SHORT).show();
        } else if (phone.isEmpty()) {
            Toast.makeText(this, "Please Enter Your Phone Number", Toast.LENGTH_SHORT).show();
        } else if (address.isEmpty()) {
            Toast.makeText(this, "Please Enter Your Address", Toast.LENGTH_SHORT).show();
        }  else if (!male.isChecked() && !female.isChecked()){
            Toast.makeText(this, "Please Choose Your Gender", Toast.LENGTH_SHORT).show();
        } else if (!checkBox.isChecked()) {
            Toast.makeText(this, "Please Check Our Terms & Condition", Toast.LENGTH_SHORT).show();
        } else if (password.isEmpty()) {
            Toast.makeText(this, "Please Enter a Password", Toast.LENGTH_SHORT).show();
        } else if (cpassword.isEmpty()) {
            Toast.makeText(this, "Please Enter Confirm Password", Toast.LENGTH_SHORT).show();
        } else if (!isValidEmail(email)) {
            Toast.makeText(this, "Please enter a valid email address", Toast.LENGTH_SHORT).show();
        } else if (!isValidPhone(phone)) {
            Toast.makeText(this, "Please enter a valid phone number", Toast.LENGTH_SHORT).show();
        } else if (password.length() < 6) {
            Toast.makeText(this, "Password Must Be Atleast 6 Characters", Toast.LENGTH_SHORT).show();
        } else if (!password.equals(cpassword)) {
            Toast.makeText(this, "Password & Confirm Password is not Matching", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Form Submitted Successfully", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isValidEmail(String email) {
        String emailPattern = "^[a-zA-Z0-9._-]+@[a-zA-Z]+\\.[a-zA-Z.]{2,5}$";
        return Pattern.matches(emailPattern, email);
    }

    private boolean isValidPhone(String phone) {
        String phonePattern = "^[0-9]{10}$";
        return Pattern.matches(phonePattern, phone);
    }
}
