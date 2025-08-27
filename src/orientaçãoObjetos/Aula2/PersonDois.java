package orientaçãoObjetos.Aula2;

public record PersonDois(String name, int age) {


    public PersonDois {
        System.out.println("===========");
        System.out.println(name);
        System.out.println(age);
        System.out.println("===========end");
    }
}
