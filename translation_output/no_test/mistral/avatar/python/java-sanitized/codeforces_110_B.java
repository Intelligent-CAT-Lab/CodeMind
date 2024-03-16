import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;

public class codeforces_110_B {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("abcd".repeat(n / 4) + "abc".substring(0, n % 4));
    }
}