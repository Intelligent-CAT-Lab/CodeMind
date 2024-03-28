import java.util.Scanner;
import java.util.Arrays;

public class p04005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] l = new int[3];

        for (int i = 0; i < 3; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);

        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (l[i] % 2 == 0) {
                ans = 0;
                break;
            } else {
                ans = l[0] * l[1];
            }
        }
        System.out.println(ans);
        scanner.close();
    }
}