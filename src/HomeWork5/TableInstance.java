package HomeWork5;

public class TableInstance {
    public static void main(String[] args) {
        Table [] tables  = new Table[3];
        tables[0] = new Table(4, 100, "dub", "pismenniy" , 400);
        tables[1] = new Table(6, 290, "grab", " kvadrat",590);
        tables[2] = new Table( 8, 321, "sosna", "oval", 980);
        for (int i = 0; i  < tables.length; i++){
            System.out.println(tables[i].toString());
}
    }
}
