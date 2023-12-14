import java.lang.reflect.Array;
import java.util.Arrays;

public class methods_functions2 {
    public static void main(String[] args) {

        String name = " kranthi katamouni ";
        changename(name);
        System.out.println(name);
        System.out.println(" name in main_method  :" + name );
        int a = 10 , b = 20 ; // global variables
        swap(10 , 20 );
        System.out.println( " a in main method   : " + a  );
        System.out.println( " b in main method  : " + b  );

        String Mama = " iron Man";
        greet(Mama);

        int[] arr = { 1, 2 ,3 , 4 , 5};

        changearr(arr);
        System.out.println(Arrays.toString(arr));
    }

   static void changearr(int[] nums) {

        nums[0] = 99 ; // here copy of value of reference var is modified , hence we can see change in actual value
       // same object is pointed by ref var : arr , nums
    }

    // 1 . when there is change made to reference variable inside method , it does impact actual variable when the object is modified  , it doesnot when a new object is created , assigned .
    // 2. in java , there is only pass by value , there is no pass by reference

    static void greet(String name) // copy of Value of reference variable mama is passed 
    {
        System.out.println( name);
    }

    static void changename(String name) {
        name = " sri krishna ";

         System.out.println(" name in method changename :" + name );

    }
    static void swap(int a , int b )
    {

        // local variables a,b are different from global variables
        int temp = a;
        a = b ;
        b = temp ;

        System.out.println( " a in swap method " + a );
        System.out.println( " b in swap method " + b );

    }
}
