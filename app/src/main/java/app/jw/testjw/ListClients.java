package app.jw.testjw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListClients extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_clients);
//        setTitle("Tus Clientes");
    }

    private void openForm(){
        Intent intent = new Intent(this, Form.class);
        startActivity(intent);
    }
}
