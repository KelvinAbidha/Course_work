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
