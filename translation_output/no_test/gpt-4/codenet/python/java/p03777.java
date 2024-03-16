Here's the equivalent Java code for your Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        String a = parts[0];
        String b = parts[1];

        if (a.equals("H")) {
            System.out.println(b);
        } else {
            if (b.equals("H")) {
                System.out.println("D");
            } else {
                System.out.println("H");
            }
        }
        
        scanner.close();
    }
}
```

Make sure you have the `Scanner` import at the top, and note that in Java, string comparison is done using `.equals()` rather than `==`.
