
import java.text.DecimalFormat;

/**
* Child Class for SharedCloud. 
* 
*/
public class SharedCloud extends CloudStorage {
   
   protected double dataStored;
   protected double dataLimit;
   
   /**
   *final static variable for cost factor.
   */
   public static final double COST_FACTOR = 1.0;
   
   /**
   *@param nameIn name in 
   *@param baseStorageCostIn storage cost in
   *@param dataStoredIn data stored in 
   *@param dataLimitIn data limit in 
   */
   public SharedCloud(String nameIn, double baseStorageCostIn, 
      double dataStoredIn, double dataLimitIn)  {
      
      super(nameIn, baseStorageCostIn);
      
      this.dataStored = dataStoredIn;
      
      this.dataLimit = dataLimitIn;   
   }
   
   /**
   *@return dataStored returns the double data stored.
   */    
   public double getDataStored()  {
      
      return dataStored; 
   }
   
   /**
   *@param dataStoredIn data stored in.
   */ 
   public void setDataStored(double dataStoredIn)  {
      
      dataStored = dataStoredIn;   
   }
   
   /**
   *@return dataLimit data limit rerurned as a double.
   */ 
   public double getDataLimit()  {
      
      return dataLimit;   
   }
   
   /**
   *@param dataLimitIn data limit in.
   *
   */ 
   public void setDataLimit(double dataLimitIn)  {
      
      dataLimit = dataLimitIn;  
   }
   
   /**
   *@return COST_FACTOR cost factor returned as a double.
   *
   */ 
   public double getCostFactor()  {
      
      return COST_FACTOR; 
   }
   
   /**
   *@return over data over as a double.
   */ 
   public double dataOverage() {
      
      double over = getDataStored() - getDataLimit();
      
      if (over < 0) {
      
      
         
         return 0;   
      }
      
      return over; 
   }
   
   
   /**
   *@return sum monthly cost as a double.
   */  
   public double monthlyCost() {
         
      double sum = baseStorageCost + dataOverage() * SharedCloud.COST_FACTOR;
      //return sum
      return sum;   
   }
   
   /**
   *@return toString into as a string.
   */ 
   public String toString() {
   
      String pattern = "$#,##0.00";
      
      
      String pattern2 = "#,##0.000";
      String pattern3 = "#,##0.0";
      
      DecimalFormat fm1 = new DecimalFormat(pattern);
      
      DecimalFormat fm2 = new DecimalFormat(pattern2);
      
      DecimalFormat fm3 = new DecimalFormat(pattern3);
   
      
      return super.toString() + "\nData Stored: " 
         + fm2.format(getDataStored()) + " GB"
         + "\nData Limit: " + fm2.format(getDataLimit()) 
         + " GB"
         + "\nOverage: " + fm2.format(dataOverage())
         + " GB"
         + "\nCost Factor: " + fm3.format(getCostFactor());      
          
   }    
      
}