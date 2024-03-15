import java.util.Scanner;

public class p00352 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two integer inputs
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Calculate and print the integer average of the two numbers
        System.out.println((a + b) / 2);

        sc.close();
    }
}