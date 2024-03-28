Here is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        char[][] ans = new char[(1 << n) - 1][(1 << m) - 1];
        for (int i = 0; i < (1 << n) - 1; ++i) {
            for (int j = 0; j < (1 << m) - 1; ++j) {
                ans[i][j] = '1';
            }
        }

        for (int k = 1; k < 11; ++k) {
            for (int i = (1 << k); i < (1 << n); i += (1 << k)) {
                for (int j = (1 << k); j < (1 << m); j += (1 << k)) {
                    if (ans[i - 1][j - 1] == '1') {
                        ans[i - 1][j - 1] = '0';
                    } else {
                        ans[i - 1][j - 1] = '1';
                    }
                }
            }
        }

        for (int i = 0; i < (1 << n) - 1; ++i) {
            System.out.println(new String(ans[i]));
        }
    }
}
```

To compile and run the program, save the code in a file named `Main.java` and use the following commands in your terminal:

```shell
javac Main.java
java Main
```

You will be prompted to enter the test input. After entering "1 2" (without quotes) and pressing Enter, you should get the expected output `131`.
