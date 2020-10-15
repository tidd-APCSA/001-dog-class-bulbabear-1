import java.util.Scanner;

class Main{
  public static void main(String[] args){
    /*
    Scanner dogName = new Scanner(System.in);
    System.out.println("What is your dog's name?");
    String nameInput = dogName.nextLine();
    System.out.println("True/False,Has your dog been house trained?");
    boolean houseInput = dogName.nextBoolean();
    System.out.println("How many lbs is your doggy?");
    double weightInput = dogName.nextDouble();
    System.out.println("What breed is your dog?");
    String breedInput = dogName.nextLine();
    System.out.println("What color is your doggo?");
    String colorInput = dogName.nextLine();

    Dog dog1 = new Dog(nameInput);
    dog1.greeting();
    dog1.giveTreat(houseInput);
    dog1.weightInKilo(weightInput);
    dog1.greeting2(breedInput, colorInput);

    public Dog(String name, double weight, String breed, String color, boolean houseTrained)
    */ 
    Dog dog1 = new Dog("jana", 77.7, "shiba inu", "sesame", true);
    Dog dog2 = new Dog("joyce", 88, "italian greyhound", "blue", true);
    Dog dog3 = new Dog("lisa", 66.8, "chinese shih tzu", "white", false);

    System.out.println(dog3);
  }
}