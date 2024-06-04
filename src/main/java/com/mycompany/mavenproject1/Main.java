/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author olive
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        InputStreamReader CapturarTeclado = new InputStreamReader (System.in);
        BufferedReader reader = new BufferedReader (CapturarTeclado);
        
        System.out.println("Programa para calcular el numero mayor de 3");
        System.out.println("Ingrese el primer numero: ");
        String strN1 = reader.readLine();
        Integer num1 = Integer.parseInt(strN1);
        System.out.println("Ingrese el segundo numero: ");
        String strN2 = reader.readLine();
        Integer num2 = Integer.parseInt(strN2);
        System.out.println("Ingrese el tercer numero: ");
        String strN3 = reader.readLine();
        Integer num3 = Integer.parseInt(strN3);
        
        Integer mayor = num1;
        
        
        if (num2 > mayor){
        mayor = num2;
        
        }
        if(num3 > mayor){
        mayor = num3;
        }
        System.out.println("El numero mayor es: " + mayor);
       
        
    }
    
}
