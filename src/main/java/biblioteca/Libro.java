package biblioteca;

public class Libro {
    private String Nombre, Autor,
    Editorial;

    protected String getNombre() {
        return Nombre;
    }
    protected String getAutor() {
        return Autor;
    }

    protected String getEditorial() {
        return Editorial;
    }

    public Libro (){
        this.Autor = "Autor";
        this.Editorial = "Editorial";
        this.Nombre = "Nombre";
    }

    public Libro (String autor, String editorial, String nombre){
        this.Autor = autor;
        this.Editorial = editorial;
        this.Nombre = nombre;
    }

    public void setAutor(String autor) {
        if (Autor.equals(autor)) {
            Autor = autor;
            System.out.println("Autor establecido correctamente.");
        } else System.out.println("Autor ya registrado anteriormente.");
    }

    public void setEditorial(String editorial) {
        if (Editorial.equals(editorial)) {
            Editorial = editorial;
            System.out.println("Editorial establecida correctamente.");
        } else System.out.println("Editorial ya registrada anteriormente.");
    }

    public void setNombre(String nombre) {
        if (Nombre.equals(nombre)) {
            Nombre = nombre;
            System.out.println("Nombre establecido correctamente.");
        } else System.out.println("Nombre ya registrado anteriormente.");
    }
}
