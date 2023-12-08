import java.util.Scanner;

public class switch_and_nested_switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println(" enter a fruit name ");
//        String fruit = sc.next();
// enhanced switch
//        switch (fruit) {
//            case "Mango" -> System.out.println("king of fruits");
//            case "Apple" -> System.out.println("keeps a doctor away ");
//            case " Grapes " -> System.out.println(" small fruit  ");
//            case " Orange " -> System.out.println(" Round fruit ");
//            default -> System.out.println("please enter valid fruit ");
//        }

//        switch (fruit) {
//            case "Mango":
//                System.out.println("king of fruits");
//                break;
//            case "Apple":
//                System.out.println("keeps a doctor away ");
//                break;
//            case " Grapes ":
//                System.out.println(" Smaller fruit   ");
//                break;
//            case " Orange ":
//                System.out.println(" Round Fruit ");
//                break;
//            default:
//                System.out.println(" Please enter a valid fruit ");
//
//        }

//        System.out.println("enter number of day");
//
//        int day = sc.nextInt();

//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tueday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println(" enter a correct day ");
//
//        }

//        switch (day)
//        {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tueday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println(" enter a correct day ");
//
//        }

//        switch(day){
//
//            case 1,2,3,4,5 -> System.out.println("weekday");
//            case 6,7 -> System.out.println("weekend ");
//        }
//
        System.out.println(" enter the employee id :  ");
        int empId = sc.nextInt();
        System.out.println("enter the department :");
        String department = sc.next();

        switch(empId)
        {
            case 1 :
                System.out.println(" kranthi ");
                break;
            case 2 :
                System.out.println("krishna ");
                break;
            case 3 :
                System.out.println("Employee no 3 ");
                switch (department)
                {
                    case "IT" :
                        System.out.println("It department");
                        break;
                    case "Management" :
                        System.out.println("Management department ");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;

            default:
                System.out.println("Enter correct employee id ");


        }

    }
}
