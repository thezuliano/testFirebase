package app.jw.testjw;

public class User {
    public String Nombre;
    public String Apellido;
    public int Edad;
    public  String FechaNacimiento;

    public User(){}

    public User(String Nombre, String Apellido, int Edad, String FechaNac){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.FechaNacimiento = FechaNac;
    }
}
