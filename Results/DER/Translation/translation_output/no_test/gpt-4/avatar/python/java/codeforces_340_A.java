Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ▁ ");
        
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);

        int lcm = LCM(x, y);
        System.out.println(b / lcm - (a - 1) / lcm);

        scanner.close();
    }

    public static int GCD(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
}
```

Please note that I've replaced the '▁' character with a regular whitespace in the `split` function, as Java strings don't usually handle non-standard whitespace characters like '▁'. Ensure that the actual delimiter for input data is correctly specified. Additionally, Java uses integer division for ints, so there's no need for the floor division operator `//` used in Python; a regular `/` is sufficient.
