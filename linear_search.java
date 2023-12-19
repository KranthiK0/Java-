import java.util.Arrays;

public class linear_search {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,43};
        int key = 5 ;

        for(int num : arr) // checks each individual element by going through values , not indexes
        {
            if(num == key )
            {
                System.out.println("element  is " + num  );
            }
        }

        //
        System.out.println(linearsearch(arr,key));


        System.out.println(search("kranthi" , 'k'));

        String name = "kranthi";

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search2("kranthi" , 'l'));
        System.out.println(search3(arr, key , 0, 3 ));
    }

    static  int  search3( int[] arr , int  target , int start , int end  )
            // search in a range {from start to end }
    {
        if(arr.length == 0 )
        {
            return -1;
        }

        for(int index = start ; index <= end  ; index++)
        {
            if( arr[index] == target )
            {
                return index ;
            }
        }

        return -1;

    }
    static  boolean search2(String str , char target )
    {
        if(str.length() == 0 )
        {
            return false;
        }
        // string , convert into char array

        for( char ch : str.toCharArray()) // iterating over char array
        {
            if( ch == target )
            {
                return true;
            }
        }

        return false ;

    }


    static  boolean search(String str , char target )
    {
        if(str.length() == 0 )
        {
            return false;
        }

        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) == target )
            {
                return true;
            }
        }

        return false ;

    }

     static int  linearsearch(int[] arr, int key) {

        //base case
         if(arr.length == 0 )
         {
             return  -1 ;
         }
         for(int i = 0 ; i < arr.length ; i++)
         {
             if(arr[i] == key )
             {
                 return i ;
             }
         }

         return -1;
    }
}
