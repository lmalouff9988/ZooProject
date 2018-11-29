package objectdemo1;

import java.util.Scanner;
// author @lmalouff9988

public class ObjectDemo1 {

    public static void main(String[] args) {
       Scanner BOB = new Scanner(System.in);
       Dolphin Flipper = new Dolphin();
       Orca Shamu = new Orca();
       PacificWhiteSided Crediki = new PacificWhiteSided();
       
       
       Wolf Kamots = new Wolf();//create a wolf object named Kamots
       Dog Max = new Dog();
       Dog Belle = new Dog();
       Wolf Abby = new Wolf();
       String OwnersName;
       String AskForOwnerName = "please enter your name";
       String a;
       System.out.println(AskForOwnerName);
       OwnersName = BOB.next();
       
       Abby.setName("Abby");
       Max.setName("Max");
       Kamots.setName("Komots");
       Max.getName();
       Kamots.getName();
       Abby.SayName();
       Abby.SayGreeting();   
       Kamots.GreetDogsFamily(OwnersName);

       System.out.println();
       System.out.println();
       
       Flipper.setName("Flipper");
       Shamu.setName("Shamu");
       Crediki.setName("Crediki");
       
       Flipper.SayGreeting();
      
       Shamu.SayGreeting();
       Shamu.SayName();
       Shamu.getNumberOfTeeth();
       Shamu.FavoriteFood();
       Shamu.MyColor();
       Shamu.GreetDogsFamily(OwnersName);
       
       Crediki.SayName();
       Crediki.getNumberOfTeeth();
       Crediki.FavoriteFood();
       Crediki.MyColor();
       Crediki.Play();
       Crediki.Swim();
       
       
       Flipper.SayName();
     
       Flipper.getNumberOfTeeth();
       Flipper.FavoriteFood();
       Flipper.Eat();
       Flipper.MyColor();
     
       
       
       
       
       
    }
    
}
