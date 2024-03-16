```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int N = input.nextInt();
        
        System.out.println((int)Math.floor(A * Math.min(B-1, N) / B));
    }
}
```
