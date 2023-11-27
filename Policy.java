public class Policy
{

// define the fields for the class

   private double policyNumber;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String holderSmokerStatus;
   private double holderHeight;
   private double holderWeight;

// set the no-arg constructor for the class to initialize all the fields

   public Policy()
   {
      policyNumber = 0;
      providerName = "None";
      holderFirstName = "None";
      holderLastName = "None";
      holderAge = 0;
      holderSmokerStatus = "None";
      holderHeight = 0;
      holderWeight = 0;
   }

// initial constructor for the class that will set all items to the input values

   public Policy(double polNum, String proName, String holFirst, String holLast, int holAge, String holSmoker, double holHeight, double holWeight)
   {
      policyNumber = polNum;
      providerName = proName;
      holderFirstName = holFirst;
      holderLastName = holLast;
      holderAge = holAge;
      holderSmokerStatus = holSmoker;
      holderHeight = holHeight;
      holderWeight = holWeight;
   }

// method to set the policy number outside the class
   
   public void setPolNumber(double polNum)
   {
      policyNumber = polNum;
   }

// method to set the provider name outside the class

   public void setProName(String proName)
   {
      providerName = proName;
   }

// method to set the policy holder first name outside the class

   public void setHolFirst(String holFirst)
   {
      holderFirstName = holFirst;
   }

// method to set the policy holder last name outside the class

   public void setHolLast(String holLast)
   {
      holderLastName = holLast;
   }

// method to set the policy holder age outside the class

   public void setHolAge(int holAge)
   {
      holderAge = holAge;
   }

// method to set the policy holder smoking status outside the class

   public void setSmokerStatus(String holSmoker)
   {
      holderSmokerStatus = holSmoker;
   }

// method to set the policy holder height outside the class

   public void setHeight(double holHeight)
   {
      holderHeight = holHeight;
   }

// method to set the policy holder weight outside the class

   public void setWeight(double holWeight)
   {
      holderWeight = holWeight;
   }

// method to get the policy holder BMI outside the class based on other pre-set criteria

   public double getBMI()
   {
      return ( (holderWeight * 703) / (holderWeight * holderWeight) );
   }

// method to set the policy cost outside the class based on other pre-set criteria

   public double getPolicyCost()
   {
      double ageKicker;
      double smokingKicker;
      double BMIKicker;
      
      if ( holderAge > 50 )
      {
         ageKicker = 75;
      }
      else
      {
         ageKicker = 0;
      }
      
      if ( holderSmokerStatus.equals("Smoker") )
      {
         smokingKicker = 100;
      }
      else
      {
         smokingKicker = 0;
      }

      if ( getBMI() > 35 )
      {
         BMIKicker = (getBMI() - 35) * 20;
      }
      else
      {
         BMIKicker = 0;
      }

      return 600 + ageKicker + smokingKicker + BMIKicker;
   }
}