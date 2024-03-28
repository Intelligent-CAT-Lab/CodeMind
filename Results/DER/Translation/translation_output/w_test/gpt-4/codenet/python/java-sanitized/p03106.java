import java.util.*;

public class p03106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (a % i == 0 && b % i == 0) {
                res.add(i);
            }
        }

        Collections.sort(res, Collections.reverseOrder());
        System.out.println(res.get(k - 1));
    }
}