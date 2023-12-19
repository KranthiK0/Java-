import java.util.Arrays;

public class minnumber_array {
    public static void main(String[] args) {

//        int[] arr = { 1 , 2 , 3 , 5 , 2 , 34 , 26 };

//        System.out.println(min(arr));

        int [][] arr = {

                { 1 , 2, 3 },
                {4 , 5, 6 },
                {7 , 8 , 9 }

        };
        int [] ans = search2d_array(arr , 3);
        System.out.println(Arrays.toString(ans));

        System.out.println(maxin_2darray(arr));

        int number = 1764 ;
        String str2 = Integer.toString(number);
        System.out.println(str2.length());
    }

    // minimum in array
    static int min(int[] arr) {

        int ans = arr[0];

        for(int i = 1 ; i < arr.length; i++)
        {
            if(arr[i] < ans )
            {
                ans = arr[i];
            }
        }

        return ans;
    }

    static  int maxin_2darray(int[][] array )
    {
        int max = Integer.MIN_VALUE;

        for(int[] arr : array) // individual row
        {
            for(int element : arr) // individual col
            {
                if(element > max ) // every element  // arr[row][col] > max
                {
                    max = element; // returns max at last  // max = arr[row][col]
                }
            }
        }

        return  max;
    }



    static int[] search2d_array(int[][] arr , int target )
    {
        for(int row = 0 ; row < arr.length ; row++)
        {
            for(int col = 0 ; col < arr[row].length ; col++)
            {
                if(arr[row][col] == target)
                {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
