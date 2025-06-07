package org.xpdrive.view;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
    Scanner cs = new Scanner(System.in);

    int opcao;

   do{
       exibirMenu();
       opcao = cs.nextInt();
       cs.nextInt();

       switch (opcao){

           case 1:
               System.out.println("Insira o nome do produto: \n");
               String nome = cs.nextLine();

               System.out.println("Insira o tipo do produto: \n");
               String tipo = cs.nextLine();

               System.out.println("Informe o valor do produto: \n");
               double valor = cs.nextDouble();

               System.out.println("Informe a quantidade desejada: \n");
               int quantidade = cs.nextInt();


               break;

           case 2:




       }




   }while(opcao != 5);





    }

    public static void exibirMenu(){
        System.out.println("\n =-=-=-=-=Menu=-=-=-=--=");
        System.out.println("1- Cadastrar produto: \n");
        System.out.println("2- Alterar: \n");
        System.out.println("3- Excluir produto \n");
        System.out.println("4- Listar: \n");
        System.out.println("5- Sair: \n");
    }

}

