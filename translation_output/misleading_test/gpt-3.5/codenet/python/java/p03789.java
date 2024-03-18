```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        char[] n = input.toCharArray();
        int lb = 0;
        int ub = n.length;
        
        int result = 0;
        
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(9 * mid, n)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        
        result = ub;
        System.out.println(result);
    }
    
    public static boolean check(int x, char[] n) {
        int g = 0;
        for (char c : n) {
            x -= (x + g - Character.getNumericValue(c)) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}
```
