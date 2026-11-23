/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author isabe
 */
public class Raca {
    private int idRaca;
    private String nome;
    private String tipoAnimal;
    private boolean status;
    
    //getters

    public int getId() {
        return idRaca;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public boolean isStatus() {
        return status;
    }
    
    //setters
    public void setId(int idRaca) {
        this.id = idRaca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //constructor
    public Raca(int id, String nome, String tipoAnimal, boolean status) {
        this.id = id;
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.status = status;
    }
}
