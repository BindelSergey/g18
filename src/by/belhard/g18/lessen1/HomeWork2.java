package by.belhard.g18.lessen1;

public class HomeWork2 {
    public static void main(String[] args) {
        int a1 = 3;
        int b1 = 2;
        System.out.printf("Число 3 в квадрате равно %.0f \n", Math.pow(a1, b1));
        double x1 = 10.443;
        double y1 = 3.22;
        System.out.printf("значение %.3f в степени %.2f равно %.3f\n", x1, y1, Math.pow(x1, y1));
        System.out.printf("pow(%.3f, %.3f) = %.3f \n\n", x1, y1, Math.pow(x1, y1));


        for (int i =0; i < 10; i++ ) {
            for (int t =0; t <10; t++) {
                System.out.printf("%5d", (i + 1) * (t + 1));
            }
            System.out.println();
        }





    }
}
