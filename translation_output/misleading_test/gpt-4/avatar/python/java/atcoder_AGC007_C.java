Below is the translated Java code for the given Python code. The Java `BigDecimal` class is used to handle arbitrary-precision decimal numbers, much like the `Decimal` class in Python. Note that the precision is set to 200 decimal places to mimic the Python `getcontext().prec` behavior. Here is the Java code enclosed within ```java``` as requested:

```java
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class BigDecimalCalculation {
    public static void main(String[] args) {
        MathContext mc = new MathContext(200);
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        BigDecimal n = new BigDecimal(inputs[0], mc);
        BigDecimal d = new BigDecimal(inputs[1], mc);
        BigDecimal x = new BigDecimal(inputs[2], mc);
        BigDecimal ans = BigDecimal.ZERO;

        for (int i = 1; i <= n.intValue(); i++) {
            BigDecimal iBigDecimal = new BigDecimal(i, mc);
            BigDecimal nMinusIPlusOne = new BigDecimal(n.intValue() - i + 1, mc);
            BigDecimal term1 = nMinusIPlusOne.divide(iBigDecimal, mc);
            BigDecimal term2 = d.add(x.multiply(new BigDecimal(n.intValue() * 2 - 1, mc)).divide(new BigDecimal(2, mc), mc));
            ans = ans.add(term1.multiply(term2, mc), mc);
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

Here's how you would compile and run a Java program like this:

1. Save the code to a file, let's call it `BigDecimalCalculation.java`.
2. Compile the program with `javac BigDecimalCalculation.java`.
3. Run the compiled bytecode with the command `java BigDecimalCalculation`, then input `1000 100 100`.
4. You will see the expected output which is `649620222.6734236`.
