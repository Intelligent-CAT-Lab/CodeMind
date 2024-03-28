Certainly! Below is the translated Java code for the given Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int p = scanner.nextInt();

        System.out.println((3 * a + p) / 2);

        scanner.close();
    }
}
```

For the sample test input:

```
1 3
```

The expected Java output would be:

```
-52
```

However, please notice that the original Python code uses integer division (//), which in Java happens by default when dividing two integers. But the output `-52` seems wrong according to the formula `(3 * a + p) / 2`. If `a=1` and `p=3`, the output should be `5`. Please ensure that your test case and expected output are accurate. If `-52` is indeed the expected output, it suggests there might be an error in the logic or the test case provided.
