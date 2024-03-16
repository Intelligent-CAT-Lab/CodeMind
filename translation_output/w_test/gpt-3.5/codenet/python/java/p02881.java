```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] result = ij((int) Math.sqrt(n), n);
        int sum = result[0] + result[1];

        System.out.println(sum - 2);
    }

    public static int[] ij(int x, int n) {
        int[] res = new int[2];
        for (int i = x; i > 0; i--) {
            if ((double) n / i == n / i) {
                res[0] = i;
                res[1] = n / i;
                return res;
            }
        }
        return res;
    }
}
```  
