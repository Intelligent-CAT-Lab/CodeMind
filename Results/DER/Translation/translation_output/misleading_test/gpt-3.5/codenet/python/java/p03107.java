```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] A = input.toCharArray();
        int N = A.length;

        int C0 = 0;
        int C1 = 0;
        for (char c : A) {
            if (c == '0') {
                C0++;
            } else if (c == '1') {
                C1++;
            }
        }

        System.out.println(2 * Math.min(C0, C1));
    }
}
```
