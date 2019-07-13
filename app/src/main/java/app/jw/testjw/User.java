package app.jw.testjw;

import com.google.firebase.database.Exclude;

public class User {
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String FechaNacimiento;

    public User(){}

    public User(String Nombre, String Apellido, int Edad, String FechaNac){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.FechaNacimiento = FechaNac;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }


    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }


    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
}


