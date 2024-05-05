package org.mgobea.proyectocatalogo.model;

import java.util.Date;

public class Comics extends Libro {
    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return this.personaje;
    }

    @Override
    public Date getFechaPublicacion() {
        return super.getFechaPublicacion();
    }

    @Override
    public String getAutor() {
        return super.getAutor();
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public String getEditorial() {
        return super.getEditorial();
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
