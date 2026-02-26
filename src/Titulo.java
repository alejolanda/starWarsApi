public class Titulo implements Comparable<Titulo>{
    private String nombre;
    private int duracion;
    private int fechaDeLanzamiento;
    private int evaluaciones;
    private int calificacion;


    // creo el constructor
    public Titulo(String nombre, int duracion, int fechaDeLanzamiento, int evaluaciones, int calificacion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.evaluaciones = evaluaciones;
        this.calificacion = calificacion;
    }

    // creo el Metodo setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setEvaluaciones(int evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    // Permito que otras clases Accedan
    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getEvaluaciones() {
        return evaluaciones;
    }

    public int getCalificacion() {
        return calificacion;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
