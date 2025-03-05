//Exercise 1 
class Main {
    public static void main(String[] args) {
        String name = "Kelvin";
        System.out.println("Hello");
        System.out.println(name);
    }
}
//Exercise 2
class Main{
    public static void main(String[]args)
    {
        int number_1 = 4;
        int num_2 = 8;
        System.out.println("Number 1 =" + number_1);
        System.out.println("Number 2 =" + num_2);
        int num_3 = num_2;
        num_2 = number_1;
        number_1 = num_3;
        System.out.print("Number 1, Number 2 " +number_1+num_2);
    }
}

//Exercise 3 
import java.util.Scanner;

class Exercise_3
{
    public static void main(String [] args)   
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter num1 =");
        int num1 = in.nextInt();
        System.out.print("Enter num2 =");
        int num2 = in.nextInt();
        
        int product = num1*num2;
        System.out.print("Product = "+product);
    }
    
}

//Exercise 4
class Main
{
    public static void main(String[] args)
    {
        for(int i = 0;i<11;i++)
        {
            System.out.println(i);
        }
    }
}

//Exercise 5

