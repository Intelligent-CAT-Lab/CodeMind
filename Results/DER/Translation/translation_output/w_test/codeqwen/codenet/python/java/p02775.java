Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] n = input.toCharArray();
        int s = 0;
        int res = 0;
        for (int i = n.length - 1; i >= 0; i--) {
            int ni = Character.getNumericValue(n[i]);
            int k = ni + s;
            if (k < 5 || (k == 5 && Character.getNumericValue(n[i + 1]) < 5)) {
                res += k;
                s = 0;
            } else {
                res += 10 - k;
                s = 1;
            }
        }
        res += s;
        System.out.println(res);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, reverses it, and then calculates the minimum number of operations needed to make the sum of digits even. The result is then printed to the console.
