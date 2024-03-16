```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append("ACL");
        }
        System.out.println(sb.toString());
    }
}
```
