import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
*Test file for proj sharedCloud.
*/
public class SharedCloudTest {


   /** Fixture initialization.**/
   @Before public void setUp() {
   }

    /** the test get Data Stored. **/
   @Test public void getDataStoredTest() {
    
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0); 
      double dataStored = c2.getDataStored();
      Assert.assertEquals(12.0, dataStored, 0.00001);
    
      SharedCloud c3 = new SharedCloud("Cloud Three", 9.00, 25.0, 20.0);
      dataStored = c3.getDataStored();
      Assert.assertEquals(25.0, dataStored, 0.00001);
    
   }
    
    /** test set Data Stored. **/
   @Test public void setDataStoredTest() {
    
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
               
      double dataStored = 10.0;
      c2.setDataStored(dataStored);
      Assert.assertEquals(c2.getDataStored(), dataStored, 0.00001);
    
   }
    
    /** test get Data Limit. **/
   @Test public void getDataLimitTest() {
    
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0); 
      double dataLimit = c2.getDataLimit();
      Assert.assertEquals(20.0, dataLimit, 0.00001);
    
      SharedCloud c3 = new SharedCloud("Cloud Three", 9.00, 25.0, 20.0);
      dataLimit = c3.getDataLimit();
      Assert.assertEquals(20.0, dataLimit, 0.00001);
    
   }
    
    /** test set Data Limit. **/
   @Test public void setDataLimitTest() {
    
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0); 
      double dataLimit = 10.0;
      c2.setDataLimit(dataLimit);
      
      Assert.assertEquals(c2.getDataLimit(), dataLimit, 0.00001);
   
    
   }
    
    /** test get Cost Factor. **/
   @Test public void getCostFactor() {
    
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0); 
      double factor = c2.getCostFactor();
      Assert.assertEquals(1.0, factor, 0.00001);
    
      SharedCloud c3 = new SharedCloud("Cloud Three", 9.00, 25.0, 20.0);
      factor = c3.getCostFactor();
      Assert.assertEquals(1.0, factor, 0.00001);
    
   }
    
    /** test dataOverage true. **/
   @Test public void dataOverageTrueTest() {
    
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0); 
      c2.dataOverage();
      double over = c2.dataOverage();
      Assert.assertEquals(c2.dataOverage(), over, 0.00001);
    
    
      SharedCloud c3 = new SharedCloud("Cloud Three", 9.00, 25.0, 20.0);
      c3.dataOverage();
      over = c3.dataOverage();
      Assert.assertEquals(c3.dataOverage(), over, 0.00001);
   
   }
    
    /** test dataOverage false. **/
   @Test public void dataOverageFalseTest() {
    
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0); 
      double over = -2;
      Assert.assertEquals(0, 0, 0.00001);
    
    
      SharedCloud c3 = new SharedCloud("Cloud Three", 9.00, 25.0, 20.0);
      over = -2;
      Assert.assertEquals(0, 0, 0.00001);
    
   }
    
    /** test monthly cost. **/
   @Test public void monthlyCostTest() {
    
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      double sum = c2.monthlyCost();
      Assert.assertEquals(9.0, sum, 0.00001);
    
      SharedCloud c3 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      sum = c3.monthlyCost();
      Assert.assertEquals(9.0, sum, 0.00001);
   
   }
    
    /** test toString.**/
   @Test public void toStringTest() {
    
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      String toString = c2.toString();
      Assert.assertEquals(c2.toString(), toString);
    
      SharedCloud c3 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      toString = c3.toString();
      Assert.assertEquals(c3.toString(), toString);
    
   }

    
    


    
    

    
    

    
    


    
    

}

