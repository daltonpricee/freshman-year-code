import java.io.FileNotFoundException;
/**
*Program to print out all cloud array info.
*
*/
public class CloudStoragePart2 {
   
   /**
   *@throws FileNotFoundException if file not found.
   *@param args the args passed in.
   *
   */

   public static void main(String[] args) throws FileNotFoundException {
   
      if (args.length > 0) {
         String fileName = args[0];
         CloudStorageList cloudObjs = new CloudStorageList();
         cloudObjs.readFile(fileName);
         
         System.out.println(cloudObjs.generateReport());
         System.out.println(cloudObjs.generateReportByName());
         System.out.println(cloudObjs.generateReportByMonthlyCost());
         
      }
      
      else {
      
      
         System.out.println("File name excpected as "
            + "command line argument.\nProgram ending");
      }
        
   }
}