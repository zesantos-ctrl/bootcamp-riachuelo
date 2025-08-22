package orientaçãoObjetos;

public class Main {
    public static void main(String[] args) {
        Person male = new Person();
        male.setName("José");
        male.setAge(21);
        Person famale = new Person();
        famale.setName("gabi");
        famale.setAge(20);
        System.out.println("Male name: " + male.getName() +  " age: " + male.getAge());
        System.out.println("Famale name: " + famale.getName() + " age: " + famale.getAge());

    }
}
