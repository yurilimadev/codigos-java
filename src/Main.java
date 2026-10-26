import java.awt.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        /*
            SISTEMA DE CADASTRO DE NINJAS
        */
        int numeroDeNinjas;
        int opcao;
        Scanner teclado = new Scanner(System.in);
        System.out.println("SISTEMA DE CADASTRO DE NINJAS");
        System.out.println("Quantos Ninjas Deseja Cadastrar? ");
        numeroDeNinjas = teclado.nextInt();

        do{
            System.out.println("QUAL ACAO DESEJA FAZER?");
            System.out.println("0 - Cadastrar Ninja");
            System.out.println("1 - Verificar Ninjas Cadastrados");
            System.out.println("2 - Encerrar");
            System.out.print("Opção >>> ");
            opcao = teclado.nextInt();
            switch (opcao){
                case 0:
                    System.out.println("Cadastrar Ninja");
                    break;
                case 1:
                    System.out.println("Verificar Ninjas Cadastrados");
                    break;
                case 2:
                    System.out.println("Encerrando o sistema. Até breve!");
                    break;
                default:
                    System.out.println("Opção Inválida! Opções válidas são 0, 1 e 2");
                    break;
            }
        } while(opcao != 2);

    }
}
