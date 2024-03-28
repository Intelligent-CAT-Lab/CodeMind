import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p03847 {
    static Map<Integer, Integer> memo = new HashMap<>();

    static {
        memo.put(0, 1);
        memo.put(1, 2);
    }

    static int func(int N) {
        if (memo.containsKey(N)) {
            return memo.get(N);
        }
        int result = (func(N / 2) + func((N - 1) / 2) + func(N / 2 - 1)) % (int) Math.pow(10, 9) + 7;
        memo.put(N, result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(func(N));
    }
}