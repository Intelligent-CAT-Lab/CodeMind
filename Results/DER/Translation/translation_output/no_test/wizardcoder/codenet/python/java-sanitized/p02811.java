import java.util.Scanner;

public class p02811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        if (500*K >= X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}