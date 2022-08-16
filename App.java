public class App {
    public static void main(String[] args) {

        //Objeto Cliente
        Cliente cli = new Cliente();

        cli.setNombre("Pedro Perez");
        cli.setEdad(25);
        cli.setTelefono("(809) 857-5426");
        cli.setCredito(2358.54);


        System.out.println("Imprimiendo Datos del Cliente: \n");

        String info = String.format(" Nombre: %s \n Edad: %d  \n Telefono: %s  \n Credito: %s", cli.getNombre(), cli.getEdad(), cli.getTelefono(), cli.getCredito());
        System.out.println(info);

        //Objeto Trabajador
        Trabajador trab = new Trabajador();

        trab.setNombre("Nicolas Rodriguez");
        trab.setEdad(25);
        trab.setTelefono("(829) 449-1886");
        trab.setSalario(3528.74);


        System.out.println(" \n \n Imprimiendo Datos del Trabajador: \n");

        String info2 = String.format(" Nombre: %s \n Edad: %d  \n Telefono: %s  \n Credito: %s", trab.getNombre(), trab.getEdad(), trab.getTelefono(), trab.getSalario());
        System.out.println(info2);

    } 
}