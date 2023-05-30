package HerenciaAnimal;

public class Animal {
    private String name;
    private int age;
    private String color;
    private String owner;
    private String animelType;
    private double weight;
    private String breed;
    private String sound;
    public Animal() {
    }

    public Animal(String name, int age, String color, String owner, String animelType, double weight, String breed, String sound) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.owner = owner;
        this.animelType = animelType;
        this.weight = weight;
        this.breed = breed;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAnimelType() {
        return animelType;
    }

    public void setAnimelType(String animelType) {
        this.animelType = animelType;
    }

    public double getWeight() {
        return weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setWeight(double weight) {
        this.weight = weight;

    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    public String toString(){
        System.out.println("nombre" + getName());
        System.out.println("Age: " + getAge());
        System.out.println("color: " + getColor());
        System.out.println("owner: " + getOwner());
        System.out.println("Tipo de animal: " + getAnimelType());
        System.out.println("breed: " + getBreed());
        System.out.println("peso: " + getWeight() + "kg");
        System.out.println("sonido: " + getSound());
        return "";
    }
}
