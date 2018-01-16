import java.util.Scanner;

public class Lab7_20 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int st = 1;
        System.out.print("P=");
        int p = scanner.nextInt();
        int p_c = p;
        int st_c = 2;
        int sf = p - 1;
        int sf_c = p - 1;
        int sb = p - 1;
        int sb_c = p - 1;
        int sm = 1;
        int sm_c = 1;
        int count = sf_c + sb_c + 1;
        while (p > 0) {
            if (st == 1) {
                while (sf > 0) {
                    System.out.print(" ");
                    sf = sf - 1;

                }

                sf_c = sf_c - 1;
                sf = sf_c;
                while (st > 0) {
                    System.out.print("*");
                    st = st - 1;
                }


                st = st_c;
                p = p - 1;
                System.out.println("");

            } else if (st_c > 1) {

                while (sf > 0) {
                    System.out.print(" ");
                    sf = sf - 1;

                }
                sf_c = sf_c - 1;
                sf = sf_c;


                System.out.print("*");


                while (sm > 0) {
                    System.out.print(" ");
                    sm = sm - 1;
                }
                sm_c = sm_c + 2;
                sm = sm_c;
                System.out.print("*");


                while (sb > 0) {
                    System.out.print(" ");
                    sb = sb - 1;
                }
                sb_c = sb_c - 1;
                sb = sb_c;

                p = p - 1;
                System.out.println("");
                if (p == 1) {

                    while (count>0) {
                        System.out.print("*");
                        count=count-1;
                    }
                    break;
                }


            }


        }
    }
}
