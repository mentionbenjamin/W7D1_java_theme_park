public class Visitor {

    private int age;
    private int height;
    private int wallet;

    public Visitor(int age, int height, int wallet){
        this.age = age;
        this.height = height;
        this.wallet = wallet;
    }

    public int getAge() {
        return this.age;
    }
}
