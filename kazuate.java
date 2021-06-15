import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

class kazuate {
    public static void main(String[] args) {
        System.out.println("Kazuate Game 0 - 99");
        Random rand = new Random();
        int num = rand.nextInt(100);
        int count = 0;

        /*-------------main loop---------------*/
        while (true) {
            count = count + 1;
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("-------------------");
                System.out.println("Input number:Turn" + count);
                int innum = scanner.nextInt();

                /*------------Numeric judgment--------------*/
                if (innum == num) {
                    System.out.println("Clear!!");
                    break;
                }
                if (innum - num > 20) {
                    System.out.println("DEKASUGINDARO!!  " + innum + "> X");
                }
                if (innum - num < -20) {
                    System.out.println("HIKUSUGINDARO!!  " + innum + "< X");
                }

                if (innum - num < 5 && innum - num > -5) {
                    System.out.println("OSISUGINDARO!!   -5 < x - inputNumber < 5");
                }

                /*------------end-processing-------------*/
                if (count - 1 == 5) {
                    System.out.println("Failed,Correct number = " + num);
                    break;
                }

                /*-------------Exceptions(input string)-------------*/
            } catch (InputMismatchException e) {
                System.out.println("Input error data ");
                count = count - 1;
            }
        }
    }
}