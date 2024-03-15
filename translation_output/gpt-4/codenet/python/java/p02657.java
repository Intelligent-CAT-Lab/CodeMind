Here is the equivalent Java code for the Python snippet you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        System.out.println(L * R);

        scanner.close();
    }
}
```

Make sure to include the `import java.util.Scanner;` line to use the `Scanner` class for input. Also, the Scanner should be closed after its use to release the resources.
