package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private Libro[] ListaDeLibros;
    private  String NombreDeBiblioteca;
    private String Direccion;

    public String getDireccion() {
        return Direccion;
    }

    public String getNombreDeBiblioteca() {
        return NombreDeBiblioteca;
    }

    public Libro[] getListaDeLibros() {
        return ListaDeLibros;
    }

    public Biblioteca(){
        this.Direccion="Dirección";
        this.ListaDeLibros=new Libro[] {};
        this.NombreDeBiblioteca="Nombre";
    }
    public Biblioteca(String direccion, String nombre){
        this.Direccion = direccion;
        this.ListaDeLibros = new Libro[] {};
        this.NombreDeBiblioteca = nombre;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void setNombreDeBiblioteca(String nombreDeBiblioteca) {
        NombreDeBiblioteca = nombreDeBiblioteca;
    }

    public void agregarLibro(String nombrelibro, String editorial, String autor) {
        Libro libro = new Libro(autor, editorial, nombrelibro);
        ArrayList<Libro> listaLibros = new ArrayList<>();
        for (Libro libros : this.ListaDeLibros) listaLibros.add(libros);
        listaLibros.add(libro);
        this.ListaDeLibros=listaLibros.toArray(this.ListaDeLibros);
    }

    public void verLibros(){
        System.out.println("  Nombre  |  Autor   | Editorial ");
        for (Libro libro : this.ListaDeLibros){
            System.out.println(libro.getNombre() + " "
                    + libro.getAutor() + " " + libro.getEditorial());
        }
    }
}
