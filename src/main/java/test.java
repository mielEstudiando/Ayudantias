import biblioteca.Biblioteca;

public class test {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Nombre", "Lugar");
        System.out.println(biblioteca.getDireccion());
        System.out.println(biblioteca.getNombreDeBiblioteca());

        biblioteca.agregarLibro("Melo","Gordo","Prueba");
        biblioteca.agregarLibro("Melo","Flaco","Prueba");

        biblioteca.verLibros();

    }
}
