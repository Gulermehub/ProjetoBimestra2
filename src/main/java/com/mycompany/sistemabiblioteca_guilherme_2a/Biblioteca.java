
package com.mycompany.sistemabiblioteca_guilherme_2a;
import java.util.ArrayList;

public class Biblioteca {
    //Listas para guardar objetos de cada classe
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>(); 
    private ArrayList<Administrador> administradores = new ArrayList<>();
    // listas 'ArrayLists" permitem eu armazenar dados das classes sem um limite definido 
    
    // metodo para cadastrar livros
    public void cadastrarLivro(Livro novoLivro) {
    for (Livro l : livros) { // ve entre todos os livros registrados
               if (l.getIsbn()== novoLivro.getIsbn()) { // ve se o isbn desse livro que queremos registrar é igual a um ja registrado
                   System.out.println("ISBN já registrado.");
                   return; //se for igual ele vai so retornar nada
    }
        }
    livros.add(novoLivro); // se não encontrou, adiciona o novo livro
    System.out.println("Livro cadastrado com sucesso");
    }
    //metodo para cadastrar um usuario
    public void cadastrarUsuario (Usuario novoUsuario) {
    for (Usuario u : usuarios){ // ve entre todos os usuarios registrados
        if (u.getId() == novoUsuario.getId()){ // ve se o id do usuario que queremos registrar já esta sendo usado
            System.out.println("ID já esta sendo usado.");
            return; 
        }
    }
    usuarios.add(novoUsuario); // registra o usuario se for diferente
        System.out.println("Usuario cadastrado."); 
    }
    //metodo para cadastrar um administrador 
    public void cadastrarAdministrador (Administrador novoAdministrador) {
    for (Administrador a : administradores){ // ve entre todos os ADMS registrados
        if (a.getId() == novoAdministrador.getId()){ // ve se o id do ADM que queremos registrar já esta sendo usado
            System.out.println("ID já esta sendo usado.");
            return; 
        }
    }
    administradores.add(novoAdministrador); // registra o ADM se for diferente
        System.out.println("Administrador cadastrado."); 
    }
    //listagem de livros, usuarioss, administradores
    
    //LIVROS
    public void listarLivros(){
        if (livros.isEmpty()){ // se a lista estiver vazia
            System.out.println("Não há livros cadastrados");
        }else {
            for (Livro L : livros){ // para cada lviro na lista
                System.out.println(" Livro: " +L.getTitulo() +
                                   " Autor; " +L.getAutor()+
                                   " Ano: "+ L.getAno()+
                                   " ISBN: "+ L.getIsbn()); // exiba um livro
            }
        
        }
    }
   //USUARIOS
    public void listarUsuarios(){
        if (usuarios.isEmpty()){ // se a lista estiver vazia
            System.out.println("Não há usuarios cadastrados");
        }else {
            for (Usuario U : usuarios){ // para cada usuario na lista
                System.out.println(" Usuario: " +U.getNome() +
                                   " Email; " +U.getEmail()+
                                   " ID: "+ U.getId()); // exiba um livro
            }
        
        }
    }
    
    //ADMINISTRADORES
    public void listarAdministradores(){
        if (administradores.isEmpty()){ // se a lista estiver vazia
            System.out.println("Não há administradores cadastrados");
        }else {
            for (Administrador A : administradores){ // para cada usuario na lista
                System.out.println(" Administrador: " +A.getNome() +
                                   " Email; " +A.getEmail()+
                                   " ID: "+ A.getId()+
                                   " Cargo: "+A.getCargo()); // exiba um livro
            }
        
        }
    }
    
    //METODOS PARA EMPRESTAR LIVROS
    public void emprestarLivros(int isbn, int usuarioId){
        
       //antes de emprestar para o usuario é necessario certas verificações, se o programa acha o livro e ja foi emprestado
        Livro livro = null; // esse null define que o livro não foi encontrado por padrão que mudará se for encontrado
        for (Livro L : livros){ // para cada livro em livros
           if (L.getIsbn() == isbn) {  // Comparando os ISBNs
            livro = L; //se encontrou atribui pro L o livro encontrado
            break; // encontrou, verificamos que o livro existe
        }
        
    } 
        //agora se o livro não foi encontrado
        if (livro == null) {
            System.out.println("Livro não encontrado");
         return;
        }
        
        //Agora verificaremos se o livro já foi emprestado
        if (livro.isDisponivel() == false){ //se não estiver disponivel 
            System.out.println("Livro ainda não foi emprestado");
            return;
        }
       
       //antes de emprestarmos temos que verificar se o usuario que quer emprestar realmente existe
       Usuario usuario = null; // por padrão ele não existe
        for (Usuario u : usuarios){ // para usuario u em usuarios
            if (u.getId() == usuarioId){ // se o id do usuario u for igual ao id de um usuario que já existe então ele existe
                usuario = u;
                break;
            }
        }
        //caso o usuario realmente não exista
        if (usuario == null){
            System.out.println("Usuario não encontrado");
            return;
        }
       //Finalmente, se passou por esses dois requisitos o livro pode ser emprestado
       livro.setDisponivel(false); // livro não está mais disponivel
       System.out.println("Livro " + livro.getTitulo() + " emprestado para " + usuario.getNome() );
       
    }

   


}
