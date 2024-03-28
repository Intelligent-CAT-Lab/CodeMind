import java.util.Scanner;

public class p02789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}