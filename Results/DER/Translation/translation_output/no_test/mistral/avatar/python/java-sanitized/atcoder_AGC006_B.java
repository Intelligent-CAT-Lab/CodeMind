import java.util.*;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, x;
        String input = sc.nextLine();
        String[] split = input.split(" ");
        N = Integer.parseInt(split[0]);
        x = Integer.parseInt(split[1]);

        if (x == 1 || x == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            List<Integer> l = new ArrayList<>();
            for (int i = 1; i < 2 * N; i++) {
                l.add(i);
            }
            l.remove(x - 1);
            l.remove(x);
            l.remove(x + 1);
            for (int i = 0; i < N - 2; i++) {
                System.out.println(l.get(i));
            }
            System.out.println(x - 1);
            System.out.println(x);
            System.out.println(x + 1);
            for (int i = 0; i < N - 2; i++) {
                System.out.println(l.get(N - 2 + i));
            }
        }
    }
}