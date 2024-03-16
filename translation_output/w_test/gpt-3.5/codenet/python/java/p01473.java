```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int lS = S.length();
        
        int[] d = new int[256];
        for (char c : S.toCharArray()) {
            d[c]++;
        }
        
        int dd = 0;
        for (int i : d) {
            dd += i % 2;
        }
        
        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            long dnm = 1;
            for (int i : d) {
                dnm *= factorial(i / 2);
            }
            System.out.println(factorial(lS / 2) / dnm);
        }
    }
  
    static long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
```
