import java.util.*;

public class p03769 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> X = calc(N, 1);
        System.out.println(X.size());
        System.out.println(X.stream().mapToInt(i -> Integer.parseInt(i)).sum());
    }

    public static List<String> calc(int N, int k) {
        List<String> fact = new ArrayList<>(Arrays.asList(1));
        for (int i = 1; i <= 100; i++) {
            fact.add(fact.get(fact.size() - 1) * i);
        }

        int C = fact.get(k);
        int sC = 0;
        for (int i = 1; i <= Math.min(k, N - k); i++) {
            sC += C * C;
        }

        List<String> ret = new ArrayList<>();
        int rem = N - ((1 << k) - 1);
        int kk = k + 1;
        int i = 1;
        while ((1 << (i + 1)) - 1 <= N) {
            i++;
        }

        ret.addAll(Arrays.asList(repeat(kk, rem)));
        kk++;
        i = 1;
        j = i / 2;

        while (j > 0) {
            List<String> tmp = new ArrayList<>();
            for (int jj = 0; jj < Math.min(i, j); jj++) {
                tmp.add(repeat(kk, jj));
            }
            ret.addAll(tmp);
            kk++;
            rem -= sC;
            j--;
        }

        return ret;
    }

    public static List<String> repeat(int k, int n) {
        List<String> ret = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ret.add(repeat(k, 1));
        }
        return ret;
    }

    public static String repeat(int k, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(k);
        }
        return sb.toString();
    }
}