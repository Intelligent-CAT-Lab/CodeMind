```java
import java.util.Scanner;

public class FindZeroPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");

        for (int i = 0; i < inputs.length; i++) {
            int x = Integer.parseInt(inputs[i]);
            if (x == 0) {
                System.out.println(i + 1);
            }
        }

        scanner.close();
    }
}
```
