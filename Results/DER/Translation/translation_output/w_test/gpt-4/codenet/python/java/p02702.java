To translate the provided Python code to Java, we need to remember that Java is strictly typed and requires defining the type of each variable. Moreover, the method `pow` from Python's standard library is not available in Java in the same form, and input/output is handled differently. We will utilize `BigInteger` for handling the modulo operation due to the size of numbers we might be dealing with.

Below is the translated Java code:
```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] remain = new int[2020];
        BigInteger now = BigInteger.ZERO;
        int ans = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            now = now.add(new BigInteger(s.substring(i, i + 1)).multiply(
                    BigInteger.TEN.pow(s.length() - i - 1)).mod(BigInteger.valueOf(2019)));
            int nowMod2019 = now.mod(BigInteger.valueOf(2019)).intValue();
            ans += remain[nowMod2019];
            remain[nowMod2019]++;
        }

        ans += remain[0];

        System.out.println(ans);
        sc.close();
    }
}
```
To execute this Java code, place it in the `Main.java` file, compile it using `javac Main.java`, and run it using `java Main`. Provide the test input when prompted, and the program will produce the expected output.
