import java.util.Scanner;

public class p02233 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1, b = 1, i = 0;

        while (i < n) {
            int temp = b;
            b = a + b;
            a = temp;
            i++;
        }

        System.out.println(a);
        scanner.close();
    }
}