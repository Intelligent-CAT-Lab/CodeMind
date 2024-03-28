import java.util.Scanner;

public class p00331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int R = sc.nextInt();
        if (H >= 0) {
            System.out.println(1);
        } else if (H < 0 && H + R > 0) {
            System.out.println(1);
        } else if (H < 0 && H + R == 0) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}