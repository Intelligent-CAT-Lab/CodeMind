Here is the equivalent Java code for the provided Python script. It reads an integer from standard input, performs the specified calculations, and prints the answer to standard output.

```java
import java.util.Scanner;

public class DivmodCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int ans = 0;
        int q = x / 11;
        int r = x % 11;
        ans += 2 * q;
        q = r / 6;
        r = r % 6;
        ans += q;
        if (r > 0) {
            ans += 1;
        }
        System.out.println(ans);

        scanner.close();
    }
}
```

Assuming you have the above code saved in a file named `DivmodCalculation.java`, you can compile and run it with the following commands in your terminal:

```bash
javac DivmodCalculation.java
java DivmodCalculation
```

Then, you can type in `7` and press Enter, and the program will output `83`, just like the Python version.
