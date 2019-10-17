package by.belhard.g18.lessen1;

public class Task3
{
    public static void main(String[] args) {
        int x1 = 5;
        int x = 6;
        int y1 = 8;
        int x2 = 13;
        int y2 = 11;
        int l = ((x*x2-x*x1)*(x*x2-x*x1)+(y2-y1)*(y2-y1));
        System.out.println(l);
        int rad = 9;
        System.out.println(l < rad);
        System.out.println(l > rad);
        System.out.println(l == rad);

    }
}
