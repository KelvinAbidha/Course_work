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
    
    
    
    
    
