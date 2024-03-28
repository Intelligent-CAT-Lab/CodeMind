import java.util.Scanner;

public class p03036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}