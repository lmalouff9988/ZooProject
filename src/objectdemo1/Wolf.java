package objectdemo1;

class Wolf {
  int numberOfLegs = 4;
  String Name;
  String FurColor;
  String Diet = "carnivore";
  String NameOfPack; 
  public void GreetDogsFamily(String DogOwnersName)
  {
      System.out.println("Hello," + DogOwnersName + ".  Welcome.");
     
  }
  public void getName()
  {
      System.out.println("I am " +Name);
  }
  public void setName(String myName)
  {
      Name = myName;
  }
  public void Speak()
  {
      System.out.println("Hooowwwllll!");
  }
  public void Attack()
  {
      System.out.println("Grrrrr!!");
  }
  public void SayName()
  {
      System.out.println("I am " + Name);
  }
  public void SayGreeting()
  {
      Speak();
      System.out.println("I am glad your back");
      Speak();
  }
  
}
