import java.util.Scanner;

public class Lab7_15 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Width: ");
        int w = scanner.nextInt();
        int wd;
        int p = 1;
        int count = 1;
        int count_c = 1;
        //Constant width
        System.out.print("Height: ");
        int h = scanner.nextInt();

        //Constant height
        while (p <= h) {
            wd = w;
            count = count_c;
            if (p == 1) {

                while (wd > 0) {
                    System.out.print(count);
                    wd = wd - 1;
                    count++;
                }


            } else if (p == h) {
                while (wd > 0) {
                    System.out.print(count);
                    wd = wd - 1;
                    count++;
                }
            } else if (p < h) {
                System.out.print(count);
                wd = wd - 1;
                count++;

                while (wd > 0) {

                    System.out.print(" ");
                    wd = wd - 1;
                    count++;
                    if(wd==1)
                    {
                        System.out.print(count);
                    }

                }


            }

            p = p + 1;
            System.out.println("");

        }
    }
}
