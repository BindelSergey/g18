package HomeWork4;

public class Main {
    public static void main(String[] args) {
        Building home = new Building();
        home.address = (" kypalinka 22");
        home.elevator = true;
        System.out.println(home.number_of_floors);
        home.material = ("Bryss");
        home.year_of_construction = 2010;


        Building Ofis = new Building();
        Ofis.number_of_floors = 75;
        Ofis.address = (" kirova 55");
        Ofis.elevator = true;
        Ofis.material = ("Kirpih");
        Ofis.year_of_construction = 1999;


        Building Industrial =  new Building();
        Industrial.number_of_floors = 4;
        Industrial.address = (" batova 47");
        Industrial.elevator = true;
        Industrial.material = ("blok");
        Industrial.year_of_construction = 1990;

        Building Farm = new Building();
        Farm.number_of_floors = 1;
        Farm.address = (" sverdlova 72");
        Farm.elevator = false;
        Farm.material = ("panel ");
        Farm.year_of_construction = 2018;
    }
}
