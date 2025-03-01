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
