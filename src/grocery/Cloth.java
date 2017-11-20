
package grocery;

public class Cloth extends Goodies implements HasShippingCost{
    private int size;
    
    public Cloth(String name, String description, double price, int size){
    super(name, description, price);
    this.size = size;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Size is: " + size);
    } 

    @Override
    //double calculateCost(double distance);//kade shippingCost=pricePerMile*distance   
    //public static final double pricePerMile = 20;    
    public double calculateCost(double distance) {
      return (PRICEPERMILE*distance/2);//THIS IS SHIPING COST FOR CLOTH
        
    }
}
