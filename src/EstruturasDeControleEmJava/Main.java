package EstruturasDeControleEmJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        //Estrutura coniciional If else e else if
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = scanner.next();
        System.out.println("Infrome sua idade:");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        //operador ternário
        var canDrive = (age >= 18) || (age >= 16 && isEmancipated);
        var message = canDrive ?
                "%s, você tem %s anos e pode dirigir \n" :
                "%s, você não pode dirigir \n";

        System.out.println(message);
        System.out.println("Fim da execusão");


        //condicional switch case

        var scanner = new Scanner(System.in);
        System.out.println("informe um número de 1 até 7");
        var option = scanner.nextInt();
        switch (option) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            default:
                System.out.println("Opção inválida");
        }

        switch (option) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Opção inválida");
        }

        var message = switch (option) {
            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s, fim de semana uhulll", day);
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default ->"Opção inválida";
        }


        //Estrutura de repetição for
        var scanner = new Scanner(System.in);
        for (var i = 1;i < 101; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
        */

        //Estruturas de repetição while e do while
        var scanner = new Scanner(System.in);
        var name = "exit";
       while (!name.equalsIgnoreCase("exit")) {
           System.out.println("Informe um nome");
           name = scanner.next();
           System.out.println(name);
       }

        do {
            System.out.println("Informe seu nome: ");
            name = scanner.next();
            System.out.println(name);
        } while (!name.equalsIgnoreCase("exit"));
    }
}