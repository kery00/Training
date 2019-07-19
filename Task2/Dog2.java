class Dog2 extends Pets2
{
    public static void main(String args[])
    {
        //no input error trapping necessary
        Pets2 MyDog = new Pets2();
        PetDog MyNewDog = new PetDog();
        
        System.out.println("What pet would you like to learn about?");
        System.out.println(MyDog.WhatTypeOfPet());
        System.out.println(MyNewDog.ExteriorCoat());
        
        
    }


}    
