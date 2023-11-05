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
   
   public void setPolNumber(double polNum)
   {
      policyNumber = polNum;
   }
   
   public void setProName(String proName)
   {
      providerName = proName;
   }

   public void setHolFirst(String holFirst)
   {
      holderFirstName = holFirst;
   }

   public void setHolLast(String holLast)
   {
      holderLastName = holLast;
   }

   public void setHolAge(int holAge)
   {
      holderAge = holAge;
   }

   public void setSmokerStatus(String holSmoker)
   {
      holderSmokerStatus = holSmoker;
   }

   public void setHeight(double holHeight)
   {
      holderHeight = holHeight;
   }

   public void setWeight(double holWeight)
   {
      holderWeight = holWeight;
   }
   
   public double getBMI()
   {
      return ( (holderWeight * 703) / (holderWeight * holderWeight) );
   }
   
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