import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p03561 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int K = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        if (K % 2 == 0) {
            System.out.println(Arrays.toString(new int[]{K / 2}).toString().replace("[", "").replace("]", "").replace(" ", "") + " " + String.join(" ", new String[N - 1]));
        } else {
            List<Integer> X = new ArrayList<>();
            X.add((K + 1) / 2);
            for (int i = 0; i < N / 2; i++) {
                if (X.get(X.size() - 1) == 1) {
                    X.remove(X.size() - 1);
                } else {
                    X.set(X.size() - 1, X.get(X.size() - 1) - 1);
                    for (int j = 0; j < N - X.size(); j++) {
                        X.add(K);
                    }
                }
            }
            System.out.println(String.join(" ", X.stream().map(String::valueOf).toArray(String[]::new)));
        }
    }
}