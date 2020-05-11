import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
/**
* This program  prints out an Ellipsoid list.
* COMP 1210 - Project 5.
* 
* @author Dalton Price
* @version 2/13/2020
*/
public class EllipsoidListApp
{

/**
* This method prints out a ellipsoid list.
* @param args Command line (not used).
* @throws FileNotFoundException for scanning file title.
*/
   public static void main(String[] args) throws FileNotFoundException {
   
      ArrayList<Ellipsoid> list = new ArrayList<Ellipsoid>();
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      
      Scanner scanFile = new Scanner(new File(fileName));

      String ellipsoidListName = scanFile.nextLine();
      String labelIn = "";
               
      
      while (scanFile.hasNext()) {
      
         labelIn = scanFile.nextLine();
         double aIn = Double.parseDouble(scanFile.nextLine());
         double bIn = Double.parseDouble(scanFile.nextLine());
         double cIn = Double.parseDouble(scanFile.nextLine());
         
         Ellipsoid newEllipsoid = new Ellipsoid(labelIn, aIn, bIn, cIn);
         list.add(newEllipsoid);           
      }
      scanFile.close();
      
      EllipsoidList ellipsoidList1 = new EllipsoidList(ellipsoidListName, list);
    
      System.out.println(ellipsoidList1.toString()); 
      System.out.println(ellipsoidList1.summaryInfo());
    
   }
}