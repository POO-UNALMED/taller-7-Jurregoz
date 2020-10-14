package comunicacion;

public class Libro extends Escrito {

    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String ediccion, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.co_autor = co_autor;
        this.edicion = ediccion;
        this.editorial = editorial;
        this.interpretacion = interpretacion;
    }

    public void setCo_autor(String co_autor) {
        this.co_autor =co_autor;
    }

    public String getCo_autor() {
        return co_autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int palabrasPagina) {
        return this.getPaginas()*2*palabrasPagina;
    }

    public String interpretacion() {
        return interpretacion;
    }

    public String toString() {
        String comp = this.resumen()+"\n"+co_autor+"\n"+editorial+"\n"+edicion;
        return comp;
    }
}
