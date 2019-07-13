package app.jw.testjw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Form extends AppCompatActivity {

    DatabaseReference TablaUsuarios;

    EditText nombre, apellido, edad, fechaNac;
    Button guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        setTitle("Registro de Clientes");
        nombre = findViewById(R.id.txtNombre);
        apellido = findViewById(R.id.txtApellido);
        edad = findViewById(R.id.txtEdad);
        fechaNac = findViewById(R.id.txtFechaNac);
        guardar = findViewById(R.id.btnGuardar);

        TablaUsuarios = FirebaseDatabase.getInstance().getReference().child("CLIENTES");

        guardar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                guardarNuevoUsuario();
            }
        });
    }

    public void guardarNuevoUsuario (){
        User nuevoUsuario = new User();
        nuevoUsuario.setNombre(nombre.getText().toString().trim());
        nuevoUsuario.setApellido(apellido.getText().toString().trim());
        nuevoUsuario.setEdad(Integer.parseInt(edad.getText().toString().trim()));
        nuevoUsuario.setFechaNacimiento(fechaNac.getText().toString().trim());

        TablaUsuarios.push().setValue(nuevoUsuario);
        Toast.makeText(getApplicationContext(), "Usuario agregado con éxito", Toast.LENGTH_SHORT).show();
        limpiarCampos();
    }

    public void limpiarCampos(){
        nombre.getText().clear();
        apellido.getText().clear();
        edad.getText().clear();
        fechaNac.getText().clear();
    }
}
