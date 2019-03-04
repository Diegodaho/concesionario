package com.mycompany.concesionario;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *esta clase es una interface que tiene en comun funciones de los tipos de carros 
 * @author tegui
 * @author Diego
 * 
 */
public abstract class Inventario {
    
    List<Carro> deportivos = new ArrayList<>();//crear list
    List<Carro> estandar = new ArrayList<>();//crear list
    List<Carro> maquinaria = new ArrayList<>();//crear list
    List<Carro> personalizados = new ArrayList<>();//crear list

    /**
     * 
     *Metodo para ver el listado de carros Depostivos
     * @return Deportivos como list
     */
    public List<Carro> getDeportivos() {
        return deportivos;
    }
    /**
     * Metodo para actualizar la lista de carros deportivos
     * @param deportivos list deportivos nuevo
     */

    public void setDeportivos(List<Carro> deportivos) {
        this.deportivos = deportivos;
    }
    /**
     * Metodo para ver  lista de carros tipo Estandar
     * @return Estandar como list
     */

    public List<Carro> getEstandar() {
        return estandar;
    }
    
    /**
     * Metodo para actualizar la lista de carros tipo Estandar
     * @param estandar list Estandar nuevo
     */

    public void setEstandar(List<Carro> estandar) {
        this.estandar = estandar;
    }
    /**
     * Metodo para ver  lista de carros tipo Maquinaria
     * @return Maquinaria como list
     */

    public List<Carro> getMaquinaria() {
        return maquinaria;
    }
    
    /**
     * Metodo para actualizar la lista de carros tipo Maquinaria
     * @param maquinaria list Maquinaria nuevo
     */

    public void setMaquinaria(List<Carro> maquinaria) {
        this.maquinaria = maquinaria;
    }
    
    /**
     * Metodo para ver  lista de carros tipo Estandar
     * @return Personalizados  como list
     */

    public List<Carro> getPersonalizados() {
        return personalizados;
    }
    
    /**
     * metodo para actualizar list carros personalizados
     * @param personalizados list personalizados nuevo
     */

    public void setPersonalizados(List<Carro> personalizados) {
        this.personalizados = personalizados;
    }
    
     /**
     * Este metodo se utiliza para Mostrar los carros de Estandar.
     * donde se envia a la clase concesinario donde se crea la personalizacion del metodo
     */
    public abstract void listarDeportivos();
    
    /**
     * Este metodo se utiliza para Mostrar los carros de Estandar.
     * donde se envia a la clase concesinario donde se crea la personalizacion del metodo
     */
    public abstract void listarEstandar();
    
    /**
     * Este metodo se utiliza para Mostrar los carros tipo Maquinaria.
     * donde se envia a la clase concesinario donde se crea la personalizacion del metodo
     */
    
    public abstract void listarMaquinaria();
    
     /**
     * Este metodo se utiliza para Mostrar los carros de Personalizados.
     * donde se envia a la clase concesinario donde se crea la personalizacion del metodo
     */
    public abstract void listarPersonalizados();
    
    
}
