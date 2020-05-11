import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 /**
* The class DedicatedCloudTest tests..
*/
public class DedicatedCloudTest {


   /** Fixture initialization.**/
   @Before public void setUp() {
   }


   /** A test for get name(). **/
   @Test public void getNameTest() {
   
      DedicatedCloud c = new DedicatedCloud("Cloud one", 40.00, 10.00);
   
      String name = c.getName();
      
      Assert.assertEquals("Cloud one", name);
      
   }
   
   /** test set name. **/
   @Test public void setNameTest() {
   
      DedicatedCloud c = new DedicatedCloud("Cloud one", 40.00, 10.00);
      String name = "Cloud one";
      c.setName("Cloud one");
      Assert.assertEquals(c.getName(), name);
   
   }
   
   /** test get base storage cost. **/
   @Test public void getBaseStorageCostTest() {
   
      DedicatedCloud c = new DedicatedCloud("Cloud one", 40.00, 10.00);
      double baseStorageCost = c.getBaseStorageCost();
      Assert.assertEquals(40.00, baseStorageCost, 0.00001);
   
   }
   
   /** test set base storage cost(). **/
   @Test public void setBaseStorageCostTest() {
   
      DedicatedCloud c = new DedicatedCloud("Cloud one", 40.00, 10.00);
      
      c.setBaseStorageCost(40.0);
   
      double baseStorageCost = 40.00;
      Assert.assertEquals(c.getBaseStorageCost(), baseStorageCost, 0.0001);
   
   }
   
   /** test get count. **/
   @Test public void getCountTest() {
   
      DedicatedCloud c = new DedicatedCloud("Cloud one", 40.00, 10.00);
      int count = c.getCount();
      Assert.assertEquals(c.getCount(), count);
   
   }
   
   /** test reset count. **/
   @Test public void resetCountTest() {
   
      DedicatedCloud c = new DedicatedCloud("Cloud one", 40.00, 10.00);
      CloudStorage.resetCount();
      int count = c.getCount();
      Assert.assertEquals(0, count);
   
   }
   
   /** test to string. **/
   @Test public void toStringTest1() {
   
      DedicatedCloud c = new DedicatedCloud("Cloud one", 40.00, 10.00);
   
      String toString = c.toString();
   
      Assert.assertEquals(c.toString(), toString);
         
   }
    
   /** test get server cost(). **/
   @Test public void getServerCostTest() {
   
      DedicatedCloud c = new DedicatedCloud("Cloud one", 40.00, 10.00);
      double serverCost = c.getServerCost();
      Assert.assertEquals(10.00, serverCost, 0.00001);
   
   }
   
    /** test set server cost. **/
   @Test public void setServerCostTest() {
    
      DedicatedCloud c = new DedicatedCloud("Cloud one", 40.00, 10.00);
      double serverCost = 20.00;
      c.setServerCost(serverCost);
      Assert.assertEquals(c.getServerCost(), serverCost, 0.0001);
    
   }
    
     /** test monthly cost. **/
   @Test public void monthlyCostTest() {
    
      DedicatedCloud c = new DedicatedCloud("Cloud one", 40.00, 10.00);
      double sum = c.monthlyCost();
      Assert.assertEquals(50.00, sum, 0.00001);
    
   }
    
     /** test to string for dedicated. **/
   @Test public void toStringTest2() {
    
      DedicatedCloud c = new DedicatedCloud("Cloud one", 40.00, 10.00);
      String toString = c.toString();
      Assert.assertEquals(c.toString(), toString);
    
   }
   
}
    
    
   
   

    
  
    
    

   

   

   

   
   
   
