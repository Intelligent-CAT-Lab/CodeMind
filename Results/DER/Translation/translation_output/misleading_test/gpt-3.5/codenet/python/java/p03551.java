```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int time = 1900*M + (N-M)*100;
        System.out.println(time*(int)Math.pow(2, M));
    }
}
```
