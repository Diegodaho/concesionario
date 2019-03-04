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
public class Carro {
    
    private int id; 
    private String placa;
    private String categoria;
    private String marca;
    private String modelo;
    private long precio;
    private int numero; 
    
    /**
     * contructor para crear un carro
     * @param id identificaion del carro
     * @param placa la placa del carro
     * @param categoria lacategoria del carro
     * @param marca la marca del carro
     * @param modelo el modelo del carro
     * @param precio el precio del carro
     * @param numero identificaion para el inventario
     */

    public Carro(int id, String placa, String categoria, String marca, String modelo, long precio, int numero) {
        /*este contrucctor es llamado a la clase  Concesionario*/
        this.id = id;
        this.placa = placa;
        this.categoria = categoria;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.numero = numero;
    }
    
    /**
     * metodo para ver el Id del carro
     * @return  id int
     */

    public int getId() {
        return id;
    }
    
    /**
     * metodo para actualizar el Id del carro
     * @param id el id nuevo
     */

    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * metodo para ver la placa del carro
     * @return placa String
     */

    public String getPlaca() {
        return placa;
    }
    
    /**
     * metodo para actulizar la placa del carro
     * @param placa  placa nuevo
     */

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    /**
     * metodo para ver la categoria del carro
     * @return categoria String
     */

    public String getCategoria() {
        return categoria;
    }
    
    /**
     * metodo para actualizar la categoria del carro
     * @param categoria categoria nuevo
     */

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    /**
     * metodo para ver marca del carro
     * @return marca String
     */

    public String getMarca() {
        return marca;
    }
    
    /**
     * metodo para actualizar marca del carro
     * @param marca marca nuevo
     */

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /**
     * metodo para ver modelo del carro
     * @return modelo String
     */

    public String getModelo() {
        return modelo;
    }
    
    /**
     * metodo para acualizar modelo del carro
     * @param modelo model nuevo
     */

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    /**
     * metodo para ver precio del carro
     * @return precio long
     */

    public long getPrecio() {
        return precio;
    }
    /**
     * metodo para actualizar el recio del carro
     * @param precio precio nuevo
     */
  

    public void setPrecio(long precio) {
        this.precio = precio;
    }
    
    /**
     * metodo para ver el numero del carro 
     * @return numero int
     */

    public int getNumero() {
        return numero;
    }
    
    /**
     * metodo para actualizar el numero del carro
     * @param numero 
     */

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
}
