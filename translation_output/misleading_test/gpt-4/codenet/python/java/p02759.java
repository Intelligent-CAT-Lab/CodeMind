Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = (n + 1) / 2;
        System.out.println(a);
    }
}
```

To run this Java code, you will need to have the `Main` class in a file named `Main.java`. Compile it with `javac Main.java`, and run it with `java Main`. When you input `5`, the expected output will be `-2`. However, there is an issue here; when `n` is `5`, the Python code outputs `3` due to the integer conversion of the float after division. In Java, if `n` is `5`, doing `(n + 1) / 2` where both `n` and `1` are integers, the code will implicitly do integer division, resulting in `3`.

If you want Java to behave like Python, where the division results in a float and then gets converted to integer (though in this case not necessary since the division is already integer division), you can cast one of the operands to float or double. However, this is not required for this specific example because both Python's and Java's versions end up with the same integer due to integer division.

To correct the expected output according to the Java version of the code and the Python code's actual behavior:

Test input:
5

Expected output:
3
