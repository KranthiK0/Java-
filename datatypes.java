import java.util.Scanner;

public class datatypes {
    public static void main(String[] args) {

        int x ;
        float y ;
//        boolean z ;
        String name ; // reference type , will be created in stack , referenced via name
        // char s;

        System.out.println(" enter a number ");

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextFloat();
        sc.nextLine();
        name = sc.nextLine();



        System.out.println("entered no is " + x);
        System.out.println(" byte min value " + Byte.MIN_VALUE); // min value that can be stored in byte
        System.out.println("no of bytes taken by Byte : " + Byte.BYTES );

        // java considers unicode starts from 0 , takes 2 bytes

    }
}
