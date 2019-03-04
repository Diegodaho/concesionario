/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import static com.mycompany.concesionario.Main.menu;
import java.util.Scanner;

/**
 *
 * @author tegui
 * @author Diego
 */


public class Concesionario extends Inventario{
    
   
    
    private long valor;
    private long salario;
    private long salario1;
    private long salario2;
    private long salario3;
    
   /*se llama a la clase Empleado para enviar los parametros requerido por el construcctor de la clase ya mensionada */
    Empleado empleado1 = new Empleado(1,"Juan","Lopez","320280205",salario);
    Empleado empleado2 = new Empleado(2,"Maria","Martinez","3015253045",salario1);
    Empleado empleado3 = new Empleado(3,"Luna","Caicedo","3043142057",salario2);
    Empleado empleado4 = new Empleado(4,"Juan","Quintero","3115207890",salario3);
    
  /**
   * Metodo para vender Auto
   */  
    public void venderAuto(){
        
        Scanner entrada = new Scanner(System.in);
        
        /*se agrega Cliente para saver quien compra el Auto*/
        System.out.println("Nombre de nuevo cliente: ");
        String nombre=entrada.nextLine();
        System.out.println("Apellido de nuevo cliente: ");
        String apellido=entrada.nextLine();
        System.out.println("Cedula de nuevo cliente: ");
        int cedula=entrada.nextInt();
        System.out.println("Telefono de nuevo cliente: ");
        int telefono=entrada.nextInt();
        
        /*llama a la clase Cliente para enviar los parametros  dados por consola dados el constructor*/
        Cliente cliente1 = new Cliente(cedula,nombre,apellido,telefono);
        
        System.out.println("(1) Deportivo\n(2) Estandar\n(3) Maquinaria\n(4) Personalizado: ");
        int decision =entrada.nextInt();
        /*En esta decicion de Esgoger el carro deportivo se tiene que dar la identificaion
        del vehiculo al cual desea adquirir el Cliente
        */
        if(decision == 1){
            listarDeportivos();
            System.out.println("Seleccione con el numero de identificacion su coche");
            int seleccion = entrada.nextInt();
            for(int i = 0 ; i < deportivos.size();i++) {
                if(deportivos.get(i).getId() == seleccion) {
                    valor = deportivos.get(i).getPrecio();
                } 
                else {
                    valor = 0;    
                }
            }   
        }
        
         /*En esta decicion de Esgoger el carro Estandar, se tiene que dar la identificaion
        del vehiculo al cual desea adquirir el Cliente
        */
        else if(decision == 2){
            listarEstandar();
            System.out.println("Seleccione con el numero de identificacion su coche");
            int seleccion = entrada.nextInt();
            for(int i = 0 ; i < estandar.size();i++) {
                if(estandar.get(i).getId() == seleccion) {
                    valor = estandar.get(i).getPrecio();
                } 
                else {
                    valor = 0;    
                }
            }   
        }
        
        /*En esta decicion de Esgoger el carro Tipo Maquinaria, se tiene que dar la identificaion
        del vehiculo al cual desea adquirir el Cliente
        */
        else if(decision == 3){
            listarMaquinaria();
            System.out.println("Seleccione con el numero de identificacion su coche");
            int seleccion = entrada.nextInt();
            for(int i = 0 ; i < maquinaria.size();i++) {
                if(maquinaria.get(i).getId() == seleccion) {
                    valor = maquinaria.get(i).getPrecio();
                } 
                else {
                    valor = 0;    
                }
            }   
        }
        
        /*En esta decicion de Esgoger el carro Tipo Personalizado, se tiene que dar la identificaion
        del vehiculo al cual desea adquirir el Cliente
        */
        else if(decision == 4){
            listarPersonalizados();
            System.out.println("Seleccione con el numero de identificacion su coche");
            int seleccion = entrada.nextInt();
            for(int i = 0 ; i < personalizados.size();i++) {
                if(personalizados.get(i).getId() == seleccion) {
                    valor = personalizados.get(i).getPrecio();
                } 
                else {
                    valor = 0;    
                }
            }   
        }
        else{
            menu();//esta opcion lo devuelve al menu
        }
        
        System.out.println("(1) empleado: "+empleado1.getNombre()+" "+empleado1.getApellido()+"\n(2) empleado: "+empleado2.getNombre()+" "+empleado2.getApellido()+"\n(3) empleado: "+empleado3.getNombre()+" "+empleado3.getApellido()+"\n(4) empleado: "+empleado1.getNombre()+" "+empleado1.getApellido());
        int decisione =entrada.nextInt();
        
        
        /*opciones de escoger al Empleado*/
        if(decisione == 1){
            salario = (long) (valor*0.05);
            System.out.println("el salario del empleado es: "+salario);
            menu();
        }
        else if(decisione == 2){
            salario1 = (long) (valor*0.05);
            System.out.println("el salario del empleado es: "+salario1);
            menu();
        }
        else if(decisione == 3){
            salario2 = (long) (valor*0.05);
            System.out.println("el salario del empleado es: "+salario2);
            menu();
        }
        else if(decisione == 4){
            salario3 = (long) (valor*0.05);
            System.out.println("el salario del empleado es: "+salario3);
            menu();
        }
        else{
            menu();
        }
        
        
        
        
    }
    
    /**
     * Metodo para Agregar Auto
     */
    
    public void agregarAuto(){
    
        Scanner entrada = new Scanner(System.in);
        
        /*se muestra el tipo de carro o vehiculo que hay en el concesionario (deportivo) (estandar) (maquinaria) (personalizado)*/
        System.out.println("Categoria del nuevo carro, (deportivo) (estandar) (maquinaria) (personalizado): ");
        String categoria=entrada.nextLine();
        System.out.println("Marca del nuevo carro: ");
        String marca=entrada.nextLine();
        System.out.println("Modelo del nuevo carro: ");
        String modelo=entrada.nextLine();
        System.out.println("Placa del nuevo carro: ");
        String placa=entrada.nextLine();
        System.out.println("Precio del nuevo carro: ");
        long precio=entrada.nextLong();
        System.out.println("Numero de unidades a ingresar: ");
        int numero=entrada.nextInt();
        System.out.println("Numero de identificacion del coche: ");
        int id=entrada.nextInt();
        
        /*se llama a la clase Carro para enviar los parametros dados por el constructor*/
        Carro carro1 = new Carro(id, placa, categoria, marca, modelo, precio, numero);
        
        
        /*la Categora que desea agregar al inventario de carros*/
        if ("deportivo".equals(categoria)){
           getDeportivos().add(carro1);
        }
        else if ("estandar".equals(categoria)){
           getEstandar().add(carro1);
        }
        else if ("maquinaria".equals(categoria)){
           getMaquinaria().add(carro1);
        }
        else if ("personalizado".equals(categoria)){
           getPersonalizados().add(carro1);
        }
        else{
            System.out.println ("No existe la categoria");
            menu();
        }
        menu();
    }
    
    
    /**
     * Metodo para mostrar los carros Deportivos
     * que se creo posterior mente en la clse abtracta Inventario
     * 
     */
    @Override
    public void listarDeportivos() {
        for (Carro deportivo : getDeportivos()) {
            System.out.println("Categoria: "+deportivo.getCategoria()+", Marca: "+deportivo.getMarca()+", Modelo: "+deportivo.getModelo()+", Placa: "+deportivo.getPlaca()+", Precio: "+deportivo.getPrecio());
            
        }
    }
    
    /**Metodo para mostrar los carros Estandar
     * que se creo posterior mente en la clse abtracta Inventario
     */
    @Override
    public void listarEstandar() {
        for (Carro estandar : getEstandar()) {
            System.out.println("Categoria: "+estandar.getCategoria()+", Marca: "+estandar.getMarca()+", Modelo: "+estandar.getModelo()+", Placa: "+estandar.getPlaca()+", Precio: "+estandar.getPrecio());
        }
    }
    
    /**Metodo para mostrar los carros Tipo Maquinaria
     * que se creo posterior mente en la clse abtracta Inventario
     */

    @Override
    public void listarMaquinaria() {
        for (Carro maquinaria : getMaquinaria()) {
            System.out.println("Categoria: "+maquinaria.getCategoria()+", Marca: "+maquinaria.getMarca()+", Modelo: "+maquinaria.getModelo()+", Placa: "+maquinaria.getPlaca()+", Precio: "+maquinaria.getPrecio());
        }
    }
    
    /**Metodo para mostrar los carros tipo personalizado
     * que se creo posterior mente en la clse abtracta Inventario
     */

    @Override
    public void listarPersonalizados() {
        for (Carro personalizados : getPersonalizados()) {
            System.out.println("Categoria: "+personalizados.getCategoria()+", Marca: "+personalizados.getMarca()+", Modelo: "+personalizados.getModelo()+", Placa: "+personalizados.getPlaca()+", Precio: "+personalizados.getPrecio());
        }
    }    
}
