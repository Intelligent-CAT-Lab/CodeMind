```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        
        int[] Ts = new int[N];
        int offset = L - 1;
        int absmin = Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;
        
        for (int i = 1; i <= N; i++) {
            Ts[i-1] = i + offset;
            if (Math.abs(i + offset) < absmin) {
                absmin = Math.abs(i + offset);
                mini = i + offset;
            }
        }
        
        int sumTs = 0;
        for (int t : Ts) {
            sumTs += t;
        }
        
        System.out.println(sumTs - mini);
    }
}
```
```
