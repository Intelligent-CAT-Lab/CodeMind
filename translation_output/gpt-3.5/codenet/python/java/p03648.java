```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        System.out.println(50);

        int a = K / 50;
        int b = K % 50;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 50 - b; i++) {
            sb.append(a + i).append(" ");
        }

        for (int i = 0; i < b; i++) {
            sb.append(a + 50 - b + i + 1).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}
```
