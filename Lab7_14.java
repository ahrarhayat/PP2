import java.util.Scanner;

public class Lab7_14 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Width: ");
        int w = scanner.nextInt();
        int wd = w;
        int p = 1;
        //Constant width
        System.out.print("Height: ");
        int h = scanner.nextInt();

        //Constant height

        while (p <=h) {
            if (p == 1) {

                while (wd > 0) {
                    System.out.print("*");
                    wd = wd - 1;
                }

            }
            else if (p==h)
            {
                while (wd > 0) {
                    System.out.print("*");
                    wd = wd - 1;
                }
            }
            else if (p>1) {

                System.out.print("*");
                //The starting star
                wd = w - 2;
                while (wd > 0) {
                    System.out.print(" ");
                    wd = wd - 1;
                }
                System.out.print("*");
                //The ending star
            }

            System.out.println("");
            wd=w;
            p=p+1;


        }
    }
}

