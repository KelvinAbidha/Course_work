import java.util.Scanner; // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    
    System.out.print("Enter your username: "); // Prompt user
    String userName = myObj.nextLine().trim(); // Read and trim input
    
    System.out.println("Hello, " + userName + "!"); 
    
    myObj.close(); // Close Scanner to prevent resource leaks
  }
}

// Question 2
// Java program to Swap
// Two variables

// Driver Class
public class SWAP {
    // main function
    public static void main(String[] args)
    {
        int x = 100, y = 200;

        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Swapping using three
        // Variables
        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
