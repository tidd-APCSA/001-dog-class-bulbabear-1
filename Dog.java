public class Dog{
  private String breed;
  private String name;
  private double weight;
  private String color;
  private boolean houseTrained;


  public Dog(String name, double weight, String breed, String color, boolean houseTrained){
    this.name = name;
    this.weight = weight;
    this.breed = breed;
    this.color = color;
    this.houseTrained = houseTrained;
  }

//getter methods and toString()
  public String  getName(){
    return ("Name: " + this.name);
  }
  public String getWeight(){
    return ("Weight: " + this.weight + " lbs");
  }
  public String getBreed(){
    return ("Breed: " + this.breed);
  }
  public String getColor(){
    return ("Color: " + this.color);
  }
  public String getHouseTrained(){
    return ("House Trained: " + this.houseTrained);
  }

  public String toString(){
    return (this.name + "🐶");
  }
//fun stuff
  public void greeting(){
    System.out.println("omg  a cute doggy! hi " + this.name + " !");
  }
  
  public void weightInKilo() {
    double kilo = this.weight * 0.453592; 
    System.out.println("your dog weighs "+ kilo + " kg");
  }

  public void giveTreat (){
    if (this.houseTrained == true){
      System.out.println("your dog is so smart! here's a treat!");
    }else{
      System.out.println("dumb dogs don't get anything");
    }
  }

  public void greeting2(){
    System.out.println("wow " + this.name + " is a " + this.color + this.breed + " !" );
  }

  
}