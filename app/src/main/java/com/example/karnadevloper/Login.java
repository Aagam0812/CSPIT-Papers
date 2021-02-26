package com.example.karnadevloper;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.Intent;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class Login extends AppCompatActivity {
    private EditText textInputEmail;
    private EditText textInputPassword;
private FirebaseAuth firebaseAuth;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);






          //  getSupportActionBar().setTitle("Login Form");
            textInputEmail = findViewById(R.id.inputEmail);
            textInputPassword = findViewById(R.id.inputPassword);
            Login = findViewById(R.id.btn_Login);

            firebaseAuth = FirebaseAuth.getInstance();


            Login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String email = textInputEmail.getText().toString().trim();
                    String password = textInputPassword.getText().toString().trim();
                    if (TextUtils.isEmpty(email)) {
                        Toast.makeText(Login.this, "Please Enter Email", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if (TextUtils.isEmpty(password)) {
                        Toast.makeText(Login.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if (password.length() < 6) {
                        Toast.makeText(Login.this, "Password too short", Toast.LENGTH_SHORT).show();
                    }

                    firebaseAuth.signInWithEmailAndPassword(email, password)
                            .addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        checkEmailVerification();
                                       // startActivity(new Intent(getApplicationContext(), Main2Activity.class));
                                      //  Toast.makeText(Login.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                                    } else {
                                        Toast.makeText(Login.this, "Login Failed", Toast.LENGTH_SHORT).show();
                                    }

                                    // ...
                                }
                            });
                }
            });

        }

@Override
public  void onBackPressed()
{
    AlertDialog.Builder builder=new AlertDialog.Builder(this);
    builder.setMessage("Do you want to Exit?")
            .setCancelable(false)
            .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                   //Login.super.onBackPressed();
                    finishAffinity();
                }
            })
            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
    AlertDialog alertDialog=builder.create();
    alertDialog.show();
}
    public void SignupForm(View view){
       //Intent intent=new Intent(this,Signup.class);
      // startActivity(intent);
       startActivity(new Intent(this,Signup.class));
    }
private void checkEmailVerification()
{
    FirebaseUser firebaseUser=firebaseAuth.getCurrentUser();
    boolean emailFlag=firebaseUser.isEmailVerified();
    if(emailFlag)
    {
        finish();
        startActivity(new Intent(getApplicationContext(),Main2Activity.class));
    }
    else
    {
        Toast.makeText(this, "Verify your email", Toast.LENGTH_SHORT).show();
        firebaseAuth.signOut();
    }
}
//public void onClick(View v)
//{
//    String email=textInputEmail.getText().toString().trim();
//    String password=textInputPassword.getText().toString().trim();
//   }
}

