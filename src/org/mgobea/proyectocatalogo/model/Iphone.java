package org.mgobea.proyectocatalogo.model;

public class Iphone extends Electronico implements IProducto{
    private String color;
    private String modelo;
    private int precio;
    private double precioVenta;
    final private double GANANCIA = 1.2;

    public Iphone(String fabricante, String color, String modelo, int precio) {
        super(fabricante);
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
        this.precioVenta = precio * GANANCIA;
    }

    public String getColor() {
        return this.color;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getGANANCIA() {
        return this.GANANCIA;
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
