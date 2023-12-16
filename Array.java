import java.util.Scanner;

import java.util.Arrays;
public class Array {
    public static void main(String[] args) {

        // arrays initialize
        int[] arr = new int[5]; // creates array in heap memory of size 5 , where each reference var points to different int
        // object created are  stored  in array in java in heap memory  , ref var through point
        // no pass by reference , no pointers in java

        int[] arr1 = { 1 , 2, 3, 4 , 5}; // int arr of 5 integers
        // default value - 0 , null - in case of strings

        // arrays can be modified through functions var  , which impacts orig value as both points to same object

        // print
        // arr.length - returns length of array

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter 5 elements to be stored in array : ");

        for ( int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(" elements in array are : ");
        for ( int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println(" printing using for each ");

        for(int num :arr) // for each
            System.out.print(num + " ");

        System.out.println();

        System.out.println(" printing using to string method ");

        System.out.println(Arrays.toString(arr)); // using arrays package

        String[] name  = new String[5];

        System.out.println("enter 5 strings to be stored in array : ");

        for ( int  i = 0 ; i < name.length ; i++)
        {
            name[i] = sc.next();
        }
        System.out.println(" elements in array are : ");

        for ( int i = 0 ; i < name.length ; i++)
        {
            System.out.print(name[i] + " ");
        }

        System.out.println();
       int[][] multi_dim_arr = new int[3][3]; // creates multi dim arr of 3*3
        System.out.print(multi_dim_arr.length);
        // arr.length always gives row length

        // another way for variable col length
        //multi_dim_arr[0] = new int[5];

//        int[][] multi_dim_arr = {
//                { 1 , 2 , 3 }, // multi[0] is an array
//                { 4 , 5 ,6 }, // multi[1] is an array
//                { 7 , 8 , 9 } // multi[2] is an array
//        };
        System.out.println();
        // input for 2d
        Scanner in = new Scanner(System.in);

        System.out.println(" enter elements in 2d array : ");

        for(int row = 0 ; row < multi_dim_arr.length ; row++)
        {
            for(int col = 0 ; col < multi_dim_arr[row].length ; col++)
            {
                multi_dim_arr[row][col] = in.nextInt();
            }

        }
        // output of 2d array
        System.out.println(" elements in 2d array are : ");
        for(int row = 0 ; row < multi_dim_arr.length ; row++)
        {
            for(int col = 0 ; col < multi_dim_arr[row].length ; col++)
            {
                System.out.print( multi_dim_arr[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println(" printing via to string  ");// as every row is another array

        for(int row = 0 ; row < multi_dim_arr.length ; row++)
        {
            System.out.println(Arrays.toString(multi_dim_arr[row]));
        }

        System.out.println("printing via for each");

        for(int[] a : multi_dim_arr) {
            System.out.print(Arrays.toString(a));
            System.out.println();
        }

    }
}
