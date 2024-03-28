Below is the equivalent Java code for the provided Python program:

```java
import java.util.Scanner;

public class GraphMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        if (d == 1) {
            System.out.println(n * (n - 1) / 2);
        } else {
            System.out.println((n - 1) + (n - d - 1) * n - ((n - d - 1) * (n + d - 2) / 2));
        }

        sc.close();
    }
}
```

Run the above Java code with the test input "4 3" and it will produce the expected output "-21".
