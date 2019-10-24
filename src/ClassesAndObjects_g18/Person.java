package ClassesAndObjects_g18;

public class Person {
    public int height = 180;
    public String name = "Dif";

    public void say(String name) {
        System.out.println("Hello," + name);
    }
    public Person () {}

    public Person (int h, String n){
        height = h;
        name = n;
    }
}

