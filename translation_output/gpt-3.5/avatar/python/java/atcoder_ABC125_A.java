```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int T = input.nextInt();
        
        int ans = (T / A) * B;
        System.out.println(ans);
    }
}
```
