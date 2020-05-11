import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
* Program to evaluate and return ellipsoid info.
*
* Project 5 COMP 1210-001
* @author Dalton Price
* @version 2/12/20
*/
public class EllipsoidList {  
   //instance variables
   private String name = "";
   private ArrayList<Ellipsoid> list;
   /**
   * constructor.
   * @param nameIn is the list name.
   * @param listIn is the array list.
   */
   public EllipsoidList(String nameIn, ArrayList<Ellipsoid> listIn) {
      name = nameIn;
      list = listIn;
   } 
      //methods
      /**
      *This method gets and returns the name of the list.
      *@return name of list
      *
      */
   public String getName() {
      return name;   
   }
   /**
   *This method returns the number of ellipsoids in arraylist list.
   *@return list size
   *
   */     
   public int numberOfEllipsoids() {  
      if (list.size() == 0) {
         return 0;    
      }
      return list.size(); 
   }    
      /**
      * This method returns the total of the volume.
      * @return returns the total.
      */
   public double totalVolume() { 
      double total = 0;
      int index = 0;
      if (list.size() == 0) {
         return 0;    
      }
      while (index < list.size()) {
         
         total += list.get(index).volume();
         index++;  
      }   
      return total;
   }
        
      /**
      * This method returns the total of the surface areas.
      * @return returns the average.
      */

   public double totalSurfaceArea() {
   
      double total = 0;
      int index = 0;
      if (list.size() == 0) {
         return 0;    
      }
      while (index < list.size()) {
         total += list.get(index).surfaceArea();
         index++;
      }
      return total;
   }
   /**
   * This method returns the average of the volumes.
   * @return returns the average.
   */
   public double averageVolume() {
   
      double total = 0;
      int index = 0;
      if (list.size() == 0) {
         return 0;    
      }
      while (index < list.size()) {
         total += list.get(index).volume();
         index++;
      }
      if (index == 0)
      {
         total = 0;
      }
      else
      {
         total = total / index;
      }
      
      return total;
   }    
   /**
   * This method returns the average of the surface areas.
   * @return returns the average.
   */
   public double averageSurfaceArea() {
   
      double total = 0;
      int index = 0;
      if (list.size() == 0) {
         return 0;    
      }
      while (index < list.size()) {
         total += list.get(index).surfaceArea();
         index++;
      }
      if (index == 0)
      {
         total = 0;
      }
      else
      {
         total = total / index;
      }
      return total;
   } 
   /**
   * This method prints the information of the Ellipsoid list.
   * @return returns the information.
   */
   public String toString() {
      
      String resultn = "";
      int index = 0;
      while (index < list.size()) {
         resultn += "\n" + list.get(index) + "\n"; 
         index++;  
      }  
      return getName() + "\n" + resultn + "\n";
      
   }
   /**
   * This method prints informatin of the Ellipsoid list.
   * @return returns thhe information.
   */
   public String summaryInfo() {
   
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result = "----- Summary for " + getName() + " -----";
      result += "\nNumber of Ellipsoid Objects: " + list.size();
      result += "\nTotal Volume: " + df.format(totalVolume()) + " cubic units";
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea()) 
         + " square units";
      result += "\nAverage Volume: " + df.format(averageVolume()) 
         + " cubic units";
      result += "\nAverage Surface Area: " + df.format(averageSurfaceArea()) 
         + " square units";
      
      return result;
   }
   /**
   *
   *@return list the list of ellipsoid objects
   *
   */   
   public ArrayList<Ellipsoid> getList() {
      return list;
   }
   /**
   *@param fileNameIn is name of the file.
   *@return eList the name of the new ellipsoid object.
   *@throws FileNotFoundException catches if file is not found.
   */   
   public EllipsoidList readFile(String fileNameIn) throws 
      FileNotFoundException {
      ArrayList<Ellipsoid> list2 = new ArrayList<Ellipsoid>();
      String fileName = fileNameIn;
      Scanner scanFile = new Scanner(new File(fileName));
      
      String ellipListName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         String labelIn = scanFile.nextLine();
         double a = Double.parseDouble(scanFile.nextLine());
         double b = Double.parseDouble(scanFile.nextLine());
         double c = Double.parseDouble(scanFile.nextLine()); 
          
         Ellipsoid ellipObj = new Ellipsoid(labelIn, a, b, c);
         list2.add(ellipObj);
      } 
         
      EllipsoidList eList = new EllipsoidList(ellipListName, list2);
      return eList;     
   }
   
   /**
   *@param labelIn name of label
   *@param aIn name of first axis
   *@param bIn name of second axis
   *@param cIn name of third axis
   *
   */
   public void addEllipsoid(String labelIn, double aIn, double bIn, 
      double cIn) 
   {
      Ellipsoid ellipObj = new Ellipsoid(labelIn, aIn, bIn, cIn);
      list.add(ellipObj);
      
   }
   /**
   *
   *@param labelIn is name of the label
   *@return null, return nothing
   *
   */   
   public Ellipsoid findEllipsoid(String labelIn) {
      for (Ellipsoid ellipObj : list) {
         if (ellipObj.getLabel().equalsIgnoreCase(labelIn)) {
            return ellipObj;
         }
      }
      return null;     
   }
   /**
   *
   *@param labelIn name of the label
   *@return null if obj not found
   *
   */   
   public Ellipsoid deleteEllipsoid(String labelIn) {
      int index = list.indexOf(findEllipsoid(labelIn));
               
      if (index >= 0) {
         return list.remove(index);
      }
      else {
         return null;
      }   
   }
   /**
   *@param labelIn name of the label
   *@param aIn the first axis
   *@param bIn the second axis
   *@param cIn the third axis
   *@return null if obj not found
   */    
   public Ellipsoid editEllipsoid(String labelIn, double aIn, double bIn,
       double cIn) {
      for (Ellipsoid ellipObj : list) {
         if (ellipObj.getLabel().equalsIgnoreCase(labelIn)) {
            ellipObj.setA(aIn);
            ellipObj.setB(bIn);
            ellipObj.setC(cIn);
            return ellipObj;
         }
           
      }                
      return null;
   }
}  
   
    
    
      
   
   
   
          
         



