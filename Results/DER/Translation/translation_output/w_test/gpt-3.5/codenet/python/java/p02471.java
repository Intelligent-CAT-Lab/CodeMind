```java
import java.util.Scanner;

public class ExtendedGCD {
    
    public static int[] extendedGCD(int a, int b) {
        if (a < b) {
            int[] result = rec(b, a);
            int temp = result[0];
            result[0] = result[1];
            result[1] = temp;
            return result;
        } else {
            return rec(a, b);
        }
    }
    
    public static int[] rec(int a, int b) {
        if (a < b) {
            int[] result = rec(b, a);
            int temp = result[0];
            result[0] = result[1];
            result[1] = temp;
            return result;
        }
        
        int q = a / b;
        int r = a % b;
        
        if (r == 0) {
            int[] result = {0, 1, b};
            return result;
        }
        
        int[] prevResult = rec(b, r);
        int x = prevResult[1];
        int y = prevResult[0] - q * prevResult[1];
        int gcd = prevResult[2];
        
        int[] result = {x, y, gcd};
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        
        int[] result = extendedGCD(a, b);
        int x0 = result[0];
        int y0 = result[1];
        
        int dx = b / result[2];
        int dy = -a / result[2];
        
        if (dx < 0) {
            dx = -dx;
            dy = -dy;
        }
        
        int x = x0;
        int y = y0;
        int mag = Math.abs(x) + Math.abs(y);
        
        while (true) {
            int x1 = x + dx;
            int y1 = y + dy;
            int mag1 = Math.abs(x1) + Math.abs(y1);
            if (mag1 >= mag) {
                break;
            }
            mag = mag1;
            x = x1;
            y = y1;
        }
        
        while (true) {
            int x1 = x - dx;
            int y1 = y - dy;
            int mag1 = Math.abs(x1) + Math.abs(y1);
            if (mag1 > mag) {
                break;
            }
            mag = mag1;
            x = x1;
            y = y1;
        }
        
        System.out.println(x + " " + y);
    }
}
```  
