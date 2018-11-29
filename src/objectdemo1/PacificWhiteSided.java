
package objectdemo1;

/**
 *
 * @author lmalouff9988
 */
class PacificWhiteSided extends Dolphin
{
   int numberOfTeeth = 32;
  String Name;
  String Color = "black sides with white belly";
  String Diet = "squid and octopus";
  String Plural; 
   @Override
  public void GreetDogsFamily(String DogOwnersName)
  {
      System.out.println("HI," + DogOwnersName + ".");
     
  }
 
   @Override
  public void setName(String myName)
  {
      Name = myName;
  }
   @Override
  public void Speak()
  {
      System.out.println("Squuueeakkk Squueeaaakkk!");
  }
  public void Play()
  {
      System.out.println("Throw me that ball!!");
  }
   @Override
  public void SayName()
  {
      System.out.println("My name is " + Name);
  }
   @Override
  public void SayGreeting()
  {
      Speak();
      System.out.println("We are glad you are back");
     
  }
  public void Swim()
  {
      System.out.println("SPLASH!!!!");
  }
   @Override
  public int getNumberOfTeeth() 
  {
      System.out.println("I have " + numberOfTeeth + " teeth.");
      return numberOfTeeth;
  }
   @Override
  public void FavoriteFood()
  {
      System.out.println("My favorite foods are " + Diet + ".");
  }
   @Override
  public void MyColor()
  {
      System.out.println("I have " + Color + ".");
  }
}
