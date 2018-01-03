import java.util.Scanner;

public class Lab7_12 {


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("P=");
        int p = scanner.nextInt();
        int p_c = p-1 ;
        //for the reflection
        int xf = p - 1;
        // spaces before
        int xfc = p - 1;

        //spaces before(constant)
        int xb = p - 1;
        // spaces after
        int xbc = p - 1;

        //spaces after (constant)
        int y = 1;
        int yd = 1;
        //stars
        while (p > 0) {
            while (xf > 0) {
                System.out.print(" ");
                xf = xf - 1;
            }

            while (y > 0) {
                System.out.print("*");
                y = y - 1;
            }
            yd = yd + 2;
            y = yd;
            while (xb > 0) {
                System.out.print(" ");
                xb = xb - 1;
            }
            xfc = xfc - 1;
            xf = xfc;
            xbc = xbc - 1;
            xb = xbc;
            System.out.println("");
            p = p - 1;
        }
        if (p == 0) {

            p = p_c;
            xfc = xfc + 2;
            xf = xfc;
            yd = yd - 4;
            y = yd;
            xbc = xbc + 2;
            xb = xbc;

        }
        //The first part is over and the second begins
        while (p >= 0) {

            while (xf > 0) {
                System.out.print(" ");
                xf = xf - 1;
            }


            while (y > 0) {
                System.out.print("*");
                y = y - 1;
            }

            while (xb > 0) {
                System.out.print(" ");
                xb = xb - 1;
            }
            xfc = xfc + 1;
            xf = xfc;
            yd = yd - 2;
            y = yd;
            xbc = xbc + 1;
            xb = xbc;


            System.out.println("");
            p = p - 1;
        }
    }


}
