/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.entidades;

/**
 *
 * @author Technologyland
 */
public class Cisterna {

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the capacidad
     */
    public double getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    private String color;
    private String marca;
    private double capacidad;
    private int modelo;
   
    /**
     * Calcula el tiempo que tarda la cisterna en llenarse.
     * @param flujoAguaMinuto Cuantos mililitros se dispensan a la cisterna por minuto
     * @param capacidadTinaco Cuantos litros soporta la cisterna
     * @return El tiempo en que tarda en llenarse la cisterna.
     */
    public double calcularTiempoLlenado(double flujoAguaMinuto, double capacidadTinaco){
        double tiempoLlenado = flujoAguaMinuto/capacidadTinaco;
        return tiempoLlenado;
    }
    
}
