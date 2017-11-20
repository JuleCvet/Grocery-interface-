
package grocery;

public class Book extends Goodies implements HasShippingCost{
    
    private String author;
    
    public Book(String name, String description, double price, String author){
    super(name, description, price);
    this.author = author;
    
    }   

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Author is: " + author);
    }

    @Override
    public double calculateCost(double distance) {
        return (distance*PRICEPERMILE);
        
    } 
}
