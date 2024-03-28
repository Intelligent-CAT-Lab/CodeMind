```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int n = Integer.parseInt(scanner.nextLine().split(" ")[0]);
            System.out.println((int) Math.pow(n, 3));
        }
    }
}
```
