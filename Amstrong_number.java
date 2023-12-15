import java.util.Scanner;

public class Amstrong_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


//        System.out.println("enter the number :");
//        int number = sc.nextInt();
//        if(isAmstrong(number))
//            System.out.println(" number is an amstrong number ");
//        else
//            System.out.println(" number is not an amstrong  number ");
//
        System.out.println(" amstrong numbers btw 100 and 1000 are : ");
        for(int i = 100 ; i < 1000 ; i++)
        {

            if(isAmstrong(i))
                System.out.print(i + " ");
        }

    }

    static boolean isAmstrong(int number)
    {
        int original = number ;
        int ans = 0 ;
        while(number > 0 )
        {
            int remainder = number % 10 ;
            number /= 10;
            int cubic_remainder  = remainder * remainder * remainder ;
            ans = cubic_remainder + ans ;


        }

        return ans == original ;
    }
}
