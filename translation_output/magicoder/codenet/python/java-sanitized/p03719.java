import java.util.*;

public class p03719 {

    // Set max recursion limit
    static final int MAX_RECURSION_LIMIT = 1000000;

    // Debug output
    static void chkprint(Object... args) {
        Map<Integer, String> names = new HashMap<>();
        for (Map.Entry<String, Object> entry : new HashMap<>(Thread.currentThread().getStackTrace()[2].getLocalVariables()).entrySet()) {
            names.put(System.identityHashCode(entry.getValue()), entry.getKey());
        }
        System.out.println(Arrays.toString(args).replaceAll("\\[|\\]", "").replaceAll("\\s+", ", ").replaceAll("=", " = "));
    }

    // Binary converter
    static String to_bin(int x) {
        return Integer.toBinaryString(x);
    }

    static List<Integer> li_input() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        return list;
    }

    static int gcd(int n, int m) {
        if (n % m == 0) {
            return m;
        } else {
            return gcd(m, n % m);
        }
    }

    static int gcd_list(List<Integer> L) {
        int v = L.get(0);

        for (int i = 1; i < L.size(); i++) {
            v = gcd(v, L.get(i));
        }

        return v;
    }

    static int lcm(int n, int m) {
        return (n * m) / gcd(n, m);
    }

    static int lcm_list(List<Integer> L) {
        int v = L.get(0);

        for (int i = 1; i < L.size