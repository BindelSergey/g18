package by.belhard.g18.lessen1;

public class HomeWork8 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        array[0][0] = 1;
        array[1][0] = 2;
        array[1][1] = 4;
        array[2][0] = 8;
        array[2][1] = 16;
        array[2][2] = 32;
        array[3][0] = 64;
        array[3][1] = 128;
        array[3][2] = 256;
        array[3][3] = 512;

        for (int i = 0; i  < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i] [j]);
            }
        }
    }
}
