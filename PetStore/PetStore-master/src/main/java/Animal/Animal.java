package Animal;
public class Animal {
    private String name;
    private String color;
    private int age;
    private String Type;
    public Animal() {
    }

    public Animal(String name, String color, int age, String type) {
        this.name = name;
        this.color = color;
        this.age = age;
        Type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String talk (){
        String s = "El animal " + this.getName() + " dice: ";
        return s;
    }
}
