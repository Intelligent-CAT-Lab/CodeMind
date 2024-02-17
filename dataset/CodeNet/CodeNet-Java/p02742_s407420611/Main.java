import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        scanner.close();

        if (H == 1 || W == 1) {
            System.out.println(1);
            return;
        }

        int h = (H + 1) / 2;
        long ans = 0;
        for (int i = 1; i <= W; i++) {
            if (i % 2 == 0 && H % 2 != 0) {
                ans += h - 1;
            } else {
                ans += h;
            }
        }

        System.out.println(ans);

    }
}
