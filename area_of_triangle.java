import java.util.Scanner;

public class area_of_triangle {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println(" enter the base of the triangle : ");
//        float base = sc.nextFloat();
//        sc.nextLine(); // so that buffer wont skip taking the value
//        System.out.println(" enter the height of the triangle :");
//        float height = sc.nextFloat();
//
//        double area_of_triangle = (1f/2f) * base * height ;
//
//        System.out.println("area of the triangle is : " + area_of_triangle);

        System.out.println(" enter value of a : ");
       int  a = sc.nextInt();
        sc.nextLine(); // so that buffer wont skip taking the value
        System.out.println(" enter value of b : ");
       int  b = sc.nextInt();
        sc.nextLine();
        System.out.println(" enter value of c : ");
       int  c = sc.nextInt();

        float s  =  ((0.5f)*(a+b+c));
       double  area_of_triangle =  Math.sqrt(s*(s-a)*(s-b)*(s-c));
       System.out.println("area of the triangle is : " + area_of_triangle);

    }
}
