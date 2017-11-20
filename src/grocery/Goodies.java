
package grocery;

public abstract class Goodies {
    private String name;
    private String description;
    private double price;
    
    public Goodies(String name, String description, double price){
    this.name = name;
    this.description = description;
    this.price = price;
    }
    
    public void showInfo(){//kako da printa za site
    System.out.println("Name " + name + "/ " + " Description " + description + "/ " +  " Price " + price);
    }
    
    public String getName(){
    return name;
    }
    
    public void setName(){
    this.name = name;
    }
    
    public String getDescription(){
    return description;
    }
    
    public void setDescription(){
    this.description = description;
    }
    
    public double getPrice(){
    return price;
    }
    
    public void setPrice(){
    this.price = price;
    
    }
}
