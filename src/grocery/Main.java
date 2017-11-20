
package grocery;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Goodies> grocerys = new ArrayList<>();//so ili bez interfejs, site objekti gi stavame vo niza
        
        int items = 0;
        
        Book book1 = new Book ("Piksel", "Arabaska", 256, "Sharma");
        Cloth cloth1 = new Cloth("Marama", "Svilena", 20, 36);
        Grocery grocery1 = new Grocery("Mango", "red", 36, 34);
//        book1.showInfo();
//        
//        System.out.println("Price for book1 is: " + book1.getPrice());
//        System.out.println("Shipping cost for book1 is: " + book1.calculateCost(256));//ni presmetuva poinakva cena
//        
//        System.out.println("Price for cloth1 is: " + cloth1.getPrice());
//        System.out.println("Shipping cost for is: " + cloth1.calculateCost(65));//imame basic pris, dodavame samo distance
//        
//        System.out.println("Price for grocery1 is: " + grocery1.getPrice());
        
        grocerys.add(book1);
        grocerys.add(cloth1);
        grocerys.add(grocery1);
        
        for (Goodies grocery : grocerys) {//za super klasata Goodies, elementot grocery, vrti niz nizata grocerys
           grocery.showInfo();//ni gi pokazuva site objekti
           
            System.out.println("The following items has shipping cost: ");
            for (Goodies currantGoodies : grocerys) {
                if(currantGoodies instanceof HasShippingCost)//ako go implementiraat interfejs metodot
                    items++;//soberi gi i prebroj gi
                System.out.println(currantGoodies.getName() + "has shipping cost.");//im go dava imeto
                
            } 
        } 
        System.out.println(items + " Items has shiping cost.");
    }
}
