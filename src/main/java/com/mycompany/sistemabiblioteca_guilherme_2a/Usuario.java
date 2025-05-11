package com.mycompany.sistemabiblioteca_guilherme_2a;

public class Usuario {
    // atributos do usuario
    private int id;
    private String nome;
    private String email;
    // construtor do usuario
    public Usuario(int id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;}
    // getters para cada atributo 
    public int getId(){
        return id;
       
    }
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    //setters para cada atributo
    
    public void setId(int id){
        this.id = id;
    }
     public void setNome(String nome){
        this.nome = nome;
    }
      public void setEmail(String email){
        this.email = email;
    }
}
