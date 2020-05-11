import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
*Tests for file Personal cloud. Test methods.
*/
public class PersonalCloudTest {


   /** Fixture initialization. */
   @Before public void setUp() {
   }
   
   /** test get Cost Factor.*/
   
   @Test public void getCostFactorTest() {
      
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.0, 21.0, 20.0);
      double factor = c5.getCostFactor();
      Assert.assertEquals(3.0, factor, 0.00001);
   
   }
   
   /** test monthly Cost(). */
   @Test public void monthlyCostTest() {
      
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.0, 21.0, 20.0);
      double factor = c5.monthlyCost();
      Assert.assertEquals(12.0, factor, 0.00001);
   
   }
   
}



 




 
