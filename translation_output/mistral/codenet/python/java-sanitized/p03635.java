import java.util.Scanner;

public class p03635 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();
        System.out.println((n-1)*(m-1));
    }
}