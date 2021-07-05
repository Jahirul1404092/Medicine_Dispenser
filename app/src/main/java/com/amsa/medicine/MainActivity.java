package com.amsa.medicine;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    EditText morning1_et,morning2_et,morning3_et,noon1_et,noon2_et,noon3_et,night1_et,night2_et,night3_et;
    TextView morning1_tv,morning2_tv,morning3_tv,noon1_tv,noon2_tv,noon3_tv,night1_tv,night2_tv,night3_tv;
    Button update_bt,data_bt;

    public static String  morning1_str,morning2_str,morning3_str,noon1_str,noon2_str,noon3_str,night1_str,night2_str,night3_str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        morning1_et=(EditText) findViewById(R.id.morning1_et);
        morning2_et=(EditText) findViewById(R.id.morning2_et);
        morning3_et=(EditText) findViewById(R.id.morning3_et);
        noon1_et=(EditText) findViewById(R.id.noon1_et);
        noon2_et=(EditText) findViewById(R.id.noon2_et);
        noon3_et=(EditText) findViewById(R.id.noon3_et);
        night1_et=(EditText) findViewById(R.id.night1_et);
        night2_et=(EditText) findViewById(R.id.night2_et);
        night3_et=(EditText) findViewById(R.id.night3_et);
        update_bt=(Button) findViewById(R.id.bt_update);
        data_bt=(Button) findViewById(R.id.bt_data);

        // Write a message to the database
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, W");

        final DatabaseReference morning1ref = database.getReference("Prescription/morning1");
        final DatabaseReference morning2ref = database.getReference("Prescription/morning2");
        final DatabaseReference morning3ref = database.getReference("Prescription/morning3");
        final DatabaseReference noon1ref = database.getReference("Prescription/noon1");
        final DatabaseReference noon2ref = database.getReference("Prescription/noon2");
        final DatabaseReference noon3ref = database.getReference("Prescription/noon3");
        final DatabaseReference night1ref = database.getReference("Prescription/night1");
        final DatabaseReference night2ref = database.getReference("Prescription/night2");
        final DatabaseReference night3ref = database.getReference("Prescription/night3");

        morning1ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                try {
//                    Toast.makeText(MainActivity.this,dataSnapshot.getValue(String.class),Toast.LENGTH_LONG).show();
                    morning1_et.setHint(dataSnapshot.getValue(String.class));
                }catch (Exception e){

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        morning2ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                try {
                    morning2_et.setHint(dataSnapshot.getValue(String.class));
                }catch (Exception e){

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        morning3ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                try {
                    morning3_et.setHint(dataSnapshot.getValue(String.class));
                }catch (Exception e){

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        noon1ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                try {
                    noon1_et.setHint(dataSnapshot.getValue(String.class));
                }catch (Exception e){

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        noon2ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                try {
                    noon2_et.setHint(dataSnapshot.getValue(String.class));
                }catch (Exception e){

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        noon3ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                try {
                    noon3_et.setHint(dataSnapshot.getValue(String.class));
                }catch (Exception e){

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        night1ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                try {
                    night1_et.setHint(dataSnapshot.getValue(String.class));
                }catch (Exception e){

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        night2ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                try {
                    night2_et.setHint(dataSnapshot.getValue(String.class));
                }catch (Exception e){

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        night3ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                try {
                    night3_et.setHint(dataSnapshot.getValue(String.class));

                }catch (Exception e){

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        

        update_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String morning1 = morning1_et.getText().toString();
                final String morning2 = morning2_et.getText().toString();
                final String morning3 = morning3_et.getText().toString();
                final String noon1 = noon1_et.getText().toString();
                final String noon2 = noon2_et.getText().toString();
                final String noon3 = noon3_et.getText().toString();
                final String night1 = night1_et.getText().toString();
                final String night2 = night2_et.getText().toString();
                final String night3 = night3_et.getText().toString();

                if (morning1.isEmpty() != false ) {

                }else{
                    morning1ref.setValue(morning1);
                    morning1_et.setText("");
                }
                if (morning2.isEmpty() != false ) {

                }else{
                    morning2ref.setValue(morning2);
                    morning2_et.setText("");
                }
                if (morning3.isEmpty() != false ) {

                }else{
                    morning3ref.setValue(morning3);
                    morning3_et.setText("");
                }
                if (noon1.isEmpty() != false ) {

                }else{
                    noon1ref.setValue(noon1);
                    noon1_et.setText("");
                }
                if (noon2.isEmpty() != false ) {

                }else{
                    noon2ref.setValue(noon2);
                    noon2_et.setText("");
                }
                if (noon3.isEmpty() != false ) {

                }else{
                    noon3ref.setValue(noon3);
                    noon3_et.setText("");
                }
                if (night1.isEmpty() != false ) {

                }else{
                    night1ref.setValue(night1);
                    night1_et.setText("");
                }
                if (night2.isEmpty() != false ) {

                }else{
                    night2ref.setValue(night2);
                    night2_et.setText("");
                }
                if (night3.isEmpty() != false ) {

                }else{
                    night3ref.setValue(night3);
                    night3_et.setText("");
                }

//                startActivity(getIntent());

            }
        });

        data_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Data.class);
                startActivity(intent);
            }
        });
    }
}
