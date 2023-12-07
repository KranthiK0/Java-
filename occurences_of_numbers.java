public class occurences_of_numbers {
    public static void main(String[] args) {

        int num = 12545 ;

        int count = 0 ;

        while(num > 0)
        {
            int rem = num % 10 ;
            if(rem == 5)
            {
                count++;
            }
            num = num / 10 ;

        }
        System.out.println( "number of 5 appears in n is : " + count);
    }
}
