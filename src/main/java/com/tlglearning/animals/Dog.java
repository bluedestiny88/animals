package com.tlglearning.animals;

public class Dog extends Wolf {

  static  {
    System.out.println("Dog initialization block");
  }

  private static int initializeValue()  {
    System.out.println("Dog.initializeValue");
    return -2;
  };

  private static final int MY_CONSTANT = initializeValue();

  private int initializeData()  {
    System.out.println("Dog.initializeData");
    return 2;
  }

  public Dog()  {
    System.out.println("Dog constructor");
  }

  {
    System.out.println("Dog instance initialization block");
  }

  public int data = initializeData();

  {
    System.out.println("Second Dog initialization block");
  }

  @Override
  public void vocalize() {
    System.out.println("Bark like a dog!");
  }

  @Override
  public void hunt() {
    System.out.println("Hunt for balls, bones, leaves, etc.");
  }


  public static void whoAmI() {
    System.out.println("I am a dog");
  }

  public void rollOver()  {
    System.out.println("I'm rolling over! I'm the best dog!");
  }
}
