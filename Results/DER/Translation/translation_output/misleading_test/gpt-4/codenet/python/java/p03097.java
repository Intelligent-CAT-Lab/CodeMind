Here's the Python code translated to Java, formatted as requested:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrayPath {
    
    private static int popCount(int x) {
        int res = 0;
        for (int i = 0; i < 17; i++) {
            res += ((x >> i) & 1) == 1 ? 1 : 0;
        }
        return res;
    }

    private static List<Integer> f(int m, int x, int y) {
        if (m == 1) {
            if (x == 0) {
                List<Integer> singleCase = new ArrayList<>();
                singleCase.add(0);
                singleCase.add(1);
                return singleCase;
            } else {
                List<Integer> singleCase = new ArrayList<>();
                singleCase.add(1);
                singleCase.add(0);
                return singleCase;
            }
        }
        
        List<Integer> res = new ArrayList<>();
        res.add(x);

        int diff = 0;
        for (int i = 0; i < m; i++) {
            if (((x >> i) & 1) != ((y >> i) & 1)) {
                diff = i;
                break;
            }
        }
        
        int s = (x % (1 << diff)) + (((x / (1 << (diff+1))) * (1 << (diff+1))) >> 1);
        int t = (y % (1 << diff)) + (((y / (1 << (diff+1))) * (1 << (diff+1))) >> 1);
        int u = s ^ 1;
        
        List<Integer> left = f(m - 1, s, u);
        List<Integer> right = f(m - 1, u, t);
        
        int xBit = (x >> diff) & 1;
        int yBit = (y >> diff) & 1;
        
        for (int i = 0; i < left.size(); i++) {
            left.set(i, (left.get(i) % (1 << diff)) + ((1 << diff) * xBit) + (((left.get(i) / (1 << diff)) * (1 << diff)) << 1));
        }
        
        for (int i = 0; i < right.size(); i++) {
            right.set(i, (right.get(i) % (1 << diff)) + ((1 << diff) * yBit) + (((right.get(i) / (1 << diff)) * (1 << diff)) << 1));
        }
        
        List<Integer> combined = new ArrayList<>(left);
        combined.addAll(right);
        
        return combined;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if ((popCount(a ^ b) % 2) == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            List<Integer> results = f(n, a, b);
            for (int num : results) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
```

This Java program defines a class `GrayPath` with the function `f` and `popCount` equivalent to the ones in Python. It accepts input via `Scanner` and prints out the results just as the Python program would. Note that the Java version replaces list comprehensions and operations with loops and manual index management, which is more in line with typical Java practices.
