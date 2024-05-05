package org.mgobea.proyectocatalogo.model;

abstract public class Producto implements IProducto{
    private int precio;
    private double precioVenta;
    final private double GANANCIA = 1.2;

    public Producto(int precio) {
        this.precio = precio;
        this.precioVenta = precio * GANANCIA;
    }

    @Override
    public int getPrecio() {
        return this.precio;
    }

    @Override
    public double getPrecioVenta() {
        return this.precioVenta;
    }
}
