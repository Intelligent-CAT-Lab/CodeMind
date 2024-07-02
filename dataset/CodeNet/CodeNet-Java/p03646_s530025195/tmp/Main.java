import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static final int N = 50;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long K = sc.nextLong();
System.out.println("[INST]10;K;sc.nextLong();"+K);

        System.out.println(solve(K));

        sc.close();
    }

    static String solve(long K) {
        long[] a = new long[N];
        Arrays.fill(a, N - 1 + K / N);
System.out.println("[INST]19;None;Arrays.fill(a, N - 1 + K / N);"+Arrays.fill(a, N - 1 + K / N));

        for (int i = 0; i < (int) (K % N); ++i) {
            for (int j = 0; j < a.length; ++j) {
                if (j == i) {
                    a[j] += N;
                } else {
                    --a[j];
                }
            }
        }

        return String.format("%d\n%s", a.length,
System.out.println("[INST]31;None;String.format('%d\n%s', a.length,
                Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining(' ')));"+String.format("%d\n%s", a.length,
                Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining(" "))));
                Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
System.out.println("[INST]32;None;Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining(' '));"+Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
System.out.println("[INST]32;None;Arrays.stream(a).mapToObj(String::valueOf);"+Arrays.stream(a).mapToObj(String::valueOf));
System.out.println("[INST]32;None;Arrays.stream(a);"+Arrays.stream(a));
System.out.println("[INST]32;None;Collectors.joining(' ');"+Collectors.joining(" "));
    }
}