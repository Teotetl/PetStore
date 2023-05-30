package AbstractAnimal;

public class PetStore {
    public static void main(String[] args) {
        Cat garfield = new Cat("Garfield", "naranja", 5);
        Dog firulais = new Dog("Firulais", "Manchado", 5);
        Rooster Claudio = new Rooster("Claudio", "Blanco con rojo", 1);

        System.out.println("< Ejemplo de polimorfismo usando una clase abstracta >");
        System.out.println("Invocando al metodo toString");
        System.out.println(garfield.toString());
        System.out.println("---------------------");
        System.out.println(firulais.toString());
        System.out.println("---------------------");
        System.out.println(Claudio.toString());
    }
}
