package org.mgobea.proyectocatalogo.main;

import org.mgobea.proyectocatalogo.model.*;

import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        // Instanciaciones de objetos del package model interface IProducto
        IProducto[] productos = new IProducto[4];
        productos[0] = new Libro(55, new Date(1987,12,17), "Mariano Gobea Alcoba", "Mi Odisea", "Planeta");
        productos[1] = new Comics(20, new Date(2005,11,5), "Lisandro Raccio", "Spidy vs Venom", "Universo", "Superman");
        productos[2] = new Comics(18, new Date(1999,8,15), "Nicole Antonella Fernandez", "Modo Citálico Tardío", "Condor", "He-man");
        productos[3] = new Libro(45, new Date(2020,10,25), "Lautaro Gobea", "El camino del guerrero", "Santillana");

        // Instanciaciones de objetos del package model interface IElectronico
        IElectronico[] electronicos = new IElectronico[3];
        electronicos[0] = new Iphone("Apple USA", "Plateado", "13", 1025);
        electronicos[1] = new Iphone("Apple Indonesia", "Dorado", "12", 780);
        electronicos[2] = new TvLCD("Samsung", 32, 500);

        // Recorro los arrays de objetos y llamo a los métodos de cada uno
        for (IProducto p: productos) {
            if (p instanceof Comics) {
                StringBuilder sb = new StringBuilder("Datos del comic: \n");
                sb.append("\nTitulo: ").append(((Comics) p).getTitulo())
                        .append("\nAutor: ").append(((Comics) p).getAutor())
                        .append("\nEditorial: ").append(((Comics) p).getEditorial())
                        .append("\nFecha de publicación: ").append(((Comics) p).getFechaPublicacion())
                        .append("\nPrecio de compra: ").append(p.getPrecio())
                        .append("\nPrecio de venta: ").append(p.getPrecioVenta())
                        .append("\nPersonaje principal del comic: ").append(((Comics) p).getPersonaje());
                System.out.println(sb);
            } else if (p instanceof Libro) {
                StringBuilder sb2 = new StringBuilder("Datos del libro: \n");
                sb2.append("\nTitulo: ").append(((Libro) p).getTitulo())
                        .append("\nAutor: ").append(((Libro) p).getAutor())
                        .append("\nEditorial: ").append(((Libro) p).getEditorial())
                        .append("\nFecha de publicación: ").append(((Libro) p).getFechaPublicacion())
                        .append("\nPrecio de compra: ").append(p.getPrecio())
                        .append("\nPrecio de venta: ").append(p.getPrecioVenta());
                System.out.println(sb2);
            }
        }

        System.out.println();

        for (IElectronico e: electronicos) {
            if (e instanceof Iphone) {
                StringBuilder sb = new StringBuilder("Datos del Iphone: \n");
                sb.append("\nModelo: ").append(((Iphone) e).getModelo())
                        .append("\nColor: ").append(((Iphone) e).getColor())
                        .append("\nPrecio de compra: ").append(((Iphone) e).getPrecio())
                        .append("\nPrecio de venta: ").append(((Iphone) e).getPrecioVenta());
                System.out.println(sb);
            } else if (e instanceof TvLCD) {
                StringBuilder sb2 = new StringBuilder("Datos del Tv LCD: \n");
                sb2.append("\nFabricante: ").append(e.getFabricante())
                        .append("\nPulgadas: ").append(((TvLCD) e).getPulgada())
                        .append("\nPrecio de compra: ").append(((TvLCD) e).getPrecio())
                        .append("\nPrecio de venta: ").append(((TvLCD) e).getPrecioVenta());
                System.out.println(sb2);
            }
        }
    }
}
