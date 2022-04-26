package net.xravn.examen1p4.model;


public class Pelicula {
    

    public Pelicula(int id, String titulo, String formato, String sala, String censura) {
        this.id = id;
        this.titulo = titulo;
        this.formato = formato;
        this.sala = sala;
        this.censura = censura;
    }

    public Pelicula() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getCensura() {
        return censura;
    }

    public void setCensura(String censura) {
        this.censura = censura;
    }


    private int id = -1;
    private String titulo;
    private String formato;
    private String sala;
    private String censura;

}
