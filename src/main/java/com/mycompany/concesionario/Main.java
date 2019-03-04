/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;
import java.util.Scanner;

/**
 *
 * @author tegui
 * @author Diego
 */
public class Main {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        Concesionario concesionario = new Concesionario();
        System.out.println("(1) si desea comprar un vehiculo\n(2)si desea agregar un vehiculo\n(3)Mostrar Inventario: ");
        int decision =entrada.nextInt();
        switch(decision){
            case 1:
                concesionario.venderAuto();
                break;
                
            case 2:
                concesionario.agregarAuto();
                break;
            case 3:
                concesionario.listarDeportivos();
                concesionario.listarEstandar();
                concesionario.listarMaquinaria();
                concesionario.listarPersonalizados();
                break;
         
                
  
            default:
            System.out.println ("Numero no valido");
            menu();
        }
        
    }        
    
    public static void menu(){
        
        Scanner entrada = new Scanner(System.in);
        Concesionario concesionario = new Concesionario();
        System.out.println("(1) si desea comprar un vehiculo\n(2)si desea agregar un vehiculo\n(3)Mostrar Inventario:: ");
        int decision =entrada.nextInt();
        switch(decision){
            case 1:
                concesionario.venderAuto();
                break;
                
            case 2:
                concesionario.agregarAuto();
                break;
            case 3:
                concesionario.listarDeportivos();
                concesionario.listarEstandar();
                concesionario.listarMaquinaria();
                concesionario.listarPersonalizados();
               
                break;
                
            default:
            System.out.println ("Numero no valido");
            menu();
        }
    }
}

