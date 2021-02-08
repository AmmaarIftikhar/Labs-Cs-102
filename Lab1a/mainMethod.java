import java.util.Scanner;
public class mainMethod
{
   //@author Ali Dogac, Argun Muradov, Efe Korkmazhan, Jankat Dincer, Cem Ege Karaca
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      Hangman man = new Hangman();
      char triedLetter;
      
      do
      {
         System.out.println("_________________________________________________");
         System.out.println("Your max allowed number of tries is: " + man.getMaxAllowedIncorrectTries() );
         System.out.println("You have had " + man.getNumOfIncorrectTries() + " incorrect tries so far");
         System.out.println("You have used the letters " + man.getUsedLetters() + " so far.");
         System.out.println("Your word is.... " + man.getKnownSoFar() );
         System.out.println("\nPlease enter a letter: ");
         triedLetter = scan.next().charAt(0);
         if ( man.tryThisLetter( triedLetter ) == -1 )
         {
            System.out.println("Oh no! The letter " + triedLetter + " is invalid");
         }
         else if ( man.tryThisLetter( triedLetter ) == -2 )
         {
            System.out.println("Sorry! The letter " + triedLetter + " was already used!");
         }
         
      } while (!man.isGameOver);
      
      if( man.hasLost() )
      {
         System.out.println("GAME LOST");
      }
      else
      {
         System.out.println("Congrats! I bet this was your biggest achievement in life");
      }
      
   }
}
   
   