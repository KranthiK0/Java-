import java.util.Scanner;

public class prime_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number to be checked : ");
        int number = sc.nextInt();

        if(isPrime(number))
            System.out.println("number is prime");
        else
            System.out.println("number is not prime ");

    }

    static boolean isPrime(int number) {

        if(number <= 1)
            return false;
        int c = 2 ;
        while(c * c <= number)
        {
            if(number % c == 0 )
                return false;

            c++;
        }

        return c * c > number;

    }
}
