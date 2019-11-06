package by.belhard.g18.lessen1;

public class Task4 {
    public static void main(String[] args) {
        int[] array1 = {5, 6, 8, -10, 11};

        System.out.println(array1[4]);
        int[] array2 = new int[2];
        System.out.println(array2[0]);
        boolean[] boolArray = new boolean[3];
        System.out.println(boolArray[2]);
        int[][] arrayD = new int[3][];
        arrayD[0] = new int[3];
        arrayD[1] = new int[2];
        arrayD[2] = new int[4];
        arrayD[1][0] = 5;
        arrayD[1][1] = -55;
        System.out.println(arrayD[2][0]);


    }
}
