public class Persona {
    //constructor de la clase
    public Persona() {

    }

    //Propiedades de la clase
    private String Nombre;
    private int Edad;
    private String Telefono;

    //Geters y Seters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String _nombre) {
        Nombre = _nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int _edad) {
        Edad = _edad;
    }


     public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String _telefono) {
        Telefono = _telefono;
    }

}