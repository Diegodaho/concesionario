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
public class Empleado {
    //Creacion de objetos Empleado
    private int id;//variable identificador del empleado
    private String nombre;
    private String apellido;
    private String telefono;
    private long salario;//el salario depende de lo que venda
  
    
    /**
     * Constructor para crear Empleado
     * @param id id como int
     * @param nombre nombre como String
     * @param apellido apellido como String
     * @param telefono telefono como String
     * @param salario salario como long
     */
    public Empleado(int id, String nombre, String apellido, String telefono, long salario) {
        
       /*llamar constructor a la clase Concesionario*/
       
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.salario = salario;
        
      
    }
    
    /**
     * metodo para ver el Id del Empleado
     * @return Id como int
     */
    
   

    public int getId() {
        return id;
    }
    
    /**
     * metodo para actualizar el Id del trabajador
     * @param id el id nuevo
     */

    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * metodo para ver el nombre del Empleado
     * @return nombre String
     */

    public String getNombre() {
        return nombre;
    }
    /**
     * metodo para actualizar el nombre del Empleado
     * @param nombre el nombre nuevo
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * metodo para ver apellido del Empleado
     * @return apellido a String
     */

    public String getApellido() {
        return apellido;
    }
    /**
     * metodo para actualizar apellido del Empleado
     * @param apellido el apellido nuevo
     */

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * metodo para ver el telefono del Empleado
     * @return telefono a String
     */

    public String getTelefono() {
        return telefono;
    }
    
    /**
     * metodo para actualizar el Telefono del Empleado
     * @param telefono el telefono nuevo
     */

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    /**
     * metodo para ver salario del Empleado
     * @return salario Long
     */

    public long getSalario() {
        return salario;
    }
    
    /**
     * metodo para actualiza salario de Empleado 
     * @param salario de salario nuevo
     */

    public void setSalario(long salario) {
        this.salario = salario;
    }
    
    
}
