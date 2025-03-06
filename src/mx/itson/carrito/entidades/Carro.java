/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.entidades;

import mx.itson.carrito.enums.TipoColor;
import mx.itson.carrito.enums.TipoMotor;

/**
 *
 * @author ABCDE-SONY
 */
public class Carro {

    /**
     * @return the topoColor
     */
    public TipoColor getTopoColor() {
        return topoColor;
    }

    /**
     * @param topoColor the topoColor to set
     */
    public void setTopoColor(TipoColor topoColor) {
        this.topoColor = topoColor;
    }

    /**
     * @return the tipoMotor
     */
    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    /**
     * @param tipoMotor the tipoMotor to set
     */
    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    /**
     * @return the killometraje
     */
    public double getKillometraje() {
        return killometraje;
    }

    /**
     * @param killometraje the killometraje to set
     */
    public void setKillometraje(double killometraje) {
        this.killometraje = killometraje;  
    }

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
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
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
    private String color;
    private int anio;
    private String marca;
    private double killometraje;
    private TipoMotor tipoMotor;
    private TipoColor topoColor;
    
    //t=d/v
    /**
     * calcular el tiempo que tarda el auto en recorrer una distancia
     * @param distancia distancia que recorrera el carro 
     * @param velocidad velocidad ala que va el carro
     * @return tiemoi en el que llegara el carro
     */
    
    public double calcularTiempo(double distancia, double velocidad){
        this.killometraje += distancia;
        //la linea de arriba es lo mismo que esta de abajo
        //this.killometraje = killometraje + distancia
        double tiempo=distancia/velocidad;
        return tiempo;
    }
    
}
