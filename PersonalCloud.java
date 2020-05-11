/**
*PersonalCloud class.
*/
public class PersonalCloud extends SharedCloud {
   
   /**
   *final static COST_FACTOR cost.
   */
   public static final double COST_FACTOR = 3.0;
   
   /**
   *@param nameIn name.
   *@param baseStorageCostIn storageCost.
   *@param dataStoredIn data stored
   *@param dataLimitIn data limit
   */
   public PersonalCloud(String nameIn, double baseStorageCostIn,
      double dataStoredIn, double dataLimitIn) {
         
      super(nameIn, baseStorageCostIn, dataStoredIn, dataLimitIn);    
      
      
        
   }
    /**
    *@return COST_FACTOR cost as a double.
    */
   public double getCostFactor() {
      
      return COST_FACTOR;   
   }
    
    /**
    *@return sum total as a double.
    */

   public double monthlyCost() {
      
      double sum = baseStorageCost + dataOverage() * PersonalCloud.COST_FACTOR;
      
      return sum;   
   }
    
}
