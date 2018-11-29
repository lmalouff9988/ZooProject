
package objectdemo1;

/**
 *
 * @author lmalouff9988
 */
class Orca extends Dolphin
{
  int numberOfTeeth = 56;
  String Name;
  String Color = "black and white spots";
  String Diet = "sharks and seals";
  String Plural; 
  public void GreetDogsFamily(String DogOwnersName)
  {
      System.out.println("Nice to see you," + DogOwnersName + ".");
     
  }
  
  @Override
  public void setName(String myName)
  {
      Name = myName;
  }
  @Override
  public void Speak()
  {
      System.out.println("HELLO!");
  }
  public void Play()
  {
      System.out.println("I wanna play with the ball!!");
  }
  @Override
  public void SayName()
  {
      System.out.println("I am " + getName());
  }
  @Override
  public void SayGreeting()
  {
      Speak();
      System.out.println("We are happy to see you.");
     
  }

  @Override
  public int getNumberOfTeeth() 
  {
      System.out.println("I have " + numberOfTeeth + " teeth.");
      return numberOfTeeth;
  }
    /**
     * @return the Name
     */
  public String getName() 
  {
      return Name;
  }
  @Override
  public void FavoriteFood()
  {
      System.out.println("The yummiest foods are " + Diet + ".");
  }
  public void MyColor()
  {
      System.out.println("My skin has " + Color + ".");
  }
}
