import java.util.Scanner;

public class Lab7_19 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("p=");
        int p = scanner.nextInt();
        int p_c = p;
        int pk = p;
        int pk_c = p;
        int sp_c = p - 1;
        int sp = p - 1;
        int spa = 1;
        int spa_c = 1;
        int st = 1;
        int st_c = 1;
        int count_c = 1;
        while (p > 0) {
            if (count_c == 1) {
                while (sp > 0) {
                    System.out.print(" ");
                    sp = sp - 1;
                }
                sp_c = sp_c - 1;
                sp = sp_c;

                System.out.print(pk);
                pk = pk - 1;

                count_c++;
                System.out.println("");
                st_c++;
                st = st_c;
                p = p -1;
            } else if (count_c == 2) {


                while (sp > 0) {
                    System.out.print(" ");
                    sp = sp - 1;
                }
                sp_c = sp_c - 1;
                sp = sp_c;

                while (st > 0) {

                    System.out.print(pk);
                    st = st - 1;
                    pk = pk + 1;


                }

                st_c = st_c + 1;
                st = st_c;
                count_c = count_c + 1;
                System.out.println("");
                p = p - 1;
                pk = pk - 2;
            } else if (count_c > 2) {
                pk = pk - 1;
                while (sp > 0) {
                    System.out.print(" ");
                    sp = sp - 1;
                }
                sp_c = sp_c - 1;
                sp = sp_c;
                System.out.print(pk);
                while (spa > 0) {
                    System.out.print(" ");
                    spa = spa - 1;
                }
                spa_c++;
                spa = spa_c;
                System.out.print(pk_c);
                p = p - 1;
                System.out.println();
                if (p == 1) {
                    pk=pk-2;
                    while (p_c > 0) {
                        pk=pk+1;
                        System.out.print(pk);
                        p_c--;

                    }
                    break;
                }
            }

        }
    }
}
