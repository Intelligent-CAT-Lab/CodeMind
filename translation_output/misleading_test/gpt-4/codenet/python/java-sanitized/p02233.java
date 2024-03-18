import java.util.Scanner;

public class p02233 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Getting the input from user
        int a = 1;
        int b = 1;
        int i = 0;
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