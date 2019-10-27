package HomeWork5.ClothesCloset;

public class Clothes {
    private String maika;
    private String kofta;
    private String shtan;
    private String noski;

    public Clothes(String maika, String kofta, String shtan, String noski){
        this.maika = maika;
        this.kofta = kofta;
        this.shtan = shtan;
        this.noski = noski;
    }
    public String toString(){
        return "Вущи лежащие в шкафу: " +maika+""+kofta+""+shtan+""+noski;
    }

}
