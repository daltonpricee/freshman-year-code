/**
* Class Public cloud extends SharedCloud.
*/
public class PublicCloud extends SharedCloud {
   
   /**
   *final COST_FACTOR cost as a double.
   *
   */
   public static final double COST_FACTOR = 2.0;
   
  /**
   *@param nameIn name
   *@param baseStorageCostIn storageCost
   *@param dataStoredIn data stored
   *@param dataLimitIn data limit
   */
   public PublicCloud(String nameIn, double baseStorageCostIn, 
      double dataStoredIn, double dataLimitIn) {
      
      super(nameIn, baseStorageCostIn, dataStoredIn, dataLimitIn);   
   }
   
   /**
   *@return COST_FACTOR cost.
   */   
   public double getCostFactor() {
      
      return COST_FACTOR;   
   }
   
   /**
   *@return sum total.
   */  
   public double monthlyCost() {
      
      double sum = baseStorageCost + dataOverage() * PublicCloud.COST_FACTOR;
      //return sum
      return sum;  
   }
   
}