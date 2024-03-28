```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        int t = 1;
        int n = 1;
        int a = 1;
        
        while (true) {
            n = (K + a - 1) / K;
            a += n;
            
            if (N < a) {
                break;
            }
            
            t++;
        }
        
        System.out.println(t);
    }
}
```
