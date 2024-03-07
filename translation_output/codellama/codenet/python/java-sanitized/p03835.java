import java.util.Scanner;

public class p03835 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        int count = 0;
        for (int z = 0; z <= k; z++) {
            for (int y = 0; y <= k; y++) {
                if (0 <= s - y - z <= k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}