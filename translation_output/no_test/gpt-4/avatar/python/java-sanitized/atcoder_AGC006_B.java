import java.util.Scanner;
import java.util.ArrayList;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = scanner.nextInt();

        if (x == 1 || x == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i < 2 * N; i++) {
                list.add(i);
            }

            list.remove(Integer.valueOf(x - 1));
            list.remove(Integer.valueOf(x));
            list.remove(Integer.valueOf(x + 1));

            for (int i = 0; i < N - 2; i++) {
                System.out.println(list.get(i));
            }

            System.out.println(x - 1);
            System.out.println(x);
            System.out.println(x + 1);

            for (int i = 0; i < N - 2; i++) {
                System.out.println(list.get(N - 2 + i));
            }
        }

        scanner.close();
    }
}