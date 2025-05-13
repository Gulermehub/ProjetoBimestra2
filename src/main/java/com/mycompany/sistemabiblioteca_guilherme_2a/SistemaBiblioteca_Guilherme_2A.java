package com.mycompany.sistemabiblioteca_guilherme_2a;

import java.util.Scanner;

public class SistemaBiblioteca_Guilherme_2A {

    public static void main(String[] args) {

        //chamando a classe Biblioteca
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        //iniciamos um loop while pra roda o programa

        while (true) {
            //menu de opções
            System.out.println("======= Sistema de Biblioteca ===========");
            System.out.println("=======1. Cadastrar Livro ========");
            System.out.println("=======2. Cadastrar Usuário=========");
            System.out.println("=======3. Cadastrar Administradores=========");
            System.out.println("=======4. Listar Usuarios=======");
            System.out.println("=======5. Listar Administradores=======");
            System.out.println("=======6. Listar Livros=======");
            System.out.println("=======7. Emprestar Livro=======");
            System.out.println("=======0. Sair======");
            System.out.print("Escolha uma opção: ");
            int op = scanner.nextInt();
            //switch para cada opção

            switch (op) {
                case 1: // neste case iremos pedir pro usuario nos dar cada atributo do livro que quer cadastrar
                    System.out.println("Digite o ISBN; ");
                    int isbn = scanner.nextInt();
                    scanner.nextLine(); // se eu não faço isso, no caso limpar o buffer, o sistema acaba juntando os scans oque buga na hora de listar
                    
                    System.out.println("Digite o nome do Autor; ");
                    String autor = scanner.nextLine();
                    
                    System.out.println("Digite o titulo do livro; ");
                    String titulo = scanner.nextLine();
                    
                    System.out.println("Digite o ano de lançamento do livro; ");
                    int ano = scanner.nextInt();
                    scanner.nextLine(); // se eu não faço isso, no caso limpar o buffer, o sistema acaba juntando os scans oque buga na hora de listar
                    
                    Livro novoLivro = new Livro(titulo, autor, ano, isbn); // aqui pegamos todos os dados escaneados e adicionamos a um objeto e adicionamos a lista de objetos
                    biblioteca.cadastrarLivro(novoLivro);
                    System.out.println("Livro cadastrado");
                    break;
                case 2:
                    System.out.println("Digite o ID; "); // mesmo procedimento do case 1
                    int id = scanner.nextInt();
                     scanner.nextLine(); // se eu não faço isso, no caso limpar o buffer, o sistema acaba juntando os scans oque buga na hora de listar
                    
                    System.out.println("Digite o nome do Usuario; ");
                    String nome = scanner.nextLine();
                    
                    System.out.println("Digite o Email; ");
                    String email = scanner.nextLine();
                    
                    Usuario novoUsuario = new Usuario(id, nome, email);
                    biblioteca.cadastrarUsuario(novoUsuario);
                    
                    System.out.println("Usuario cadastrado");
                    break;
                case 3:
                    System.out.println("Digite o ID do ADM; ");
                    int idAdm = scanner.nextInt();
                     scanner.nextLine(); // se eu não faço isso, no caso limpar o buffer, o sistema acaba juntando os scans oque buga na hora de listar
                    
                    System.out.println("Digite o nome do ADM; ");
                    String nomeAdm = scanner.nextLine();
                    
                    System.out.println("Digite o Email; ");
                    String emailAdm = scanner.nextLine();
                    
                    System.out.println("Diga o Cargo do Administrador");
                    String cargo = scanner.nextLine();
                    
                    Administrador novoAdministrador = new Administrador(idAdm, nomeAdm, emailAdm, cargo);
                    biblioteca.cadastrarAdministrador(novoAdministrador); // mesmo procedimento do case 1
                    System.out.println("Usuario cadastrado");
                    break;
                case 4:
                    biblioteca.listarUsuarios();
                    break;
                case 5:
                    biblioteca.listarAdministradores();
                    break;
                case 6:
                    biblioteca.listarLivros(); //apenas chamamos o metodo
                    break;
                case 7:
                    System.out.println("Diga o ISBN do livro que quer emprestar"); // para emprestarmos o livro temos de saber que livro seria este, então necessitamos do isbn
                    isbn = scanner.nextInt();
                    System.out.println("Diga seu id de Usuario; ");//precisamos saber tambem para quem será emprestado o livro
                    int usuarioId = scanner.nextInt();
                    biblioteca.emprestarLivros(isbn, usuarioId); // usamos o metodo para emprestar usando esses dois fatores
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    return;

            }

        }

    }

}

