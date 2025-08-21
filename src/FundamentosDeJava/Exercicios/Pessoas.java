package FundamentosDeJava.Exercicios;

import java.util.Scanner;

public class Pessoas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String name = teclado.next();
        System.out.println("Informe sua idade: ");
        int idade = teclado.nextInt();


        System.out.println("Informe seu nome: ");
        String name2 = teclado.next();
        System.out.println("Informe sua idade");
        int idade2 = teclado.nextInt();

        int diferenca = idade - idade2;
        System.out.println("A difernaça de idade entre " + name +  " e " + name2 + " é de " + diferenca );
    }
}
