
package com.mycompany.sistemabiblioteca_guilherme_2a;

public class Administrador {
    
    // atributos do ADM
    private int idAdm;
    private String nomeAdm;
    private String emailAdm;
    private String cargo;
    // construtor do ADM
    public Administrador(int idAdm, String nomeAdm, String emailAdm, String cargo){
        this.idAdm = idAdm;
        this.nomeAdm = nomeAdm;
        this.emailAdm = emailAdm;
        this.cargo = cargo;}
    // getters para cada atributo 
    public int getId(){
        return idAdm;
       
    }
    public String getNome(){
        return nomeAdm;
    }
    public String getEmail(){
        return emailAdm;
    }
    public String getCargo(){
        return cargo;
    }
    //setters para cada atributo
    
    public void setId(int id){
        this.idAdm = id;
    }
     public void setNome(String nome){
        this.nomeAdm = nome;
    }
      public void setEmail(String email){
        this.emailAdm = email;
    }
      public void setCargo(String cargo){
        this.cargo = cargo;
    }  
}

    

