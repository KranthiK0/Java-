import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        int i , j ;

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter first number : ");
        i = sc.nextInt();
        sc.nextLine();

        System.out.println(" enter second number ");
        j = sc.nextInt();

        if( i > j ){
            System.out.println(" first number  is greater :  " + i );
        }
        else if ( i < j ){
            System.out.println(" second number  is greater :" + j  );
        }
        else
        {
            System.out.println(" Both numbers are equal  ");
        }

        // if ()
        // if () , else ()
        // if () , else if () , else ()
        // switch( char )

    }
}
