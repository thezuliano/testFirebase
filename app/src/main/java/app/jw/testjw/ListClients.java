package app.jw.testjw;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ListClients extends AppCompatActivity {
    ListView listView;
    ArrayList<User> list;
    ArrayAdapter<User> adapter;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_clients);

        listView = findViewById(R.id.ListView);
        user = new User();
        list = new ArrayList<User>();

        DatabaseReference db = FirebaseDatabase.getInstance().getReference("CLIENTES");

        db.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot item: dataSnapshot.getChildren()){
                    user = item.getValue(User.class);
                    list.add(user);
                }
                for (User userItem: list){
                    Log.d("vaina", userItem.getApellido() + ", " + userItem.getNombre());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void openForm(){
        Intent intent = new Intent(this, Form.class);
        startActivity(intent);
    }
}
