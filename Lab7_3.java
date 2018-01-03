import java.util.Scanner;

public class Lab7_3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the width: ");
        int width = scanner.nextInt();
        System.out.println("Input the height: ");
        int height = scanner.nextInt();



        for (int s=1; s<=height;s++) {

            for (int i = 1; i <= width; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
