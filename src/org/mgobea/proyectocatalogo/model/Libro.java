package org.mgobea.proyectocatalogo.model;

import java.util.Date;

public class Libro extends Producto implements ILibro{
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String getEditorial() {
        return this.editorial;
    }

    @Override
    public int getPrecio() {
        return super.getPrecio();
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }
}
