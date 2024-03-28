import java.util.Scanner;

public class p03835 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for (int z = 0; z <= k; z++) {
            for (int y = 0; y <= k; y++) {
                if (0 <= s - y - z && s - y - z <= k) {
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }
}