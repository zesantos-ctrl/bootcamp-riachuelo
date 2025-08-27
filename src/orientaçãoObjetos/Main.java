package orientaçãoObjetos;

    public class Main {
    public static void main(String[] args) {
        Person male = new Person("José");
        male.incAge();
        Person female = new Person("gabi");
        female.incAge();
        System.out.println("Male name: " + male.getName() +  " age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + " age: " + female.getAge());






    }
}
