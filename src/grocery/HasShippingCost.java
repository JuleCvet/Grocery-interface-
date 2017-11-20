
package grocery;

public interface HasShippingCost {
    double calculateCost(double distance);//kade shippingCost=pricePerMile*distance
    public static final double PRICEPERMILE = 2.4;
  
}
