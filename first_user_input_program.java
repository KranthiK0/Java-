import java.util.Scanner;

public class first_user_input_program {
    public static void main(String[] args) {

        System.out.println(" may i know your name ?");
        Scanner s = new Scanner(System.in); // s - object , scanner - class , Scanner()- constructor

        String name = s.nextLine(); // s - capital  , nextline method takes the input from next line

        // we should always put nextline() after next integer , as it doesnot read \n from scanner

        System.out.println("welcome : " + name );

        // s.useradix(2) - gives output in binary number

    }
}
