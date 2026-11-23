/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author isabe
 */
public class Cliente {
    private int idCliente;
    private String nome;
    private char cpf;
    private String dataNascimento;
    private char telefone;
    private String endereco;
    private String bairro;
    private String cidade;
    private String Estado;
    private boolean status;

    //getters
    public int getId() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public char getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public char getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public boolean isStatus() {
        return status;
    }
    
    //setters
    public void setId(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(char cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setTelefone(char telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String Estado) {
        this.Estado =  Estado;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //cosntructor
    public Cliente(int id, String nome, char cpf, String dataNascimento, char telefone, String endereco, String bairro, String cidade, String Estado, boolean status) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.Estado = Estado;
        this.status = status;
    }
    
}
