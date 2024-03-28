import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class atcoder_ABC169_D {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        List<Pair> l = factorization(x);
        Collections.sort(l);
        
        int ans = 0;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).key == 1) {
                continue;
            } else {
                int s = 0;
                int num = l.get(i).value;
                int j = 1;
                if (num != 1) {
                    for (j = 1; j < num; j++) {
                        s += j;
                        if (s == num) {
                            break;
                        } else if (s > num) {
                            j--;
                            break;
                        }
                    }
                }
                ans += j;
            }
        }
        System.out.println(ans);
        scanner.close();
    }

    public static List<Pair> factorization(long n) {
        List<Pair> arr = new ArrayList<>();
        long temp = n;
        for (int i = 2; i <= (int) Math.sqrt(n) + 1; i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr.add(new Pair(i, cnt));
            }
        }
        if (temp != 1) {
            arr.add(new Pair(temp, 1));
        }
        if (arr.isEmpty()) {
            arr.add(new Pair(n, 1));
        }
        return arr;
    }
    
    static class Pair implements Comparable<Pair> {
        long key;
        int value;
        
        Pair(long key, int value) {
            this.key = key;
            this.value = value;
        }
        
        @Override
        public int compareTo(Pair other) {
            return Long.compare(this.key, other.key);
        }
    }
}