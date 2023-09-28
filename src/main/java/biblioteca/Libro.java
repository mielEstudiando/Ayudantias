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

    protected Libro (){
        this.Autor = "Autor";
        this.Editorial = "Editorial";
        this.Nombre = "Nombre";
    }

    protected Libro (String autor, String editorial, String nombre){
        this.Autor = autor;
        this.Editorial = editorial;
        this.Nombre = nombre;
    }

    private void setAutor(String autor) {
        Autor = autor;
    }

    protected void setEditorial(String editorial) {
        Editorial = editorial;
    }

    protected void setNombre(String nombre) {
        Nombre = nombre;
    }
}
