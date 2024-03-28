import java.util.Scanner;

public class p02924 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println((n-1)*n/2);
    }
}