package com.amsa.medicine;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Data extends AppCompatActivity {

    TextView empty_tv,data_tv;
    Button home_bt;
    private static String emptylist="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        empty_tv=(TextView)findViewById(R.id.emptylist_tv);
        data_tv=(TextView)findViewById(R.id.data_tv);
        home_bt=(Button) findViewById(R.id.bt_home);
        empty_tv.setMovementMethod(new ScrollingMovementMethod());
        data_tv.setMovementMethod(new ScrollingMovementMethod());

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference emptymorningref = database.getReference("Empty/morning");
        final DatabaseReference emptynoonref = database.getReference("Empty/noon");
        final DatabaseReference emptynightref = database.getReference("Empty/night");

        final DatabaseReference dataref = database.getReference("Data");


        empty_tv.setText("");
        emptymorningref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                try {
//                    emptylist="";
                    empty_tv.setText("");
//                    Toast.makeText(MainActivity.this,dataSnapshot.getValue(String.class),Toast.LENGTH_LONG).show();
                    empty_tv.append(dataSnapshot.getValue(String.class)+"\n");
//                    emptylist+=dataSnapshot.getValue(String.class)+"\n";
                }catch (Exception e){

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        emptynoonref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                try {
//                    Toast.makeText(MainActivity.this,dataSnapshot.getValue(String.class),Toast.LENGTH_LONG).show();
                    empty_tv.append(dataSnapshot.getValue(String.class)+"\n");
//                    emptylist+=dataSnapshot.getValue(String.class)+"\n";
                }catch (Exception e){

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        emptynightref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                try {
//                    Toast.makeText(MainActivity.this,dataSnapshot.getValue(String.class),Toast.LENGTH_LONG).show();
                    empty_tv.append(dataSnapshot.getValue(String.class)+"\n");
//                    emptylist+=dataSnapshot.getValue(String.class)+"\n";

                }catch (Exception e){


                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

//        emptylist="";

        dataref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                data_tv.setText("");
//                empty_tv.setText(emptylist);
                data_tv.append("------- Previous data ------\n");

                for(DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()){
                    data_tv.append(dataSnapshot1.getValue().toString()+"\n");
                }
//                data_tv.setText("");
//                empty_tv.setText("");
//                startActivity(getIntent());

            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }

        });

        home_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Data.this,MainActivity.class);
//                startActivity(intent);

            }
        });

    }
}


    