```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] result = ij((int) Math.sqrt(n), n);
        int sum = result[0] + result[1];
        
        System.out.println(sum - 2);
    }
    
    public static int[] ij(int x, int n) {
        int[] result = new int[2];
        for (int i = x; i > 0; i--) {
            if (n % i == 0) {
                result[0] = i;
                result[1] = n / i;
                break;
            }
        }
        return result;
    }
}
```
