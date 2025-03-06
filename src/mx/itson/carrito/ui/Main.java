/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;

import java.util.Scanner;
import mx.itson.carrito.entidades.Carro;

/**
 *
 * @author ABCDE-SONY
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingresa la distancia recorrida");
        double distancia = sc.nextDouble();
        System.out.println("ingresa la velocidad ala que viaja");
        double velocidad = sc.nextDouble();
        
        //generamos una instancia de la clase carro
        Carro bmw = new Carro();
        bmw.setMarca("BMW");
        bmw.setColor("Negro");
        bmw.setAnio(2021);
        bmw.setKillometraje(10000);
        
        //invocamos un metodo del contenido en la clase carro
        double tiempo = bmw.calcularTiempo(distancia, velocidad);
        System.out.println("el tiempo que le tomara al carro :"+bmw.getMarca() + 
                " de color :"+ bmw.getColor()+
                " cuyo modelo es :"+ bmw.getAnio() +
                " la velocidad del tiempo sera :"+tiempo+
                " y ahora su kilometraje es de :"+ bmw.getKillometraje());
        
    }
}
