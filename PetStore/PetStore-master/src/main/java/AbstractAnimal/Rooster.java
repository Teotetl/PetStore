package AbstractAnimal;

public class Rooster extends Animal{
    public Rooster() {
    }

    public Rooster(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String talk(){
        return "Kikiriki";
    }
    public String toString(){
        return super.name + " es un gallo " + "de color "
                + super.color + " tiene " + super.age + " años" +
                " y dice: " + this.talk();
    }
}
