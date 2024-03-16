import java.util.Scanner;

public class p03719 {

    public static void main(String[] args) {
        // Read input
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // Check condition
        if (B >= C && C >= A) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}