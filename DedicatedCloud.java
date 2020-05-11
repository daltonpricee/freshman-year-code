import java.text.DecimalFormat;
/**
*Program to get dedicated cloud info.
*
*/

public class DedicatedCloud extends CloudStorage {
  
   private double serverCost;
   
   /**
   *@param nameIn name in.
   *@param baseStorageCostIn storage cost in.
   *@param serverCostIn server cost in.
   *
   *
   */
   public DedicatedCloud(String nameIn, double baseStorageCostIn,
       double serverCostIn) {
         
      super(nameIn, baseStorageCostIn);
      
      serverCost = serverCostIn;
         
   }
   
   /**
   *@return sum monthly cost.
   */     
   public double monthlyCost() {
      
      double sum = this.serverCost + super.baseStorageCost;
      
      return sum;
      
   }
   
   /**
   *@return toString cloud info as a String.
   *
   */ 
   public String toString() {
   
      String pattern5 = "$#,##0.00";
      
      DecimalFormat fm5 = new DecimalFormat(pattern5);
   
      
      return super.toString() + "\nServer Cost: " 
                              + fm5.format(getServerCost());   
                              
   }
   
   /**
   *@return serverCost server cost as a double.
   */ 
   
   public double getServerCost() {
      
      return this.serverCost;  
   }
   
   /**
   *@param serverCostIn server cost in.
   */ 
   public void setServerCost(double serverCostIn) {
      serverCost = serverCostIn;   
   }
}   
      
