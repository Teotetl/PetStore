package HerenciaAnimal;

public class PetStore {
    public static void main(String[] args) {
        Dog d1 = new Dog("firulais", 2, "miel", "Javier", "dog", 2.3, "Chihuahua","guau");
        Cat c1 = new Cat("miamia", 2, "miel", "Javier", "cat", 2.3, "Siames","miau");
        System.out.println(c1.toString());
        System.out.println("--------------------------");
        System.out.println(d1.toString());
    }
}
