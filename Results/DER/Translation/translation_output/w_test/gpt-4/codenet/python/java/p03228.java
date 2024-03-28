Below is the Java translation of the provided Python code. The equivalent Java code takes a string input, splits it by spaces into an array, then converts the string values into integers. The main logic is inside a for-loop that implements the distribution of halves between `a` and `b`. After the loop, it prints the final values of `a` and `b`.

```java
import java.util.Scanner;

public class DistributionGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
        int turn = 0;

        for (int i = 0; i < k; i++) {
            if (turn == 0) {
                if (a % 2 == 0) {
                    b += a / 2;
                    a -= a / 2;
                } else {
                    a -= 1;
                    b += a / 2;
                    a -= a / 2;
                }
                turn = 1;
            } else {
                if (b % 2 == 0) {
                    a += b / 2;
                    b -= b / 2;
                } else {
                    b -= 1;
                    a += b / 2;
                    b -= b / 2;
                }
                turn = 0;
            }
        }
        System.out.println(a + " " + b);
    }
}
```

Please note that Java is statically typed, so all variables need to be declared with their type before use. Additionally, since Java does not have built-in tuple assignments like Python, input parsing is done manually. The input assumption here is that the user enters three integers on one line, separated by spaces.
