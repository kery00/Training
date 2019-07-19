//Pets Revision

import java.util.Scanner;
public class Pets2
{
    //initalizing variables
    String UserInputPet = null;
    String ExteriorCoat = null; 
    String Mood = null;
    String Food = null;
    
    
    Scanner pets = new Scanner(System.in);
    
    //getting information on what pet user wants to know about
    public String WhatTypeOfPet()
    {
       //System.out.println ("What type of pet do you want more information on? ");
       UserInputPet = pets.nextLine();    
       
        
       return ("The animal you want more information on is: "+UserInputPet);
    }
    
    
    
}

class PetDog extends Pets2
{
    String UserInputPet = "dog";

    
    public String ExteriorCoat()
    {   
        if (UserInputPet.equals("dog"))
        {
            return ("Dogs have long to medium length soft fur.");
            
        
        }
        
        else
        {
            return ("I'm sorry I don't know much about that animal.");
            
        }    
    }

    
    
    
}  
