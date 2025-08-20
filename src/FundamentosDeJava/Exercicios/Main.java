package FundamentosDeJava.Exercicios;

public class Main {
    public static void main(String[] args) {
        /*
        Tipos primitivos:

        Inteiros:
        byte number = 1;
        short number = 1;
        int number = 1;
        long number = 1L;

        Pontos flutuantes:
        float number = 1.0f;
        var number = 1.0d;

        Caractere:
        char caracter = 'a';

        Booleano:
        boolean bool = true | false;

            //Atribuição
        var scanner = new Scanner(System.in);
        System.out.println("Quantos ano você tem?");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || isEmancipated && age >= 16;
                         /*\            /
                          false ||  true
        System.out.printf("Você pode dirigir? (%s)\n" ,canDrive);
        */


        /*
        System.out.printf("True && true = %s\n", true && true);
        System.out.printf("false && false = %s \n", false && false);
        System.out.printf("true && false = %s \n", true && false);
        System.out.printf("false && true = %s \n", false && true);

        System.out.println("============================================");

        System.out.printf("true || true = %s \n", true || true);
        System.out.printf("false || false = %s \n", false || false);
        System.out.printf("true || false = %s \n", true || false);
        System.out.printf("false || true = %s \n", false || true);
        System.out.println("==========================================");
        System.out.printf("!true = %s \n", !true);
        System.out.printf("!false = %s \n", !false);



//Operadores aritméticos:
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro  número: ");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        var value2 = scanner.nextInt();
        //System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
        System.out.printf(" A raiz quadrada de %s é %s\n",  value1, Math.pow(value1, 2));


        var value = 50;
        System.out.println(value++);// incrementa depois de ser usada
        // operador de incremento (++value) = incrementa antes de ser usada
        System.out.println(value);
         */
        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);
        var value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", value2, binary2);
        var result = value1 | value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s | %s = %s (representação binária %s) \n", value1, value2, result, binaryResult);



    }
}

