```java
import java.util.*;
import java.io.*;

class Main {
    static int[] dd = {-1, 0, 1, 0};
    
    static List<Integer> LI() {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        for (String input : inputs) {
            list.add(Integer.parseInt(input));
        }
        return list;
    }
    
    static int I() {
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
    
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(0);
        for (int i = 1; i < 50000; i++) {
            a.add(a.get(a.size() - 1) + i);
        }

        int n = I();

        int t = Collections.binarySearch(a, n);
        if (t < 0) {
            t = -t - 1;
        }

        int[] r = new int[t * 2];
        Arrays.fill(r, 1, t, 0);

        for (int i = 0; i < t; i++) {
            int ai = a.get(t - i);
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                int tiMinusTs = ti - ts;
                r[ti] = r[ti] ^ r[tiMinusTs];
                r[tiMinusTs] = r[ti] ^ r[tiMinusTs];
                r[ti] = r[ti] ^ r[tiMinusTs];
                n -= t - ts;
            } else {
                break;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i : r) {
            result.append(i == 1 ? "(" : ")");
        }

        System.out.println(result.toString());
    }
}
```
