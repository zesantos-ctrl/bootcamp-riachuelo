package FundamentosDeJava.Exercicios;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Ola {
    public static void main(String[] args) {
        int baseYear = OffsetDateTime.now().getYear();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        String name = teclado.next();
        System.out.println("Informe o seu ano de nascimento");
        int year = teclado.nextInt();
        int age = baseYear - year;
        System.out.printf("Olá %s você tem %s anos\n", name, age);

    }

}
