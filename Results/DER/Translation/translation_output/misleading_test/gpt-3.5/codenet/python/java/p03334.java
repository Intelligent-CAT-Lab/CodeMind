```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D1 = sc.nextInt();
        int D2 = sc.nextInt();
        
        int n = 1;
        while (D1 % 4 == 0) {
            n *= 2;
            D1 /= 4;
        }

        int n2 = 1;
        while (D2 % 4 == 0) {
            n2 *= 2;
            D2 /= 4;
        }

        int[][] res = new int[N*N][2];
        int index = 0;

        for (int x = 0; x < N*2; x++) {
            for (int y = 0; y < N*2; y++) {
                if ((~(x/n+y/n)%2 == 1) && (~(x/n2)%2 == 1)) {
                    res[index][0] = x;
                    res[index][1] = y;
                    index++;
                    if (index >= N*N)
                        break;
                }
            }
            if (index >= N*N)
                break;
        }

        for (int i = 0; i < N*N; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }
    }
}
```
