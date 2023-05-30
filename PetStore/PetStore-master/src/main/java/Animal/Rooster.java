package Animal;

public class Rooster extends Animal{
    public Rooster() {
    }

    public Rooster(String name, String color, int age, String type) {
        super(name, color, age, type);
    }
    @Override
    public String talk(){
        return "El animal " + super.getName() + "dice: Kikiriki";
    }
}
