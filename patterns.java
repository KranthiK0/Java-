public class patterns {
    public static void main(String[] args) {

        for(int i = 0 ; i<= 4 ; i++)
        {
            for(int j = 0; j<=4 ; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        // pattern - 2
        for(int i = 0 ; i<= 4 ; i++)
        {
            for(int j = 0; j<=5 ; j++) {

                if(i == 0 || j == 0 || i == 4 || j == 5)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // pattern -3

        int n = 3 ;

        for(int i = 0 ; i <= n ; i++)
        {
            for(int j = 0 ; j < i+1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
