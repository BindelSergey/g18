  package HomeWork5;
  class Table {
      private int numberOfLegs;
      private double  height;
      private String material;
      private String type;
      private int price;

      public Table(int numberOfLegs, double height , String material , String type , int price  ){
          this.numberOfLegs = numberOfLegs;
          this.height = height;
          this.material = material;
          this.type = type;
          this.price = price;

      }
      public String toString(){
          return "колеичество ножек стола " + numberOfLegs +" "+ "Высота стола " + height +""+"Мытериал изготовления стола" +material + " "+ " форма стола"+type +" " + "Цена" +price;
      }
  }

