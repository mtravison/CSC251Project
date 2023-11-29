import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList; // Import to handle ArrayLists

public class Demo

{
   public static void main(String[] args) throws FileNotFoundException 
   {

      File myObj = new File("PolicyInformation.txt");
      Scanner myReader = new Scanner(myObj);
      Scanner keyboard = new Scanner(System.in);

      final int initialSize = 0;
      final int dataElements = 9;
      boolean loopController;
      String data;

      double policyNumber = 0;
      String providerName = "";
      String holderFirstName = "";
      String holderLastName = "";
      int holderAge = 0;
      String holderSmokerStatus = "";
      double holderHeight = 0;
      double holderWeight = 0;

      ArrayList<Policy> policies = new ArrayList<Policy>(initialSize);

      int smokers = 0;
      int nonSmokers = 0;
      int invalid = 0;
      int lineNumber = 1;
      int inputIdentifier = 0;
      
      do
      {
         data = myReader.nextLine();
         inputIdentifier = lineNumber % dataElements;

         switch (inputIdentifier)
         {
            case 1:  policyNumber = Integer.valueOf(data);
                     break;
            case 2:  providerName = data;
                     break;
            case 3:  holderFirstName = data;
                     break;
            case 4:  holderLastName = data;
                     break;
            case 5:  holderAge = Integer.valueOf(data);
                     break;
            case 6:  holderSmokerStatus = data;
                     if ( holderSmokerStatus.equals("non-smoker") )
                     {
                        nonSmokers ++;
                     }
                     else if ( holderSmokerStatus.equals("smoker") )
                     {
                        smokers ++;
                     }
                     else
                     {
                        invalid ++;
                     }
                     break;
            case 7:  holderHeight = Integer.valueOf(data);
                     break;
            case 8:  holderWeight = Integer.valueOf(data);
                     break;
            default: break;
         }

         if (inputIdentifier == 8)
         {
            policies.add(new Policy(policyNumber, providerName, holderFirstName, holderLastName, holderAge, holderSmokerStatus, holderHeight, holderWeight));
         }

         lineNumber ++;
      }
      while(myReader.hasNextLine() == true );

      for (int index = 0; index < policies.size(); index++)
      {
         Policy policy = policies.get(index);
         System.out.println("\nPolicy Number: " + policy.getPolNum());
         System.out.println("Provider Name: " + policy.getProName());
         System.out.println("Holder First Name: " + policy.getHolFirstName());
         System.out.println("Holder Last Name: " + policy.getHolLastName());
         System.out.printf("Holder Age: %d\n", policy.getHolAge());
         System.out.println("Holder Smoking Status: " + policy.getStatus());
         System.out.printf("Holder Weight: %.0f", policy.getHolWeight());
         System.out.printf("\nHolder Height: %.0f", policy.getHolHeight());
         System.out.printf("\nHolder BMI: %.2f\n", policy.getBMI());
         System.out.printf("Policy Price: %.2f\n", policy.getPolicyCost());
      }

      System.out.println("\nNumber of Smokers: " + smokers);
      System.out.println("Number of Non-Smokers: " + nonSmokers);

   }
}