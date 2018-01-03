import java.util.Scanner;

public class Lab7_13 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("P=");
        int p = scanner.nextInt();
        int p_c = p - 1;
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
        int xd =1;
        //numbers
        while (p > 0) {
            while (xf > 0) {
                System.out.print(" ");
                xf = xf - 1;
            }
            while (y > 0) {
                System.out.print(yd);
                y = y - 1;
                yd = yd + 1;
            }
            while (xb > 0) {
                System.out.print(" ");
                xb = xb - 1;
            }
            p=p-1;
            xfc=xfc-1;
            xf=xfc;
            xbc=xbc-1;
            xb=xbc;
            xd=xd+2;
            y=xd;
            yd=1;

            System.out.println("");


        }
        if(p==0)
        {
            p=p_c;
            xfc=xfc+2;
            xf=xfc;
            xbc=xbc+2;
            xb=xbc;
            xd=xd-4;
            y=xd;
            yd=1;

        }
        while (p>0)
        {
            while (xf>0)
            {
                System.out.print(" ");
                xf=xf-1;
            }
            while (y>0)
            {
                System.out.print(yd);
                y=y-1;
                yd=yd+1;
            }
            while (xb>0)
            {
                System.out.print(" ");
                xb=xb-1;
            }
            xfc=xfc+1;
            xf=xfc;
            xbc=xbc+1;
            xb=xbc;
            xd=xd-2;
            y=xd;
            yd=1;
            p=p-1;
            System.out.println("");

        }
    }
}
