```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static ArrayList<Integer> six;
    private static ArrayList<Integer> nine;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        six = new ArrayList<>();
        nine = new ArrayList<>();
        
        for (int i = 7; i >= 1; i--) {
            six.add((int) Math.pow(6, i));
            nine.add((int) Math.pow(9, i));
        }
        
        Collections.reverse(six);
        Collections.reverse(nine);
        
        System.out.println(DP(N));
    }

    public static int DP(int n) {
        if (n < 6) {
            return n;
        }
        
        int tmp = n;
        int count6 = 0;
        int count9 = 0;
        
        for (int sixx : six) {
            if (sixx <= n) {
                n -= sixx;
                count6 = 1;
                break;
            }
        }
        
        count6 += DP(n);
        n = tmp;
        
        if (n < 9) {
            return count6;
        }
        
        for (int ninee : nine) {
            if (ninee <= n) {
                n -= ninee;
                count9 = 1;
                break;
            }
        }
        
        count9 += DP(n);
        n = tmp;
        
        return Math.min(count6, count9);
    }
}
```
