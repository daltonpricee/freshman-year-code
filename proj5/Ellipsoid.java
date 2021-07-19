import java.text.DecimalFormat;
/**
* Program to return the user's first name, last name, 
* location, age, as well as online status.
*
* Project 4 COMP 1210-001
* @author Dalton Price
* @version 2/06/20
*/
public class Ellipsoid {
/**
* @param args Command line arguments (not used). 
*/
   //fields
   private String label = "";
   private double a = 0;
   private double b = 0;
   private double c = 0;

   //constructor
   /**
   *  Initializes the variables to be used in the methods.
   *  @param labelIn the name of the label.
   *  @param a the first axis.
   *  @param b the second axis.
   *  @param c the third axis.
   */
   public Ellipsoid(String labelIn, double a, double b, double c) {
      setLabel(labelIn);
      setA(a);
      setB(b);
      setC(c);  
   }
        
   //methods
   /**
   * @return the name of the label
   */
   public String getLabel() {   
      return label; 
      }

   /**
   * @param labelIn the label.
   * @return the name of the label.
   */
   public boolean setLabel(String labelIn) {
    
      if (labelIn != null) {
         label = labelIn.trim();
         return true; 
      } 
      return false;
   }
   
   /**
   * @return a the value of a
   */            
   public double getA() {
      return a;     
   }
   /**
   * @param aIn the axis a.
   * @return false if aIn less than 0.
   */   
   public boolean setA(double aIn) {
      if (aIn > 0) { 
         a = aIn;
         return true;
      }
      return false;             
   }  
   
   /** 
   * @return the value of b.
   */         
   public double getB() { 
      return b;    
   }  
   
   /**
   * @param bIn the label.
   * @return false if b less than 0.
   */     
   public boolean setB(double bIn) {
      if (bIn > 0) {  
         b = bIn;
         return true;
      }
      return false;          
   } 
   
   /**
   * @return c the value of c
   */            
   public double getC() {
      return c;   
   } 
   
   /**
   * @param cIn the axis c.
   * @return false if cIn less than 0.
   */   
   public boolean setC(double cIn) {
      if (cIn > 0) {  
         c = cIn;
         return true;
      }   
      return false;            
   }   
   
   /** 
   * @return v the value of v. 
   */       
   public double volume() {
      double v = 4 * Math.PI * ((a * b * c) / 3);
      return v;
   } 
   
   /**
   * @return s the value of s.
   */       
   public double surfaceArea() {
      double s = 4 * Math.PI * (Math.pow((Math.pow(a * b, 1.6) 
         + Math.pow(a * c, 1.6) + Math.pow(b * c, 1.6)) / 3, 1 / 1.6));
      return s;                
   }
   
   /**
   * @return output the output of complete sentence.
   */     
   public String toString() {   
      String output = "";
      DecimalFormat formatter = new DecimalFormat("#,##0.0###");
     
      output = "Ellipsoid " + "\"" + label + "\"" + " with axes a = " 
             + formatter.format(a) + ", b = " 
             + formatter.format(b) + ", c = "
             + formatter.format(c) + " units has: " 
             + "\n\tvolume = " + formatter.format(volume()) + " cubic units "
             + "\n\tsurface area = " + formatter.format(surfaceArea()) 
             + " square units";   
      return output;
   }
}                    
