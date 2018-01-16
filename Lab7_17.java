import java.util.Scanner;

public class Lab7_17 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int p;
        System.out.println("P= ");
        p = scanner.nextInt();
        int count = 1;
        int count_c = 1;
        int s = 1;
        int s_c = 1;
        int sp = 1;
        int sp_c = 1;
        int sa = 1;

        while (p > 0) {
            if(p==1)
            {
                sp_c=sp_c+2;
                count=1;
                while (sp_c>0)
                {
                    System.out.print(count);
                    count++;
                    sp_c--;
                }
                break;

            }

            if (count_c < 2) {
                while (count_c <= 2) {
                    while (s > 0) {
                        System.out.print(count);
                        s = s - 1;
                        count++;

                    }
                    System.out.println("");
                    p = p - 1;
                    count_c = count_c + 1;
                    count = 1;
                    s_c = s_c + 1;
                    s = s_c;
                }

            } else if (count_c > 2) {

                count = 1;
                s = 1;
                sa=1;

                while (s > 0) {
                    System.out.print(count);
                    count++;
                    s = s - 1;

                }
                while (sp > 0) {
                    System.out.print(" ");
                    count++;
                    sp = sp - 1;
                }

                while (sa > 0) {
                    System.out.print(count);
                    sa--;
                }
                sp_c++;
                sp = sp_c;
                System.out.println("");
                p = p - 1;



            }
        }
    }
}
