//Adding two integers only between 0-5
import java.util.Scanner;
public class AdditionIfPractice
{
  public static void main (String args[])
  {
   //no imput error trapping needed no arguments entered
   
   int a = 0;
   int b = 0;
   int c = 0;   
   
   Scanner userInput = new Scanner(System.in);
   
   //Display text for user to enter values
   
   System.out.println("Adding numbers between 0-5");
   System.out.println("Please enter in first number:");
   a = userInput.nextInt();
   System.out.println("Please enter in second number:");
   b = userInput.nextInt();
   c = a+b;
   
   if ((a>=0 && a<=5) && (b>=0 && b<=5)){
    System.out.println("The sum of the two integers is:" +c);
    } 
    else{
     System.out.println("Please only enter in integers between 0-5 to sum");
    }
  }     
}
