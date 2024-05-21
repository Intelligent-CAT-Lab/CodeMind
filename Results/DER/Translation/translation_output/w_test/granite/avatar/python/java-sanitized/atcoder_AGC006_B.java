import java.util.*;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        if (x == 1 || x == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            List<Integer> l = new ArrayList<>();
            for (int i = 1; i <= 2 * N; i++) {
                if (i!= x - 1 && i!= x && i!= x + 1) {
                    l.add(i);
                }
            }
            for (int i = 0; i < N - 2; i++) {
                System.out.println(l.get(i));
            }
            System.out.println(x - 1);
            System.out.println(x);
            System.out.println(x + 1);
            for (int i = N - 2; i < l.size(); i++) {
                System.out.println(l.get(i));
            }
        }
    }
}