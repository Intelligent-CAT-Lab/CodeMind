```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();
        
        String[] input = new String[]{String.valueOf(n), String.valueOf(m), String.valueOf(r)};
        
        int[] data = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            data[i] = Integer.parseInt(input[i]);
        }
        
        int a = Math.max(n-1, r-m*n);
        int b = Math.min(n-1, r-m*n);
        
        int d = 1;
        for (int i = 1; i <= a; i++) {
            d *= i;
        }
        
        int u = 1;
        for (int i = b+1; i <= a+b; i++) {
            u *= i;
        }
        
        System.out.println((a < 1) ? 0 : u/d);
    }
}
```
```
