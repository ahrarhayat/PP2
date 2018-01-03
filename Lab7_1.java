import java.util.Scanner;

public class Lab7_1 {
    public static void main(String args [])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number: ");
        int num = scanner.nextInt();

        for (int i =1; i<=num; i++)
        {
            System.out.print(i);
        }
    }
}
