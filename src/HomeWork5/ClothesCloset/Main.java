package HomeWork5.ClothesCloset;

public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe(3, 2);
        Clothes clothes1 = new Clothes("maika");
        Clothes clothes2 = new Clothes("kofta");
        Clothes clothes3 = new Clothes("noski");
        Clothes clothes4 = new Clothes("sharf");

        wardrobe.putClothes(clothes1);
        wardrobe.putClothes(clothes2, clothes3, clothes4);

        wardrobe.outputContent();



    }
}
