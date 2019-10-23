package by.belhard.g18.lessen1;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Sergey";
        person1.age = 22;
        System.out.println("Меня зовут" + " " + person1.name + "," + "мне" + " " + person1.age + "" + "года");
        Person person2 = new Person();
        person2.name = "Eva";
        person2.age = 25;
        System.out.println("Меня зовут" + " " + person2.name + "," + "мне" + " " + person2.age + "" + "лет");
    }
}
class Person{
    String name;
    int age;
}
