import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int  max  = a ;

        if(b > max ) // if b is greater than a , max gets updated to b
        {
            max = b ;
        }
        if(c > max ) // if c  is greater than a , max gets updated to b
        {
            max = c  ;
        }
        System.out.println(" largest number is " + max);

        // Math.max(a, b);


    }
}
