package com.example.karnadevloper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Signup extends AppCompatActivity {
    private EditText textInputEmail;
    private EditText textInputPassword;
    private EditText textInputPassword_c;
    ProgressBar progressBar;
    private FirebaseAuth firebaseAuth;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       // getSupportActionBar().setTitle("Signup Form");
        setContentView(R.layout.activity_signup);

        super.onCreate(savedInstanceState);

        textInputEmail=findViewById(R.id.r_inputEmail);
textInputPassword=findViewById(R.id.r_inputPassword);
textInputPassword_c=findViewById(R.id.r_inputPAssword_c);
register=findViewById(R.id.btn_Register);
progressBar=findViewById(R.id.progressBar);

firebaseAuth=FirebaseAuth.getInstance();


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=textInputEmail.getText().toString().trim();
                String password=textInputPassword.getText().toString().trim();
                String password_c=textInputPassword_c.getText().toString().trim();

                if(TextUtils.isEmpty(email))
                {
                    Toast.makeText(Signup.this, "Please Enter Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(password))
                {
                    Toast.makeText(Signup.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(password_c))
                {
                    Toast.makeText(Signup.this, "Please Enter Confirm Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(password.length()<6)
                {
                    Toast.makeText(Signup.this, "Password too short", Toast.LENGTH_SHORT).show();
                }
                if(!(password.equals(password_c)))
                {
                    Toast.makeText(Signup.this,"Password not match", Toast.LENGTH_SHORT).show();
                }

                if(password.equals(password_c))
                {
                    progressBar.setVisibility(View.VISIBLE);
                    firebaseAuth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener(Signup.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    progressBar.setVisibility(View.GONE);
                                    if (task.isSuccessful()) {
                                    // startActivity(new Intent(getApplicationContext(),Main2Activity.class));
                                        sendEmailverification();
                                      //  Toast.makeText(Signup.this, "Registration Successfully", Toast.LENGTH_SHORT).show();
                                    } else {
                                        Toast.makeText(Signup.this, "Authentication Failed", Toast.LENGTH_SHORT).show();
                                    }


                                }
                            });
                }
             }
        });
    }
    private void sendEmailverification()
    {
        FirebaseUser firebaseUser=firebaseAuth.getCurrentUser();
        if(firebaseUser!=null)
        {
            firebaseUser.sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if(task.isSuccessful())
                    {
                        Toast.makeText(Signup.this, "Verification Mail sent", Toast.LENGTH_SHORT).show();
                        firebaseAuth.signOut();
                        finish();
                        startActivity(new Intent(getApplicationContext(),Login.class));
                    }
                    else
                    {
                        Toast.makeText(Signup.this, "Server is busy", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}
