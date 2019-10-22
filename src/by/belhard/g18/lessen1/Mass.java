package by.belhard.g18.lessen1;

public class Mass {
    public static void main(String[] args) {
        int[] salariesArray = {5, 7, 10, 55, 78};
        int max, min;
        max = min = salariesArray[0];
        for (int i = 0; i < salariesArray.length; i++) {
            if (salariesArray[i] > max) {
                max = salariesArray[i];
            }
            if (salariesArray[i] < min) {
                min = salariesArray[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(max - min);
    }
}
