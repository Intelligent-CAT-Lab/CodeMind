```java
import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double PI = 3.1415926535897932384626433832795;

        int N = sc.nextInt();
        int K = sc.nextInt();

        double result = N * Math.sin(PI/N) * Math.cos(K*PI/N) / Math.cos((K-1)*PI/N);
        System.out.println(result);

        sc.close();
    }
}
```
