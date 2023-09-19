/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenu12;

import java.util.Scanner;

/**
 *
 * @author labcca
 */
public class ExamenU12 {

    public static void main(String[] args) {
        Scanner cantidad = new Scanner (System.in);
        System.out.println("ingresa el precio del producto1");
         
        double precio = cantidad.nextInt();
        final double p1 = 0.30;
        double total1 = precio * p1;
        System.out.println("El total del precio 1 es: " + total1);
        
        System.out.println("ingresa el precio del producto2");
        
        final double p2 = 0.65;
        double total2 = precio * p2;
        System.out.println("El total del precio 2 es: " + total2);
        
        
        System.out.println("ingresa el precio del producto3");
       
        final double p3 = 0.15;
        double total3 = precio * p3;
        System.out.println("El total del precio 3 es: " + total3);
    }
    
}
