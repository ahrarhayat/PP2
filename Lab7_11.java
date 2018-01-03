import java.util.Scanner;

public class Lab7_11 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("P=");
        int p = scanner.nextInt();
        int p_c =p;
        int s = p - 1;
        int s_c = p - 1;
        int n = p-s;
        int n_c =p-s;
        int k =0;

        while (p > 0) {
            while (s > 0) {
                System.out.print(" ");
                s = s - 1;
            }


            while (n>0)
            {
                System.out.print(p_c);
                p_c=p_c+1;
                n=n-1;
            }
            s_c = s_c - 1;
            s = s_c;
            k=k+1;
            n=n_c+k;
            p=p-1;
            p_c=p;


            System.out.println("");




        }
    }
}
