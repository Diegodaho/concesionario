package com.mycompany.concesionario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tegui
 * @author Diego
 */
public class Cliente {
    
    private int cedula;
    private String nombre;
    private String apellido;
    private int telefono;
    
    /**
     * Constructor para Resivir los parametros llamados desde la clase Conesionario
     * @param cedula identificaion de cedula de ciudadania al cliente
     * @param nombre nombre del cliente
     * @param apellido apellido del cliente
     * @param telefono telefono del cliente
     */

    public Cliente(int cedula, String nombre, String apellido, int telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    
    /**
     * metodo para ver la cedula del cliente
     * @return cedula  Int
     */

    public int getCedula() {
        return cedula;
    }
    
    /**
     * metoto para actualizar la cedula del cliente
     * @param cedula la cedula nueva
     */

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    /**
     * metodo para ver el nombre del cliente
     * @return nombre String
     */

    public String getNombre() {
        return nombre;
    }
    
    /**
     * metodo para actualizar el nombre del cliente
     * @param nombre el nombre nuevo
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * metodo para ver el apellido del cliente
     * @return apellido String
     */

    public String getApellido() {
        return apellido;
    }
    
    /**
     * metodo para actualizar apellido de la clase cliente
     * @param apellido el apellido nuevo
     */

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
     * meodo para ver telefono del cliente
     * @return telefono int
     */

    public int getTelefono() {
        return telefono;
    }
    
    /**
     * metodo para actualizar el telefono de la clase cliente
     * @param telefono el telefono nuevo
     */

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
        
}
