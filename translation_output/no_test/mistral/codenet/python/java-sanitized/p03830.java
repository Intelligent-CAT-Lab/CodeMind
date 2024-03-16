import java.util.*;

public class p03830 {
    static int inf = (int) 1e20;
    static int mod = (int) 1e9 + 7;

    static List<Integer> LI() {
        Scanner sc = new Scanner(System.in);
        return Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
    }

    static int II() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static String S() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static List<String> LS() {
        Scanner sc = new Scanner(System.in);
        return Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
    }

    static List<Integer> factorization(int n) {
        List<Integer> buff = new ArrayList<>();
        int c, m;
        c = 0;
        while (n % 2 == 0) {
            c++;
            n /= 2;
        }
        buff.add(new int[]{2, c});
        c = 0;
        m = 3;
        while (m * m <= n) {
            c = 0;
            while (n % m == 0) {
                c++;
                n /= m;
            }
            buff.add(new int[]{m, c});
            if (m % 6 == 5) {
                m += 2;
            } else {
                m += 4;
            }
        }
        if (n > 1) {
            buff.add(new int[]{n, 1});
        }
        return buff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> f = factorization(i);
            for (int k : f) {
                d.put(k, d.getOrDefault(k, 0) + f.get(1));
            }
        }
        int r = 1;
        for (int c : d.values()) {
            r *= (c + 1);
            r %= mod;
        }
        System.out.println(r);
    }
}