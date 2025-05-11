
package com.mycompany.sistemabiblioteca_guilherme_2a;

public class Administrador {
    
    // atributos do ADM
    private int id;
    private String nome;
    private String email;
    private String cargo;
    // construtor do ADM
    public Administrador(int id, String nome, String email, String cargo){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;}
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
    public String getCargo(){
        return cargo;
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
      public void setCargo(String cargo){
        this.cargo = cargo;
    }  
}

    

