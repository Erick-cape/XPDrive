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
               System.out.println("Insira o codigo do produto a alterar: \n");
               int id = cs.nextInt();
               System.out.println("Informe o que deseja alterar: \n");
               System.out.println("1-nome: \n");
               System.out.println("2-tipo: \n");
               System.out.println("3-valor: \n");
               System.out.println("4-quantidade: \n");
               int opcalt = cs.nextInt();

               switch(opcalt){

                   case 1:
                       System.out.println("Insira o novo nome: \n");
                       nome = cs.nextLine();


                   case 2:
                       System.out.println("Insira o novo tipo: \n");
                       tipo = cs.nextLine();


                   case 3:
                       System.out.println("Insira o novo valor: \n");
                       valor = cs.nextDouble();


                   case 4:
                       System.out.println("Informe a quantidade atualizada: \n");
                       quantidade = cs.nextInt();

                        controller.alterar(nome,tipo,valor,quantidade);
                        break;

               }

           case 3:
               System.out.println("Informe o codigo do produto a excluir: \n");
               id = cs.nextInt();
               controller.excluir(int id);
               break;


           case 4:
               System.out.println("Lista de produtos: \n");
                controller.lista();
                break;

           case 5:
               System.out.println("Saindo... \n");


           default:
               System.out.println("Invalido! \n");


       }




   }while(opcao != 5);


        cs.close();


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

