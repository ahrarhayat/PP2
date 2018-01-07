import java.util.Scanner;

public class Lab7_16 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("P=");
        int p = scanner.nextInt();
        int p_c = p;
        int s = 1;
        //Changing number of stars
        int s_c = 1;
        //Fixed stars
        int sp = p - 1;
        //changing space
        int sp_c = p - 1;
        //Fixed space
        int spm_c = 1;
        //Fixed middle space
        int spm = 1;
        //middle space
        int n = 0;
        while (p > 0) {
            if (n < 2) {
                while (s > 0) {
                    System.out.print("*");
                    s = s - 1;
                }
                while (sp > 0) {
                    System.out.print(" ");
                    sp = sp - 1;
                }
                s_c++;
                s = s_c;
                sp--;
                sp = sp_c;
                p = p - 1;
                System.out.println("");
                n = n + 1;
            } else if (n >= 2) {
                while (p > 0) {

                    System.out.print("*");

                    while (spm > 0) {
                        System.out.print(" ");
                        spm = spm - 1;
                    }

                    System.out.print("*");
                    p = p - 1;
                    spm_c = spm_c + 1;
                    spm = spm_c;
                    System.out.println("");
                    if (p == 1) {
                        while (p_c > 0) {
                            System.out.print("*");
                            p_c=p_c-1;
                        }
                        p=p-1;

                    }

                }


            }

        }

    }
}
