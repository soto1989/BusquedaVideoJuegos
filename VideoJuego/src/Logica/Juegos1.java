
package Logica;


public class Juegos1 {
    
    private String id;
    private String codigo;
    private String titulo;

    public Juegos1() {
    }

    public Juegos1(String id, String codigo, String titulo) {
        this.id = id;
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
}
