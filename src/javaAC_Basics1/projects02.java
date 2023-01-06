package javaAC_Basics1;

import java.util.Scanner;

public class projects02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        /*
        if (num >= 0){
            System.out.println("Positive Number!");
        }
        else {
            System.out.println("Negetive Number!");
        }
        double temp = 103.5;
        if (temp >100){
            System.out.println("Fever");
        }
        else {
            System.out.println("No Fever!");
        }

        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("NOt a valid weakday!");
        }
        */
//        Leap Year calculactor
        boolean x = (num % 4) == 0;
        boolean y = (num % 100) != 0;
        boolean z = ((num % 100 == 0) && (num % 400 == 0));

        if (x && (y||z)){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
    }
}
