public class Even_digits {
    public static void main(String[] args) {

        int[] arr = { 1 , 2, 34, 56 ,2345, 234 , 23456789};

        int count = 0 ;
        for(int number : arr)
            if(even_digits(number))
                count++;

        System.out.println(count);
    }

    static boolean even_digits(int number) {

        if(digits(number) % 2 == 0 )
        {
            return true ;

        }

        return false;
    }

     static int digits(int number) {

        // edge case

         if(number < 0 )
         {
             number *= -1 ;// convert to positive
         }

        int digits = 0 ;

         if(number == 0 )
             return 1;

        while(number > 0)
        {
            digits++;
            number /= 10 ;

        }

        return digits;
    }
}
