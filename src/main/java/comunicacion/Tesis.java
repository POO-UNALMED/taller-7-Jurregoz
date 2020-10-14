package comunicacion;

public class Tesis extends Escrito {

    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos,
            String conclusion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.idea = idea;
        this.interpretacion = interpretacion;
        this.referencias = referencias;
    }

    public void setIdea(String idea) {
        this.idea=idea;
    }

    public String getIdea() {
        return idea;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int palabrasPagina) {
        return this.getPaginas()*5*palabrasPagina;
    }

    public String interpretacion() {
        return interpretacion;
    }

    public String toString() {
        String comp = this.resumen()+"\n"+idea+"\n"+String.valueOf(argumentos.length)+"\n"+conclusion+"\n"+referencias;
        return comp;
    }
}
