
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int m = scanner.nextInt();
System.out.println("[INST]6;m;scanner.nextInt();"+m);
        final int d = scanner.nextInt();
System.out.println("[INST]7;d;scanner.nextInt();"+d);

        int result = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= d; j++) {
                if (j % 10 >= 2 && j / 10 >= 2) {
                    if ((j % 10) * (j / 10) == i) {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
