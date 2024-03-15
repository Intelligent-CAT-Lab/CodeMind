```java
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int D1 = scanner.nextInt();
        int D2 = scanner.nextInt();
        
        Judge j1 = judge(D1);
        Judge j2 = judge(D2);
        
        int cnt = 0;
        for (int x = 0; x < N * 2; x++) {
            for (int y = 0; y < N * 2; y++) {
                if (j1.apply(x, y) && j2.apply(x, y)) {
                    System.out.println(x + " " + y);
                    cnt++;
                    if (cnt >= N * N) {
                        break;
                    }
                }
            }
            if (cnt >= N * N) {
                break;
            }
        }
    }

    public static Judge judge(int D) {
        int n = 1;
        while (D % 4 == 0) {
            n *= 2;
            D /= 4;
        }
        
        return (x, y) -> (~(x / n + y / n) % 2 == 1) ? 1 : 0;
    }

    interface Judge {
        int apply(int x, int y);
    }
}
```
