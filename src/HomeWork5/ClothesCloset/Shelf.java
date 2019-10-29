package HomeWork5.ClothesCloset;

public class Shelf {

    private Clothes[] clothesArray;
    private int capacity;
    private boolean hasCapacity = true;

    public boolean hasCapacity() {
        return hasCapacity;
    }

    public Shelf(int capacity) {
        this.capacity = capacity;
        this.clothesArray = new Clothes[capacity];
    }

    public boolean putClothes(Clothes clothes) {
        for (int i = 0; i < clothesArray.length; i++) {
            if ((i+1) == capacity) {
                hasCapacity = false;
            }
            if (clothesArray[i] == null) {
                clothesArray[i] = clothes;
                return true;
            }
        }
        System.out.println("No available capacity on the shelve");
        return false;
    }

    public void outputContent() {
        for (int i = 0; i < clothesArray.length; i++) {
            if (clothesArray[i] != null) {
                System.out.println(clothesArray[i].toString());
            }
        }
    }
}
