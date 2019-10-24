package ClassesAndObjects_g18;

public class Main {
    public static void main(String[] args) {
        Person vita = new Person(120, "vita");
        vita.say("gena");
        System.out.println(vita.name + "\'s height is " + vita.height);
        Person vlad = new Person();
        System.out.println(vlad.height);
    }
}
