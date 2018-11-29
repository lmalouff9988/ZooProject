
package objectdemo1;

/**
 *
 * @author lmalouff9988
 */
class Dolphin 
{
  int numberOfTeeth = 100;
  String Name;
  String Color = "dark grey";
  String Diet = "Fish and Squid";
  String Plural; 
  public void GreetDogsFamily(String DogOwnersName)
  {
      System.out.println("Hello," + DogOwnersName + ".  Welcome.");
     
  }
 
  public void setName(String myName)
  {
      Name = myName;
  }
  public void Speak()
  {
      System.out.println("Hello, human!");
  }
  public void Eat()
  {
      System.out.println("Give me fish!!");
  }
  public void SayName()
  {
      System.out.println("I am " + Name);
  }
  public void SayGreeting()
  {
      Speak();
      System.out.println("It's nice to see you. We are from the ocean.");
  
  }
  /**
     * @return the numberOfTeeth
     */
  public int getNumberOfTeeth() 
  {
      System.out.println("I have " + numberOfTeeth + " teeth.");
      return numberOfTeeth;
  }
  public void FavoriteFood()
  {
      System.out.println("My favorite things to eat are " + Diet + ".");
  }
  public void MyColor()
  {
      System.out.println("The color of my skin is " + Color + ".");
  }
}
