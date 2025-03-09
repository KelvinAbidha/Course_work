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
     
Question 4///
    
