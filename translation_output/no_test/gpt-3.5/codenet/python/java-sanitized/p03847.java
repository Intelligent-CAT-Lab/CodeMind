import java.util.HashMap;

public class p03847 {
    static HashMap<Integer, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        int N = Integer.parseInt(System.console().readLine());

        memo.put(0, 1L);
        memo.put(1, 2L);

        long result = func(N);
        System.out.println(result);
    }

    public static long func(int N) {
        if (memo.containsKey(N)) {
            return memo.get(N);
        }

        long result = (func(N / 2) + func((N - 1) / 2) + func(N / 2 - 1)) % (long) (Math.pow(10, 9) + 7);
        memo.put(N, result);
        return result;
    }
}