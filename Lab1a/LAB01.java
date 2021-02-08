public class LAB01
{
   public static void main( String[] args)
   {
      //Variable declaration
      IntBag bag1;
      int primes;
      int numberOfPrimes;
      
      //instantiation & initiallisation
      bag1 = new IntBag(100);
      primes = 3;
      numberOfPrimes = 1;
      //program code
      bag1.add(2);
      
      while ( numberOfPrimes < 100)
      {
         //variable declaration
         boolean status;
         int number;
         
         //initialisation
         
         number = 3;
         status = true;
         while ( number < primes && status)
         { 
            if ( ( primes % number) == 0)
            {
               status = false;
            }
            number = number + 2;
         } 
         if ( status)
         {
            bag1.add( primes);
            numberOfPrimes++;
         }
         primes += 2;
      }
      System.out.println( bag1);
   }
}