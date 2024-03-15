import java.util.Scanner;

public class p00291 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c1, c5, c10, c50, c100, c500;
        System.out.print("Enter values for c1, c5, c10, c50, c100, c500: ");
        c1 = scanner.nextInt();
        c5 = scanner.nextInt();
        c10 = scanner.nextInt();
        c50 = scanner.nextInt();
        c100 = scanner.nextInt();
        c500 = scanner.nextInt();
        int sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500;
        if (sum >= 1000) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}