import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.StringJoiner;

public class p03561 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int N = scanner.nextInt();

        List<Integer> result = new ArrayList<>();

        if (K % 2 == 0) {
            result.add(K / 2);
            for (int i = 1; i < N; i++) {
                result.add(K);
            }
        } else {
            for (int i = 0; i < N; i++) {
                result.add((K + 1) / 2);
            }

            for (int i = 0; i < N / 2; i++) {
                if (result.get(result.size() - 1) == 1) {
                    result.remove(result.size() - 1);
                } else {
                    result.set(result.size() - 1, result.get(result.size() - 1) - 1);
                    while (result.size() < N) {
                        result.add(K);
                    }
                }
            }
        }

        StringJoiner joiner = new StringJoiner(" ");
        for (int number : result) {
            joiner.add(String.valueOf(number));
        }

        System.out.println(joiner.toString());
        scanner.close();
    }
}