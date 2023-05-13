public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Ahmad", "Kab.bogor");
//        person1.country = "Amerika";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("Hanif");

        Person person2 = new Person("Budi");

        Person person3;
        person3 = new Person();
        person3.name = "Joko";
        person3.sayHello("Budi");


    }
}
