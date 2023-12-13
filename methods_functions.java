import java.util.Scanner;

public class methods_functions {
    public static void main(String[] args) {

        String message = "hello";
        message = " hello2 ";
        System.out.println(message.trim());

//        System.out.printf(message);
        // sum();

        String message1 = mygreet("kranthi");
        System.out.println(message1.trim());
//        methods_functions.mygreet("kranthi");

        int answer = Sum2(2,3);
        System.out.println(answer);

        int answer1 = Sum1();
        System.out.print(answer1);

    }
    // methods are made  static here  , as we can run them without creating object
    // at run time they are called by using class name

    static int Sum2(int a , int b )
    {
        int sum = a + b ;

        return sum ;
    }

    public  static String mygreet(String name) {

        String greeting = " hello " + name ;

        return greeting;
    }

    static  String greet()
    {
        String greeting = " hello , how are you " ;
        return greeting;
    }

    static int  Sum1 ()  // static because main fn is static , for reference purpose
    {
        Scanner sc = new Scanner(System.in);

        System.out.print(" enter number 1 : ");
        int number1 = sc.nextInt();
        System.out.print(" enter number 2 : ");
        int number2 = sc.nextInt();
        int sum = number1 + number2 ;

        return  sum ;
    }
    static void sum ()  // static because main fn is static , for reference purpose
    {
        Scanner sc = new Scanner(System.in);

        System.out.print(" enter number 1 : ");
        int number1 = sc.nextInt();
        System.out.print(" enter number 2 : ");
        int number2 = sc.nextInt();
        int sum = number1 + number2 ;
        System.out.println(" sum of the given two numbers is " + sum );
    }
}
