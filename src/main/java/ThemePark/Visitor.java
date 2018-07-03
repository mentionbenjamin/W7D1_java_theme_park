package ThemePark;

public class Visitor {

    public int age;
    public int height;
    public int wallet;

    public Visitor(int age, int height, int wallet){
        this.age = age;
        this.height = height;
        this.wallet = wallet;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }
}
