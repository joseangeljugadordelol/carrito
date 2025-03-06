/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;

import java.util.Scanner;
import mx.itson.carrito.entidades.Cisterna;

/**
 *
 * @author Technologyland
 */
public class Main2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        Cisterna tinaquito = new Cisterna();

        System.out.println("ingresa la cantidad de agua que ingresa por minuto: ");
        double  flujoAguaMinuto = scanner.nextDouble();
        
        System.out.println("ingrese la capacidad que puede soportar la cisterna: ");
        double capacidadTinaco = scanner.nextDouble();

        double tiempo = tinaquito.calcularTiempoLlenado(flujoAguaMinuto, capacidadTinaco);
        
        System.out.println("El tiempo que tarda la cisterna en llenarse es de " + tiempo);
        
        tinaquito.setColor("Negro");
        tinaquito.setMarca("rotoplas");
        tinaquito.setCapacidad(1000);
        tinaquito.setModelo(2005);
        double tiempoLlenado = tinaquito.calcularTiempoLlenado(flujoAguaMinuto, capacidadTinaco);
        System.out.println("el tiempo que le tomara ala cisterna tinaquito de marca:"+tinaquito.getMarca() + 
                " su modelo es :"+ tinaquito.getModelo()+
                " cuyo color es :"+ tinaquito.getColor() +
                " y el tiempo de llenado es  :"+tiempoLlenado+
                " y su capacidad es de :"+ tinaquito.getCapacidad());
        
        
    
        
    }
}
