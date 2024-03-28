```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int i = 0;

        while (n / Math.pow(k, i) != 0) {
            i++;
        }

        System.out.println(i);
    }
}
```
