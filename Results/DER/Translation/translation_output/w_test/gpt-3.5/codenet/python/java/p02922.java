```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 1;
        int ans = 0;

        while (total < b) {
            ans++;
            total += a - 1;
        }

        System.out.println(ans);
    }
}
```
