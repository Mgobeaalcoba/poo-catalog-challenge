package org.mgobea.proyectocatalogo.model;

abstract public class Electronico implements IElectronico{
    private String fabricante;

    public Electronico(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return this.fabricante;
    }
}
