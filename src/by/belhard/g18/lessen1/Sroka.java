package by.belhard.g18.lessen1;

public class Sroka {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            System.out.printf("%4d", i);
            if (i % 3 == 0){
                if (i % 7 == 0)
                System.out.println(i + "");
            }
        }
    }
}
