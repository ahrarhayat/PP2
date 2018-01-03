import java.util.Scanner;

public class Lab7_10 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("P=");
        int p = scanner.nextInt();
        int xf = p-1;
        // spaces before
        int xfc= p-1;
        //spaces before(constant)
        int xb = p-1;
        // spaces after
        int xbc=p-1;
        //spaces after (constant)
        int y= 1;
        int yc=1;
        int k =1;
        int c =0;
        while (p>0)
        {
            while(xf>0)
            {
                System.out.print(" ");
                xf=xf-1;
            }

            while (y>0)
            {
                System.out.print(k);
                k=k+1;
                y=y-1;
            }
            k=yc;
            c=c+2;
            y=yc+c;
            while(xb>0)
            {
                System.out.print(" ");
                xb=xb-1;
            }
            xfc=xfc-1;
            xf=xfc;
            xbc=xbc-1;
            xb=xbc;
            System.out.println("");
            p=p-1;
        }
    }
}
