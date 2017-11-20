
package grocery;

public class Grocery extends Goodies{
    private double weight;
    
    public Grocery(String name, String description, double price, double weight){
    super(name, description, price);
    this.weight = weight;
    
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Weight: " + weight);
    }  
}
