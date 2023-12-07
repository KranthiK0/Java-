import java.util.Scanner;

public class caluclator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ans = 0 ;
        while( true) {

            System.out.println(" enter the operator : ");
            char op = sc.next().trim().charAt(0); // first char from keyboard
            // next - reads till space is encountered

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.println("enter 2 numbers : ");
                // read two numbers to perform above operations
                int number_1 = sc.nextInt();
                int number_2 = sc.nextInt();

                if (op == '+') // addition
                {
                    ans = number_1 + number_2;
                }
                if (op == '-') // subtract
                {
                    ans = number_1 - number_2;
                }
                if (op == '*') // multiply
                {
                    ans = number_1 * number_2;
                }
                if (op == '/') //  divide
                {
                    if (number_2 != 0) {
                        ans = number_1 / number_2;
                    }
                }
                if (op == '%') // remainder
                {
                    ans = number_1 % number_2;
                }
            }
            else if (op == 'x' || op == 'X') // terminating condition
            {
                break; // exits the loop
            }
            else {
                System.out.println(" invalid operation !! ");
            }



            System.out.println( ans);

        }
    }
}
