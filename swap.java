public class swap {
    public static void main(String[] args) {

        System.out.println(" Before swapping .. "); // string - s cap
        String one = " water ";
        String two = " ice  ";

        System.out.println("one :" + one );
        System.out.println("two  :" + two  );

        String temp  ; // declare

        temp = one ;
        one = two ;
        two = temp ;

        System.out.println(" After swapping .. ");
        System.out.println("one is  " + one);
        System.out.println("two is  " + two);
    }
}
