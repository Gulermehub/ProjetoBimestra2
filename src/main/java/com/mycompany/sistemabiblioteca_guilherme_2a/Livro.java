package com.mycompany.sistemabiblioteca_guilherme_2a;


public class Livro {
    //atributos
    private int isbn;
    private String titulo;
    private String autor;
    private int ano;
    //atributo para ver se o livro está disponivel
    private boolean disponivel =  true; //até acabarem os livros isso é verdade, o boolean é o falso ou verdadeiro
    
    //construtor
    public Livro(String titulo, String autor, int ano, int isbn){
    this.titulo = titulo;
    this.autor = autor;
    this.ano = ano;
    this.isbn = isbn;
    }
    
    
   
    // getters para cada atributo

    public String getTitulo(){
    return titulo;
    }
    public String getAutor(){
    return autor;
    }
    public int getAno(){
    return ano;
    }
    public boolean isDisponivel(){
    return disponivel;
    }
    public int getIsbn(){
    return isbn;
    }
    // metodo setter para o disponivel, decidindo se esta ou não disponivel
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;

        }
}
