package HomeWork5.ClothesCloset;

public class Wardrobe {

    private Shelf[] shelves;

    public Wardrobe(int shelvesCount, int shelveCapacity) {
        this.shelves = new Shelf[shelvesCount];
        for (int i = 0; i < shelves.length; i++) {
            shelves[i] = new Shelf(shelveCapacity);
        }
    }

    public void putClothes(Clothes clothes) {
        for (int i = 0; i < shelves.length; i++) {
            if (shelves[i].hasCapacity()) {
                shelves[i].putClothes(clothes);
                return;
            }
        }
        System.out.println("There is no enough capacity in the Wardrobe.");
    }

    public void putClothes(Clothes... clothesArr) {
        for(int i = 0; i < clothesArr.length; i++) {
            putClothes(clothesArr[i]);
        }
    }

    public void outputContent() {
        for (int i = 0; i < shelves.length; i++) {
            shelves[i].outputContent();
        }
    }
}
