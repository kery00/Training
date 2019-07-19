//Pets Revision

import java.util.Scanner;
public class Pets2
{
    //initalizing variables
    String PetType = null;
    String ExteriorCoat = null; 
    String Mood = null;
    String Food = null;
    String State = null;
    
    Scanner pets = new Scanner(System.in);
    
    //not messing with constructor right now will come back to it later
    public Pets2()
    {
        Mood = "happy";
        State ="alive";
    }
    //getting information on what pet user wants to know about
    public void describeYourself()
    {
       //Using user input to set the UserInputPet variable. Later we will change this to set the UserInputPet variable via the constructor of the derived object
       //System.out.println ("What type of pet do you want more information on? ");
       //UserInputPet = pets.nextLine();    
      System.out.println("My new pet type is: "+PetType);
      System.out.println("My pet's mood is : "+Mood);
      System.out.println("My pet is : "+State);
        
      
    }
    
    
    
}


