Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(main());
    }

    public static String main() {
        String s = System.console().readLine();
        int l = s.length();
        int n = Integer.parseInt(s);
        int m = Integer.MAX_VALUE;
        String r = "";
        int t = (int) Math.pow(10, l);
        for (int[] a : permutations(10, l)) {
            int b = 0;
            for (int c : a) {
                b = b * 10 + c;
            }
            int tm = Math.max(Math.abs(n - b), t - Math.abs(n - b));
            if (m > tm) {
                m = tm;
                r = Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining());
            }
        }
        return r;
    }

    public static List<int[]> permutations(int n, int k) {
        List<int[]> result = new ArrayList<>();
        int[] a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = i;
        }
        while (true) {
            result.add(Arrays.copyOf(a, a.length));
            if (!nextPermutation(a)) {
                break;
            }
        }
        return result;
    }

    public static boolean nextPermutation(int[] a) {
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = a.length - 1;
        while (j > i && a[j] <= a[i]) {
            j--;
        }
        int temp = a[i];
        
