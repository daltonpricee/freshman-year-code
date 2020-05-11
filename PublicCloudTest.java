import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
*Tests for public cloud file methods.
*/
public class PublicCloudTest {


   /** Fixture initialization.*/
   @Before public void setUp() {
   }


   /** test get Cost Factor.*/
   @Test public void getCostFactorTest() {
      
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.0, 25.0, 20.0);
      double factor = c4.getCostFactor();
      Assert.assertEquals(2.0, factor, 0.00001);
   
   }
   
   /** test monthlyCost. */
   @Test public void monthlyCostTest() {
      
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
      double factor = c4.monthlyCost();
      Assert.assertEquals(19.0, factor, 0.00001);
   
   }

}
