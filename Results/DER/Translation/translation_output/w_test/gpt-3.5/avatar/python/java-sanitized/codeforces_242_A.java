import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        List<int[]> c = new ArrayList<>();
        for (int i = a; i < x + 1; i++) {
            for (int j = b; j < y + 1; j++) {
                if (i > j) {
                    int[] pair = {i, j};
                    c.add(pair);
                }
            }
        }

        System.out.println(c.size());
        for (int[] pair : c) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}