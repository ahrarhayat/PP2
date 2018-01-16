import java.util.Scanner;

public class Lab7_18 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("p=");
        int p = scanner.nextInt();
        int p_c = p;
        int sp_c = p - 1;
        int sp = p - 1;
        int spa = 1;
        int spa_c = 1;
        int st = 1;
        int st_c = 1;
        int count_c = 1;

        while (p > 0) {
            if (count_c <= 2) {
                while (sp > 0) {
                    System.out.print(" ");
                    sp = sp - 1;
                }
                sp_c = sp_c - 1;
                sp = sp_c;
                while (st > 0) {
                    System.out.print("*");
                    st = st - 1;
                }
                st_c = st_c + 1;
                st = st_c;
                count_c = count_c + 1;
                System.out.println("");
                p = p - 1;
            } else if (count_c > 2) {
                while (sp > 0) {
                    System.out.print(" ");
                    sp = sp - 1;
                }
                sp_c = sp_c - 1;
                sp = sp_c;
                System.out.print("*");
                while (spa > 0) {
                    System.out.print(" ");
                    spa = spa - 1;
                }
                spa_c++;
                spa = spa_c;
                System.out.print("*");
                p = p - 1;
                System.out.println();
                if (p == 1) {
                    while (p_c>0)
                    {
                        System.out.print("*");
                        p_c--;

                    }
                    break;
                }
            }

        }
    }
}
