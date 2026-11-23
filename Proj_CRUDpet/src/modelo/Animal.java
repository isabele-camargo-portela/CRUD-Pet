/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author isabe
 */
public class Animal {
    private int idAnimal;
    private String nome;
    private String dataNascimento;
    private char sexo;
    private String cor;
    private String observacoes;
    private int idCliente;
    private int idRaca;
    private boolean status;
    
    //getters
    public int getIdAnimal() {
        return idAnimal;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public String getCor() {
        return cor;
    }

    public String getObservacoes() {
        return observacoes;
    }
    
    public int getIdCliente(){
        return idCliente;
    }
    
    public int getIdRaca() {
        return idRaca;
    }

    public boolean isStatus() {
        return status;
    }
    
    //setters
    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdRaca(int idRaca) {
        this.idRaca = idRaca;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //constructor

    public Animal(int idAnimal, String nome, String dataNascimento, char sexo, String cor, String observacoes, int idCliente, int idRaca, boolean status) {
        this.idAnimal = idAnimal;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.cor = cor;
        this.observacoes = observacoes;
        this.idCliente = idCliente;
        this.idRaca = idRaca;
        this.status = status;
    }
}
