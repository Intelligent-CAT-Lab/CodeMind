import java.util.Scanner;

public class p02699 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of s: ");
        int s = scanner.nextInt();
        System.out.print("Enter the value of w: ");
        int w = scanner.nextInt();

        if (w >= s) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}