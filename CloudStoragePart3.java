import java.io.IOException;

/**
* Program with the main method for CloudStorageList.
*/
public class CloudStoragePart3
{

/**
* @param args Command Line cloud_storage_data_2_exceptions.csv.
* 
*/
   public static void main(String[] args) {
   
      try {
      
         if (args.length > 0) {
         
            String fileName = args[0];
            CloudStorageList cloudObjs = new CloudStorageList();
            cloudObjs.readFile(fileName);
         
            System.out.println(cloudObjs.generateReport());
            System.out.println(cloudObjs.generateReportByName());
            System.out.println(cloudObjs.generateReportByMonthlyCost());
            
         }
         else {
         
            System.out.println("File name expected as "
               + "command line argument.\nProgram ending.");
               
         }
      }
      
      catch (IOException error) {
      
         String fileName = args[0];
         System.out.println("***Attempted to read file: " + fileName
            + " (No such file or directory)");
            
      }
        
   }
}