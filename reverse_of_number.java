public class reverse_of_number {
    public static void main(String[] args) {

        int num = 221 ;
        int ans  = 0 ;

        while (num > 0 )
        {

            int rem = num % 10 ;
            ans = rem + ( ans * 10 );
            num = num / 10 ;
        }

        System.out.println( " reverse of number : " + ans );
    }
}
