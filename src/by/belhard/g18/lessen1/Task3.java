package by.belhard.g18.lessen1;

public class Task3
{
    public static void main(String[] args) {
        int x1 = 5;
        int y1 = 8;
        int x2 = 13;
        int y2 = 11;
        int l = ((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println(l);
        int rad = 9;
        //System.out.println(l < rad);
        if (l < rad) {
            System.out.println("Inside");
        } else if (l > rad) {
            System.out.println("Outside");
        } else {
            System.out.println("On the round");
        }
        //System.out.println(l > rad);
        //System.out.println(l == rad);

    }
}
