package modelo;

public class Anime {

    private int anime_id;
    private String titulo;
    private String descripcion;
    private String genero;
    private String fechaEstreno;

    public Anime(){

    }

    public Anime(int anime_id, String titulo, String descripcion, String genero, String fechaEstreno) {
        this.anime_id = anime_id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.genero = genero;
        this.fechaEstreno = fechaEstreno;
    }

    public int getAnime_id() {
        return anime_id;
    }

    public void setAnime_id(int anime_id) {
        this.anime_id = anime_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }
}
