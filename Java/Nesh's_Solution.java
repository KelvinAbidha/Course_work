Question 1///
    class Main{
    public static void main(String[]args){
        System.out.println("Hello");
        System.out.println("My name is Nesh");}
}
Question 2///
    import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get input from user
        System.out.print("Input the First Number : ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input the Second Number : ");
        int secondNumber = scanner.nextInt();
        // Display numbers before swapping
        System.out.println("\nBefore swapping:");
        System.out.println("First number = " + firstNumber);
        System.out.println("Second number = " + secondNumber);
        // Swap numbers using a temporary variable
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        // Display numbers after swapping
        System.out.println("\nAfter swapping:");
        System.out.println("First number = " + firstNumber);
        System.out.println("Second number = " + secondNumber);
        scanner.close();
    }
}

Question 3///
    import java.util.Scanner;
public class Main{
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your first number:");
      int firstNumber = sc.nextInt();
      System.out.print("Enter your second number:");
      int secondNumber = sc.nextInt();
      int k = firstNumber * secondNumber;
      System.out.println("The product of two numbers is: " + k);
    }
}
    
 Question 4///
public class Main{
    public static void main(String[]args){
        System.out.println("The following are the first 10 natural numbers:");
        for(int i=1;i<=10;i++) {
            System.out.println(i);
        }   
    }  
}
     
Question 5///
    class person{
    private String name;
    private int age;

    public person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {return name;}
    public int getAge(){return age;}
}
public class Main {
    public static void main(String[]args){
        person person1=new person("John", 25);
        person person2=new person("Nesh",21);
        System.out.println("Person 1: Name = " + person1.getName() + ", Age = " + person1.getAge());
        System.out.println("Person 2: Name = " + person2.getName() + ", Age = " + person2.getAge());
    }
}

Question 6///
    class dog{
    private String breed;
    private int age;

    public dog(String breed, int age){
        this.breed=breed;
        this.age=age;
    }
    public String getName() {return breed;}
    public int getAge(){return age;}

    public void setBreed(String breed) {this.breed = breed;}

    public void setAge(int age) {this.age = age;}
}
public class Main {
    public static void main(String[]args){
        dog dog1=new dog("labrador", 5);
        System.out.println("Initial values:");
        System.out.println("Dog : Breed = " + dog1.getName() + ", Age = " + dog1.getAge());

        dog1.setBreed("Golden retriever");
        dog1.setAge(4);

        System.out.println("After setter methods:");
        System.out.println("Dog : Breed = " + dog1.getName() + ", Age = " + dog1.getAge());
    }
}

Question 7///
    import javax.xml.catalog.Catalog;

class Animal{
    public void makesSound(){
        System.out.println("Animal makes sound");
    }
}
class cat extends Animal{
    public void makesSound(){
        System.out.println("The cat barks");
    }
}
class main{
    public static void main(String[]args){
        Animal animal=new Animal();
        System.out.println("Animal sound:");
        animal.makesSound();

        cat cat=new cat();
        System.out.println("Cat sound:");
        cat.makesSound();

        System.out.println("\nDemonstrating polymorphism:");
        Animal polymorphicCat = new cat();
        polymorphicCat.makesSound();
    }
}

Question 8///
    ///Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
class Shape{
    public void getArea(){System.out.println(("Calculates area of the Shape"));}
}
class Rectangle extends Shape{
    @Override
    public void getArea() {System.out.println("Calculates area of the area of Rectangle");}
}
class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("This: ");
        shape.getArea();

        Rectangle rectangle = new Rectangle();
        System.out.println("This: ");
        rectangle.getArea();
    }
}

Question 9///
    interface Camera {
    public void takePhoto();
    public void recordVideo(int duration);
}
    interface MusicPlayer {
    public void playMusic(String trackName);
    public void stopMusic();
}
class Smartphone implements Camera, MusicPlayer {
    private String model;
    private boolean isPlayingMusic;
    private String currentTrack;
    // Constructor for smartphone
    public Smartphone(String model) {
        this.model = model;
        this.isPlayingMusic = false;
        this.currentTrack = null;
    }
    // Implement the camera interface methods
    @Override
    public void takePhoto() {
        System.out.println(model + " is taking a photo");
    }
    @Override
    public void recordVideo(int duration) {
        System.out.println(model + " is recording a video for " + duration + " seconds");
    }
    // Implement the MusicPlayer interface methods
    @Override
    public void playMusic(String trackName) {
        this.currentTrack = trackName;
        this.isPlayingMusic = true;
        System.out.println(model + " is now playing: " + trackName);
    }
    @Override
    public void stopMusic() {
        if (isPlayingMusic) {
            System.out.println(model + " stopped playing: " + currentTrack);
            this.isPlayingMusic = false;
            this.currentTrack = null;} else {
            System.out.println("No music is currently playing on " + model);}
    }
    // Get Model of Smartphone
    public String getModel() {
        return model;
    }
}
public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Samsung");
        //using camera functionality
        System.out.println("Testing Camera functionality:");
        phone.takePhoto();
        phone.recordVideo(30);
        // Use MusicPlayer functionality
        System.out.println("\nTesting MusicPlayer functionality:");
        phone.playMusic("Bohemian Rhapsody");
        phone.stopMusic();
        // Try stopping music when none is playing
        phone.stopMusic();
    }
}
Question 10///
//A system needs to manage different types of employees (Full-time and part-time), but their salary calculations are different. Apply interface concept to solve this problem/
interface partTimeEmployee{
    public double calculateSalary();
    public void displayInfo();
}
interface fullTimeEmployee{
    public double calculateSalary();
    public void displayInfo();
}
class employee implements partTimeEmployee,fullTimeEmployee {
    private String Name;
    private int age;
    private boolean isFullTime;
    //fullTime
    private double Salary;
    //constructor for fullTime
    public employee(String Name,int age,double Salary){
        this.Name=Name;
        this.age=age;
        this.Salary=Salary;
        this.isFullTime=true;
    }
    //constructor for partTime
    public employee(String Name,int age){
        this.Name=Name;
        this.age=age;
        this.Salary=Salary;
        this.isFullTime =false;
    }
    //return salaries
    @Override
    public double calculateSalary() {
        if(isFullTime){
        return Salary;}
     else {
        return Salary;}}
    // Display employee information
    public void displayInfo() {
        System.out.println("Employee: " + Name);
        System.out.println("Age: " + age);
        if (isFullTime) {
            System.out.println("Type: Full-time");
            System.out.println("Monthly Salary: $" + Salary);
        } else {
            System.out.println("Type: Part-time");
            System.out.println("Regular Salary: $" + Salary);
        }
    }
    // Getter for Name
    public String getName() {
        return Name;}
}
public class Main {
    public static void main(String[] args) {
        // Create full-time employee
        employee fullTime = new employee("John Son", 30, 5000.0);
        // Create part-time employee
        employee partTime = new employee("Sarah Wilson", 25, 3000.0);
        // Display employee information
        System.out.println("EMPLOYEE DETAILS:");
        System.out.println("=================");
        fullTime.displayInfo();
        System.out.println("-----------------");
        partTime.displayInfo();
    }
}

    
    
    
    
    
