package org.mgobea.proyectocatalogo.model;

public class TvLCD extends Electronico implements IProducto{
    private int pulgada;
    private int precio;
    private double precioVenta;
    final private double GANANCIA = 1.3;

    public TvLCD(String fabricante, int pulgada, int precio) {
        super(fabricante);
        this.pulgada = pulgada;
        this.precio = precio;
        this.precioVenta = precio * GANANCIA;
    }

    public int getPulgada() {
        return this.pulgada;
    }

    @Override
    public String getFabricante() {
        return super.getFabricante();
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
