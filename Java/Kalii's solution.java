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
public class SWAP {
    // main function
    public static void main(String[] args)
    {
        int x = 100, y = 200;

        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Swapping using three Variables
        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
// Question 3
// I noticed if i set the numbers to process as 0 ilikuwa inaleta 1 which is in correct added an else to fix
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n;
        double product = 1; // Initialize product to 1

        System.out.println("Please enter how many numbers you want to process:");
        n = num.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Number of values must be greater than 0.");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.println("Please enter a value:");
                double value = num.nextDouble(); // Read input as a double
                product *= value; // Multiply with product
            }
            System.out.println("The product is: " + product);
        }
        num.close(); // Close the scanner to prevent resource leak
    }
}

