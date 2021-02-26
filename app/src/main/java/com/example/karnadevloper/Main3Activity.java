package com.example.karnadevloper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity  {


    String sem,sub,itemValue;
  //  String[] subject;
    ArrayList<String> subject;
String[] semester = {"-:    Select Semester    :-","SEM-1","SEM-2","SEM-3","SEM-4","SEM-5","SEM-6","SEM-7","SEM-8"};
 @Override
  protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main3);

     final Spinner spinnerSemester = (Spinner)findViewById (R.id.spinnerSemester);
     final Spinner spinnerSubject = (Spinner) findViewById (R.id.spinnerSubject);
  subject=new ArrayList<>();
//     Toolbar toolbar = findViewById(R.id.toolbar);
//     setSupportActionBar(toolbar);
     itemValue=getIntent().getStringExtra("itemValue");
    // final String[] subject;
     Button Go=findViewById(R.id.go);
     Go.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent=new Intent(Main3Activity.this,Main4Activity.class);
        //     Toast.makeText(Main3Activity.this,itemValue+sem+sub, Toast.LENGTH_SHORT).show();
if(sub.equals("-:    Select Subject    :-"))
{
    Toast.makeText(Main3Activity.this, "Select Subject First", Toast.LENGTH_SHORT).show();
}

             else
             {
             intent.putExtra("itemValue",itemValue);
             intent.putExtra("sem",sem);
             intent.putExtra("sub",sub);
             startActivity(intent);
             finish();
         }}
     });


     final ArrayAdapter<String> countryAdapter =  new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, semester);
     countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
     spinnerSemester.setAdapter(countryAdapter);
     //spinnerSubject.setAdapter(countryCodeAdapter);

     spinnerSemester.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                 @Override
                 public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long arg3) {

                     sem = semester[position];
            if(itemValue.equals("Computer Engineering")){
             if (semester[position].equals("SEM-1")) {
                 subject.clear();
                 subject.add("-:    Select Subject    :-");
                 subject.add("BASICS OF ELECTRONICS & ELECTRICAL ENGINEERING");
                 subject.add("ENVIRONMENTAL SCIENCES");
                 subject.add("ENGINEERING MATHEMATICS-|");
                 subject.add("COMPUTER CONCEPTS & PROGRAMMING");
                  //subject[]={"Select Subject","BASICS OF ELECTRONICS & ELECTRICAL ENGINEERING", "ENVIRONMENTAL SCIENCES", "ENGINEERING MATHEMATICS-|", "COMPUTER CONCEPTS & PROGRAMMING"};
                 ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                 adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                 spinnerSubject.setAdapter(adapter);


                 return;
             }
             if (semester[position].equals("SEM-2")) {

                // final String subject[] = {"Select Subject","ENGINEERING PHYSICS", "ELEMENTS OF ENGINEERING", "ENGINEERING MATHEMATIC-||", "COMMUNICATION SKILLS-|", "OBJECT ORIENTED PROGRAMMING WITH C++"};
                 subject.clear();
                 subject.add("-:    Select Subject    :-");
                 subject.add("ENGINEERING PHYSICS");
                 subject.add("ELEMENTS OF ENGINEERING");
                 subject.add("ENGINEERING MATHEMATICS-||");
                 subject.add("COMMUNICATION SKILLS-|");
                 subject.add("OBJECT ORIENTED PROGRAMMING WITH C++");
                 ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                 adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                 spinnerSubject.setAdapter(adapter);

                 return;
             }
             if (semester[position].equals("SEM-3")) {
                 //final String subject[] = {"Select Subject","VALUES AND ETHICS", "DISCRETE MATHEMATICS", "DATA COMMUNICATION & NETWORKING", "DIGITAL ELECTRONICS", "JAVA PROGRAMMING"};
                 subject.clear();
                 subject.add("-:    Select Subject    :-");
                 subject.add("VALUES AND ETHICS");
                 subject.add("DISCRETE MATHEMATICS");
                 subject.add("DATA COMMUNICATION & NETWORKING");
                 subject.add("DIGITAL ELECTRONICS");
                 subject.add("JAVA PROGRAMMING");
                 ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                 adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                 spinnerSubject.setAdapter(adapter);

                 return;
             }
             if (semester[position].equals("SEM-4")) {
             // final  String  subject[] = {"Select Subject","DATA COMMUNICATION & NETWORKING", "MICROPROCESSOR & INTERFACES", "OBJECT ORIENTED PROGRAMMING WITH JAVA", "SOFTWARE ENGINEERING", "OPERATING SYSTEM"};
                 subject.clear();
                 subject.add("-:    Select Subject    :-");
                 subject.add("DATA STRUCTURE & ALGORITHMS");
                 subject.add("DATABASE MANAGEMENT SYSTEM");
                 subject.add("WEB TECHNOLOGIES");
                 subject.add("COMPUTER ORGANIZATION");
                 subject.add("OPERATING SYSTEM");
                 ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                 adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                 spinnerSubject.setAdapter(adapter);

                 return;
             }
             if (semester[position].equals("SEM-5")) {
              //  final String  subject[] = {"Select Subject","WEB PROGRAMMING", "SYSTEM SOFTWARE", "ADVANCED DATABASE MANAGEMENT SYSTEM", "DESIGN & ANALYSIS OF ALGORITHM"};
                 subject.clear();
                 subject.add("-:    Select Subject    :-");
                 subject.add("SYSTEM SOFTWARE");
                 subject.add("WEB PROGRAMMING");
                 subject.add("ADVANCED DATABASE MANAGEMENT SYSTEM");
                 subject.add("DESIGN & ANALYSIS OF ALGORITHM");
                 subject.add("PROFESSIONAL COMMUNICATION-|");
                 ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                 adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                 spinnerSubject.setAdapter(adapter);

                 return;
             }
             if (semester[position].equals("SEM-6")) {
               // final String  subject[] = {"Select Subject","THEORY OF COMMUNICATION", "COMPUTER NETWORK &INTERNETWORKING LAYERS", "CRYPTOGRAPHY & NETWORK SECURITY", "DATA WEARHOUSING & DATAMINING", "SOCIETY,GOVERNANCE & INTERNATIONAL STUDIES"};
                 subject.clear();
                 subject.add("-:    Select Subject    :-");
                 subject.add("THEORY OF COMMUNICATION");
                 subject.add("COMPUTER NETWORK & INTERNETWORKING LAYERS");
                 subject.add("CRYPTOGRAPHY & NETWORK SECURITY");
                 subject.add("DATA WEARHOUSING & DATAMINING");
                 subject.add("SOCIETY,GOVERNANCE & INTERNATIONAL STUDIES");
                 ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);

                 adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                 spinnerSubject.setAdapter(adapter);
                 return;
             }
             if (semester[position].equals("SEM-7")) {
              //  final String  subject[] = {"Select Subject","COMPUTER CONSTRUCTION", "WIRELESS COMMUNICATION & MOBILE COMPUTING", "ADVANCED COMPUTINHG", "SERVICE ORIENTED ARCHITECTURE"};
                 subject.clear();
                 subject.add("-:    Select Subject    :-");
                 subject.add("COMPUTER CONSTRUCTION");
                 subject.add("ADVANCED OPERATING SYSTEM");

                 subject.add("SERVICE ORIENTED ARCHITECTURE");
                 subject.add("WIRELESS COMMUNICATION & MOBILE COMPUTING");

                 ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                 adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                 spinnerSubject.setAdapter(adapter);

                 return;
             }
             if (semester[position].equals("SEM-8")) {
                 Toast.makeText(Main3Activity.this, "Only Practical Exam", Toast.LENGTH_SHORT).show();
             }


         }
             if(itemValue.equals("Information technology")){
                 if (semester[position].equals("SEM-1")) {
                    //final String subject[] = {"Select Subject","BASICS OF ELECTRONICS ENGINEERING", "ENVIRONMENTAL SCIENCES", "ENGINEERING MATHEMATICS-|", "COMPUTER CONCEPTS & PROGRAMMING"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");
                     subject.add("BASICS OF ELECTRONICS ENGINEERING");
                     subject.add("ENGINEERING MATHEMATICS-|");
                     subject.add("ENVIRONMENTAL SCIENCES");
                     subject.add("COMPUTER CONCEPTS & PROGRAMMING");
                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);

                     return;
                 }
                 if (semester[position].equals("SEM-2")) {
                  // final  String subject[] = {"Select Subject","ENGINEERING PHYSICS", "ELEMENTS OF ENGINEERING", "ENGINEERING MATHEMATIC-||", "COMMUNICATION SKILLS-|", "OBJECT ORIENTED PROGRAMMING WITH C++"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");
                     subject.add("ENGINEERING PHYSICS");
                     subject.add("ELEMENTS OF ENGINEERING");
                     subject.add("ENGINEERING MATHEMATIC-||");
                     subject.add("COMMUNICATION SKILLS-|");
                     subject.add("OBJECT ORIENTED PROGRAMMING WITH C++");

                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);

                     return;
                 }
                 if (semester[position].equals("SEM-3")) {
                   // final String subject[] = {"Select Subject","VALUES AND ETHICS", "DISCRETE MATHEMATICS & APPLICATION", "DATA COMMUNICATION", "DIGITAL LOGIC & DESIGN", "JAVA PROGRAMMING","FUNDAMENTAL OF MANAGEMENT"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//   subject.add("Select Subject");
                     subject.add("VALUES AND ETHICS");
                     subject.add("DISCRETE MATHEMATICS & APPLICATION");
                     subject.add("DATA COMMUNICATION");
                     subject.add("DIGITAL LOGIC & DESIGN");
                     subject.add("JAVA PROGRAMMING");

                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);

                     return;
                 }
                 if (semester[position].equals("SEM-4")) {
                   // final String subject[] = {"Select Subject","COMPUTER ORGANIZATION & MICROPROCESSOR", "WEB TECHNOLOGIES", "DATA STRUCTURES & FILES", "STATISTICAL & NUMERICAL METHODS","CRITICAL THINKING & LOGIC","DATABASE MANAGEMENT SYSTEM"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");// subject.add("Select Subject");
                     subject.add("COMPUTER ORGANIZATION & MICROPROCESSOR");
                     subject.add("WEB TECHNOLOGIES");
                     subject.add("DATA STRUCTURES & FILES");
                     subject.add("STATISTICAL & NUMERICAL METHODS");
                     subject.add("CRITICAL THINKING & LOGIC");
                     subject.add("DATABASE MANAGEMENT SYSTEM");
                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);

                     return;
                 }
                 if (semester[position].equals("SEM-5")) {
                    //final String subject[] = {"Select Subject","MODELLING SIMULATION & OPERATION RESEARCH", "ADVANCED DATABASE MANAGEMENT SYSTEM", "DESIGN & ANALYSIS OF ALGORITHM","OPERATING SYSTEM FUNDAMENTALS"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//  subject.add("Select Subject");
                     subject.add("MODELLING SIMULATION & OPERATION RESEARCH");
                     subject.add("ADVANCED DATABASE MANAGEMENT SYSTEM");
                     subject.add("DESIGN & ANALYSIS OF ALGORITHM");
                     subject.add("OPERATING SYSTEM FUNDAMENTALS");


                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);

                     return;
                 }
                 if (semester[position].equals("SEM-6")) {
                    //final String subject[] = {"Select Subject","SOFTWARE ENGINEERING", "COMPUTER NETWORKING ", "CRYPTOGRAPHY & NETWORK SECURITY",  "SOCIETY,GOVERNANCE & INTERNATIONAL STUDIES"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");// subject.add("Select Subject");
                     subject.add("SOFTWARE ENGINEERING");
                     subject.add("COMPUTER NETWORKING");
                     subject.add("CRYPTOGRAPHY & NETWORK SECURITY");
                     subject.add("SOCIETY,GOVERNANCE & INTERNATIONAL STUDIES");


                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);

                     return;
                 }
                 if (semester[position].equals("SEM-7")) {
                  //  final String subject[] = {"Select Subject","HIGH PERFORMANCE COMPUTER ARCHITECTURE","DATA WEARHOUSING & DATA MINING", "WIRELESS COMMUNICATION & MOBILE COMPUTING", "ENTERPRISE RESOURCE PLANNING & E-COMMERCE", "SERVICE ORIENTED ARCHITECTURE"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//  subject.add("Select Subject");
                     subject.add("HIGH PERFORMANCE COMPUTER ARCHITECTURE");
                     subject.add("DATA WEARHOUSING & DATA MINING");
                     subject.add("WIRELESS COMMUNICATION & MOBILE COMPUTING");
                     subject.add("ENTERPRISE RESOURCE PLANNING & E-COMMERCE");
                     subject.add("SERVICE ORIENTED ARCHITECTURE");

                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);

                     return;
                 }
                 if (semester[position].equals("SEM-8")) {
                     Toast.makeText(Main3Activity.this, "Only Practical Exam", Toast.LENGTH_SHORT).show();
                 }
             }
             if(itemValue.equals("Electronic and Communication")){

                 if (semester[position].equals("SEM-1")) {
                    // String subject[] = {"Select Subject","BASICS OF ELECTRONICS ENGINEERING", "ENVIRONMENTAL SCIENCES", "ENGINEERING MATHEMATICS-|", "COMPUTER CONCEPTS & PROGRAMMING"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//subject.add("Select Subject");
                     subject.add("BASICS OF ELECTRONICS ENGINEERING");
                     subject.add("ENVIRONMENTAL SCIENCES");
                     subject.add("ENGINEERING MATHEMATICS-|");
                     subject.add("COMPUTER CONCEPTS & PROGRAMMING");

                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-2")) {
                    // String subject[] = {"Select Subject","BASIC OF CIVIL ENGINEERING","ENGINEERING PHYSICS", "ENGLISH LANGUAGE AND LITERATURE", "ENGINEERING MATHEMATIC-||"," ENGINEERING GRAPHICS" ,"OBJECT ORIENTED PROGRAMMING WITH C++"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");// subject.add("Select Subject");
                     subject.add("BASIC OF CIVIL ENGINEERING");
                     subject.add("ENGINEERING PHYSICS");
                     subject.add("ENGLISH LANGUAGE AND LITERATURE");
                     subject.add("ENGINEERING MATHEMATIC-||");
                     subject.add("ENGINEERING GRAPHICS");
                     subject.add("OBJECT ORIENTED PROGRAMMING WITH C++");
                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-3")) {
                   //  String subject[] = {"Select Subject","VALUES AND ETHICS", "ENGINEERING MATHEMATICS-|||", "NETWORK THEORY","SOLID STATE ELECTRONICS" ,"ELECTRONICS INSTRUMENT & MEASURMENT","DIGITAL ELECTRONICS & LOGIC DESIGN"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//  subject.add("Select Subject");
                     subject.add("VALUES AND ETHICS");
                     subject.add("ENGINEERING MATHEMATICS-|||");
                     subject.add("NETWORK THEORY");
                     subject.add("SOLID STATE ELECTRONICS");
                     subject.add("ELECTRONICS INSTRUMENT & MEASURMENT");
                     subject.add("DIGITAL ELECTRONICS & LOGIC DESIGN");
                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-4")) {
                   //  String subject[] = {"Select Subject","CONTROL SYSTEMS", "ANALOG ELECTRONIC CIRCUITS", "MICROPROCESSOR & INTERFACING", "ANALOG COMMUNICATION", "CRITICAL THINKING & LOGIC","ENGINEERING MATHEMATICS-|V"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//subject.add("Select Subject");
                     subject.add("CONTROL SYSTEMS");
                     subject.add("ANALOG ELECTRONIC CIRCUITS");
                     subject.add("MICROPROCESSOR & INTERFACING");
                     subject.add("ANALOG COMMUNICATION");
                     subject.add("CRITICAL THINKING & LOGIC");
                     subject.add("ENGINEERING MATHEMATICS-|V");
                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-5")) {
                   //  String subject[] = {"Select Subject","ELECTROMAGNETIC THEORY", "INTEGRATED CIRCUITS & APPLICATION", "AUDIO VIDEO ENGINEERING", "MICROCONTROLLER & APPLICATION"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");// subject.add("Select Subject");
                     subject.add("ELECTROMAGNETIC THEORY");
                     subject.add("ANALOG ELECTRONIC CIRCUITS");
                     subject.add("AUDIO VIDEO ENGINEERING");
                     subject.add("MICROCONTROLLER & APPLICATION");

                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-6")) {
                    // String subject[] = {"Select Subject","ANTENNA & WAVE PROPAGATION", "DIGITAL COMMUNICATION", "OPTICAL COMMUNICATION", "VLSI TECHNOLOGY & DESIGN", "SOCIETY,GOVERNANCE & INTERNATIONAL STUDIES"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//subject.add("Select Subject");
                     subject.add("ANTENNA & WAVE PROPAGATION");
                     subject.add("DIGITAL COMMUNICATION");
                     subject.add("OPTICAL COMMUNICATION");
                     subject.add("VLSI TECHNOLOGY & DESIGN");
                     subject.add("SOCIETY,GOVERNANCE & INTERNATIONAL STUDIES");
                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-7")) {
                    // String subject[] = {"Select Subject","DATA COMMUNICATION & NETWORKING", "RF & MICROWAVE ENGINEERING", "EMBEDDED SYSTEM", "DIGITAL SYSTEM DESIGN"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//  subject.add("Select Subject");
                     subject.add("DATA COMMUNICATION & NETWORKING");
                     subject.add("RF & MICROWAVE ENGINEERING");
                     subject.add("EMBEDDED SYSTEM");
                     subject.add("DIGITAL SYSTEM DESIGN");

                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-8")) {
                     Toast.makeText(Main3Activity.this, "Only Practical Exam", Toast.LENGTH_SHORT).show();
                 }
             }
             if(itemValue.equals("Electrical Engineering")){
                 if (semester[position].equals("SEM-1")) {
                    // String subject[] = {"Select Subject","FUNDAMENTAL OF CIVIL ENGINEERING", "FUNDAMENTAL OF COMPUTER PROGRAMMING", "ENGINEERING MATHEMATICS-|", "ENGINEERING PHYSICS","ENGINEERING GRAPHICS"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//                     subject.add("ENGINEERING GRAPHICS");
                     subject.add("FUNDAMENTAL OF CIVIL ENGINEERING");
                     subject.add("FUNDAMENTAL OF COMPUTER PROGRAMMING");
                     subject.add("ENGINEERING MATHEMATICS-|");
                     subject.add("ENGINEERING PHYSICS");
                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-2")) {
                    // String subject[] = {"Select Subject","MECHANICS OF SOLIDS","BASIC OF ELECTRONICS & ELECTRICAL ENGINEERING","ENVIRONMENTAL SCIENCES", "ENGLISH LANGUAGE AND LITERATURE", "ENGINEERING MATHEMATICS-||","FUNDAMENTAL OF MECHANICAL ENGINEERING"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//  subject.add("Select Subject");
                     subject.add("MECHANICS OF SOLIDS");
                     subject.add("BASIC OF ELECTRONICS & ELECTRICAL ENGINEERING");
                     subject.add("ENVIRONMENTAL SCIENCES");
                     subject.add("ENGLISH LANGUAGE AND LITERATURE");
                     subject.add("ENGINEERING MATHEMATICS-||");
                     subject.add("FUNDAMENTAL OF MECHANICAL ENGINEERING");
                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-3")) {
                    // String subject[] = {"Select Subject","VALUES AND ETHICS", "ENGINEERING MATHEMATICS-|||", "ANALOG ELECTRONICS","COMPUTER PROGRAMMING FOR ELECTRICAL ENGINEERING" ,"NETWORK ANALYSIS","ELECTRICAL MEASURMENT & MEASURING INSTRUMENTS"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//  subject.add("Select Subject");
                     subject.add("VALUES AND ETHICS");
                     subject.add("ENGINEERING MATHEMATICS-|||");
                     subject.add("COMPUTER PROGRAMMING FOR ELECTRICAL ENGINEERING");
                     subject.add("NETWORK ANALYSIS");
                     subject.add("ELECTRICAL MEASURMENT & MEASURING INSTRUMENTS");

                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-4")) {
                     //String subject[] = {"Select Subject","CONTROL ENGINEERING", "ELECTRICAL POWER GENERATION", "ELECTRICAL POWER SYSTEM-|", "DIGITAL ELECTRONICS & MICROPROCESSOR", "CRITICAL THINKING & LOGIC","ENGINEERING MACHINES-|"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");// subject.add("Select Subject");
                     subject.add("CONTROL ENGINEERING");
                     subject.add("ELECTRICAL POWER GENERATION");
                     subject.add("ELECTRICAL POWER SYSTEM-|");
                     subject.add("DIGITAL ELECTRONICS & MICROPROCESSOR");
                     subject.add("CRITICAL THINKING & LOGIC");
                     subject.add("ENGINEERING MACHINES-|");

                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-5")) {
                     //String subject[] = {"Select Subject","ELECTRICAL MACHINE-||", "ELECTRICAL POWER SYSTEM-||", "MICROCONTROLLER & APPLICATIONS", "INDUSTRIAL INSTRUMENTATION","POWER ELECTRONICS & DRIVES-|"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//  subject.add("Select Subject");
                     subject.add("ELECTRICAL MACHINE-||");
                     subject.add("ELECTRICAL POWER SYSTEM-||");
                     subject.add("MICROCONTROLLER & APPLICATIONS");
                     subject.add("INDUSTRIAL INSTRUMENTATION");
                     subject.add("POWER ELECTRONICS & DRIVES-|");

                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-6")) {
                   //  String subject[] = {"Select Subject","ELECTRICAL MACHINE-|||","ELECTRICAL POWER SYSTEM-|||", "HIGH VOLTAGE ENGINEERING", "ELECTRICAL POWER UTILIZATION & TRACTION", "PROGRAMMABLE LOGIC CONTROLLER & INDUSTRIAL AUTOMATION","SOCIETY,GOVERNANCE & INTERNATIONAL STUDIES"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//  subject.add("Select Subject");
                     subject.add("ELECTRICAL MACHINE-|||");
                     subject.add("ELECTRICAL POWER SYSTEM-|||");
                     subject.add("HIGH VOLTAGE ENGINEERING");
                     subject.add("ELECTRICAL POWER UTILIZATION & TRACTION");
                     subject.add("PROGRAMMABLE LOGIC CONTROLLER & INDUSTRIAL AUTOMATION");
                     subject.add("SOCIETY,GOVERNANCE & INTERNATIONAL STUDIES");

                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-7")) {
                    // String subject[] = {"Select Subject","ELECTRICAL MACHINE DESIGN-|","ELECTRICAL POWER SYSTEM-|V", "POWER ELECTRONICS & DRIVES-||", "ENERGY MANAGEMENT & CONSERVATION","POWER SYSTEM PROTECTION"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//  subject.add("Select Subject");
                     subject.add("ELECTRICAL MACHINE DESIGN-|");
                     subject.add("EELECTRICAL POWER SYSTEM-|V");
                     subject.add("POWER ELECTRONICS & DRIVES-||");
                     subject.add("ENERGY MANAGEMENT & CONSERVATION");
                     subject.add("POWER SYSTEM PROTECTION");

                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-8")) {
                    // String subject[] = {"Select Subject","ELECTRICAL MACHINE DESIGN-||", "COMMISSIONING OF ELECTRICAL EQUIPMENTS", "POWER SYSTEM STABILITY & CONTROL", "DIGITAL SIGNAL PROCESSING"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//subject.add("Select Subject");
                     subject.add("ELECTRICAL MACHINE DESIGN-||");
                     subject.add("COMMISSIONING OF ELECTRICAL EQUIPMENTS");
                     subject.add("POWER SYSTEM STABILITY & CONTROL");
                     subject.add("DIGITAL SIGNAL PROCESSING");

                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
             }
             if(itemValue.equals("Mechanical Engineering")){
                 if (semester[position].equals("SEM-1")) {
                     //String subject[] = {"Select Subject","FUNDAMENTAL OF CIVIL ENGINEERING", "FUNDAMENTAL OF COMPUTER PROGRAMMING", "ENGINEERING MATHEMATIC-||", "ENGINEERING GRAPHICS", "ENGINEERING PHYSICS"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");// subject.add("Select Subject");
                     subject.add("FUNDAMENTAL OF CIVIL ENGINEERING");
                     subject.add("FUNDAMENTAL OF COMPUTER PROGRAMMING");
                     subject.add("ENGINEERING MATHEMATIC-||");
                     subject.add("ENGINEERING GRAPHICS");
                     subject.add("ENGINEERING PHYSICS");


                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-2")) {
                    // String subject[] = {"Select Subject","ENVIRONMENTAL SCIENCES", "MECHANICS OF SOLIDS", "ENGINEERING MATHEMATIC-||", "BASICS OF ELECTRONICS & ELECTRICAL ENGINEERING", "ENGLISH LANGUAGE & LITERATURE","FUNDAMENTAL OF MECHANICAL ENGINEERING"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//  subject.add("Select Subject");
                     subject.add("ENVIRONMENTAL SCIENCES");
                     subject.add("MECHANICS OF SOLIDS");
                     subject.add("ENGINEERING MATHEMATICS-||");
                     subject.add("BASICS OF ELECTRONICS & ELECTRICAL ENGINEERING");
                     subject.add("ENGLISH LANGUAGE & LITERATURE");
                             subject.add("FUNDAMENTAL OF MECHANICAL ENGINEERING");
                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-3")) {
                     //String subject[] = {"Select Subject","STRENGTH OF MATERIALS", "VALUE AND ETHICS", "ENGINEERING MATHEMATIC-|||", "MATERIAL SCIENCES & METALLURGY", "ENGINEERING THERMODYNAMICS","THEORY OF MACHINES","MANUFACTURING PROCESSES-|"};
                     subject.clear();
                     subject.add("Select Subject");
                     subject.add("-:    Select Subject    :-");// subject.add("STRENGTH OF MATERIALS");
                     subject.add("VALUE AND ETHICS");
                     subject.add("ENGINEERING MATHEMATIC-|||");
                     subject.add("MATERIAL SCIENCES & METALLURGY");
                     subject.add("ENGINEERING THERMODYNAMICS");
                     subject.add("THEORY OF MACHINES");
                     subject.add("MANUFACTURING PROCESSES-|");
                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-4")) {
                   //  String subject[] = {"Select Subject","CRITICAL THINKING AND LOGIC", "NUMERICAL & STATISTICAL METHODS", "DESIGN CONCEPT & MACHINE DRAWING", "FLUID MECHANICS", "DYNAMICS OF MACHINE","THERMAL ENGINEERING"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");// subject.add("Select Subject");
                     subject.add("CRITICAL THINKING AND LOGIC");
                     subject.add("NUMERICAL & STATISTICAL METHODS");
                     subject.add("DESIGN CONCEPT & MACHINE DRAWING");
                     subject.add("FLUID MECHANICS");
                     subject.add("THERMAL ENGINEERING");
                     subject.add("THEORY OF MACHINES");

                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-5")) {
                   //  String subject[] = {"Select Subject","PROFESSIONAL COMMUNICATION", "MECHANICAL MEASURMENT & METROLOGY", "DYNAMICS OF COMPRESSIBLE FLOW", "HEAT & MASS TRANSFER","MECHANICAL VIBRATION","MANUFACTURING PROCESSES-||"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//.add("Select Subject");
                     subject.add("PROFESSIONAL COMMUNICATION");
                     subject.add("MECHANICAL MEASURMENT & METROLOGY");
                     subject.add("DYNAMICS OF COMPRESSIBLE FLOW");
                     subject.add("HEAT & MASS TRANSFER");
                     subject.add("MECHANICAL VIBRATION");
                     subject.add("MANUFACTURING PROCESSES-||");

                     ArrayAdapter<String> adapter =  new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-6")) {
                   //  String subject[] = {"Select Subject","REFRIGERATION & AIR CONDITIONING", "INDSUTRIAL MANAGEMENT", "DESIGN OF MACHHINE ELEMENTS-|", "PRODUCTION TECHNOLOGY", "FLUID MACHINES-|","SOCIETY,GOVERNANCE & INTERNATIONAL STUDIES"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");
                     subject.add("REFRIGERATION & AIR CONDITIONING");
                     subject.add("INDSUTRIAL MANAGEMENT");
                     subject.add("DESIGN OF MACHHINE ELEMENTS-|");
                     subject.add("PRODUCTION TECHNOLOGY");
                     subject.add("FLUID MACHINES-|");
                     subject.add("SOCIETY,GOVERNANCE & INTERNATIONAL STUDIES");
                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-7")) {
                   //  String subject[] = {"Select Subject","COMPUTER AIDED DESIGN", "PRODUCTION & OPERATION MANAGEMENT", "DESIGN OF MACHHINE ELEMENTS-||", "FLUID MACHINES-||"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");// subject.add("Select Subject");
                     subject.add("COMPUTER AIDED DESIGN");
                     subject.add("PRODUCTION & OPERATION MANAGEMENT");
                     subject.add("DESIGN OF MACHHINE ELEMENTS-||");
                     subject.add("FLUID MACHINES-||");

                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-8")) {
                   //  String subject[] = {"Select Subject","POWER PLANT ENGINEERING", "COMPUTER AIDED MANUFACTURING", "ALTERNATIVE ENERGY SOURCE", "CONTROL ENGINEERING"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//subject.add("Select Subject");
                     subject.add("POWER PLANT ENGINEERING");
                     subject.add("COMPUTER AIDED MANUFACTURING");
                     subject.add("ALTERNATIVE ENERGY SOURCE");
                     subject.add("CONTROL ENGINEERING");

                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                 }
             }
             if(itemValue.equals("Civil Engineering")){
                 if (semester[position].equals("SEM-1")) {
                     //String subject[] = {"Select Subject","FUNDAMENTAL OF CIVIL ENGINEERING", "FUNDAMENTAL OF COMPUTER PROGRAMMING", "ENGINEERING MATHEMATIC-||", "ENGINEERING GRAPHICS", "ENGINEERING PHYSICS"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");  // subject.add("Select Subject");
                     subject.add("FUNDAMENTAL OF CIVIL ENGINEERING");
                     subject.add("FUNDAMENTAL OF COMPUTER PROGRAMMING");
                     subject.add("ENGINEERING MATHEMATIC-||");
                     subject.add("ENGINEERING GRAPHICS");
                     subject.add("ENGINEERING PHYSICS");

                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-2")) {
                    // String subject[] = {"Select Subject","ENVIRONMENTAL SCIENCES", "MECHANICS OF SOLIDS", "ENGINEERING MATHEMATIC-||", "BASICS OF ELECTRONICS & ELECTRICAL ENGINEERING", "ENGLISH LANGUAGE & LITERATURE","FUNDAMENTAL OF MECHANICAL ENGINEERING"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");// subject.add("Select Subject");
                     subject.add("ENVIRONMENTAL SCIENCES");
                     subject.add("MECHANICS OF SOLIDS");
                     subject.add("ENGINEERING MATHEMATIC-||");
                     subject.add("BASICS OF ELECTRONICS & ELECTRICAL ENGINEERING");
                     subject.add("ENGLISH LANGUAGE & LITERATURE");
                     subject.add("FUNDAMENTAL OF MECHANICAL ENGINEERING");
                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-3")) {
                   //  String subject[] = {"Select Subject","SURVEYING","STRENGTH OF MATERIALS", "MATHEMATICS FOR CIVIL ENGINEERS", "BUILDING CONSTRUCTION", "FLUID MECHANICS-|","GEOLOGY FOR CIVIL ENGINEERS","VALUE AND ETHICS"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//  subject.add("Select Subject");
                     subject.add("SURVEYING");
                     subject.add("STRENGTH OF MATERIALS");
                     subject.add("MATHEMATICS FOR CIVIL ENGINEERS");
                     subject.add("BUILDING CONSTRUCTION");
                     subject.add("FLUID MECHANICS-|");
                     subject.add("VALUE AND ETHICS");
                     subject.add("GEOLOGY FOR CIVIL ENGINEERS");
                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-4")) {
                  //   String subject[] = {"Select Subject","CONCRETE TECHNOLOGY", "ADVANCED SURVEYING", "STRUCTURAL ANALYSIS-|", "FLUID MECHANICS-||", "BUILDING AND TOWN PLANNING","CRITICAL THINKING AND LOGIC"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//  subject.add("Select Subject");
                     subject.add("CONCRETE TECHNOLOGY");
                     subject.add("ADVANCED SURVEYING");
                     subject.add("STRUCTURAL ANALYSIS-|");
                     subject.add("FLUID MECHANICS-||");
                     subject.add("BUILDING AND TOWN PLANNING");
                     subject.add("CRITICAL THINKING AND LOGIC");

                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-5")) {
                     //String subject[] = {"Select Subject","STRUCTURAL ANALYSIS-||", "GEOTECHNICAL ENGINEERING-|", "ENVIRONMENTAL ENGINEERING-|", "HYDROLOGY & GROUDN WATER HYDRAULICS","BASIC TRANSPORTATION SYSTEM "};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");//   subject.add("Select Subject");
                     subject.add("STRUCTURAL ANALYSIS-||");
                     subject.add("GEOTECHNICAL ENGINEERING-|");
                     subject.add("ENVIRONMENTAL ENGINEERING-|");
                     subject.add("HYDROLOGY & GROUDN WATER HYDRAULICS");
                     subject.add("BASIC TRANSPORTATION SYSTEM");

                     ArrayAdapter<String> adapter =  new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-6")) {
                     //String subject[] = {"Select Subject","ENVIRONMENTAL ENGINEERING-||","STRUCTURAL ANALYSIS-|||","GEOTECHNICAL ENGINEERING-||", "DESIGN OF STRUCTURES-|","HIGHWAY ENGINEERING","SOCIETY,GOVERNANCE & INTERNATIONAL STUDIES"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");  //subject.add("Select Subject");
                     subject.add("ENVIRONMENTAL ENGINEERING-||");
                     subject.add("STRUCTURAL ANALYSIS-|||");
                     subject.add("GEOTECHNICAL ENGINEERING-||");
                     subject.add("DESIGN OF STRUCTURES-|");
                     subject.add("HIGHWAY ENGINEERING");
                     subject.add("SOCIETY,GOVERNANCE & INTERNATIONAL STUDIES");
                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-7")) {
                   //  String subject[] = {"Select Subject","DESIGN OF STRUCTURES-||", "IRRIGATION & HYDRAULIC STRUCTURE", "CONSTRUCTION MANAGEMENT", "PROFESSIONAL PRACTICES","ADVANCED STRUCTURAL ANALYSIS"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");// subject.add("Select Subject");
                     subject.add("DESIGN OF STRUCTURES-||");
                     subject.add("IRRIGATION & HYDRAULIC STRUCTURE");
                     subject.add("CONSTRUCTION MANAGEMENT");
                     subject.add("PROFESSIONAL PRACTICES");
                     subject.add("ADVANCED STRUCTURAL ANALYSIS");

                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                     return;
                 }
                 if (semester[position].equals("SEM-8")) {
                   //  String subject[] = {"Select Subject","STRUCTURAL DYNAMICS & EARTHQUAKE ENGINEERING", "CONSTRUCTION TECHNOLOGY"};
                     subject.clear();
                     subject.add("-:    Select Subject    :-");// subject.add("Select Subject");
                     subject.add("STRUCTURAL DYNAMICS & EARTHQUAKE ENGINEERING");
                     subject.add("CONSTRUCTION TECHNOLOGY");

                     ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, subject);
                     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                     spinnerSubject.setAdapter(adapter);
                 }
             }


             spinnerSubject.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                 @Override
                 public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                     sub=subject.get(i);
                 }

                 @Override
                 public void onNothingSelected(AdapterView<?> adapterView) {

                 }
             });

         }


         @Override
         public void onNothingSelected(AdapterView<?> arg0) {
         }

     });}
// } @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater=getMenuInflater();
//        inflater.inflate(R.menu.menu,menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch ( item.getItemId()){
//            case R.id.logout:
//                FirebaseAuth.getInstance().signOut();
//                finish();
//                startActivity(new Intent(this,Login.class));}
//        return true;
//
//    }
@Override
public  void onBackPressed()
{

   startActivity(new Intent(this,Main2Activity.class));

}

}
