public class App {
    public static void main(String[] args) {

        Persona p = new Persona();

        p.setNombre("Nicolas Rodriguez");
        p.setEdad(36);
        p.setTelefono("(829) 449-1886");

        System.out.println("Imprimiendo Datos de la Persona: \n");

        String info = String.format(" Nombre: %s \n Edad: %d  \n Telefono: %s", p.getNombre(), p.getEdad(), p.getTelefono());
        System.out.println(info);

    } 
}