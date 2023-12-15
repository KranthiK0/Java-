public class Overloading {
    public static void main(String[] args) {

        sum( 45 );
        sum( 2 , 3 );
    }

    // either number of parameters should be different or type of parameters should be different to execute fn overloading
    static void sum( int a )
    {
        System.out.println(" a is " + a );
    }

    static void sum( int a , int b  )
    {
        int sum = a + b;
        System.out.println(" sum is  " + sum );
    }

    // var args
    // return type  fn name (  type ... variable name ex v  )
    // {
    //
    // return
    // }

    // takes in in form of array which contains series of arguments
}
