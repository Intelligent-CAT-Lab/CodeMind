Certainly! Below is the equivalent Java code for the provided Python script:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] a = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(a);

        int[] b = {1, 4, 7, 9};
        boolean isEqual = Arrays.equals(a, b);

        String ans = isEqual ? "YES" : "NO";
        System.out.println(ans);
    }
}
```

Here's how you could use it as a test case with the provided input and check the expected output:

Test input:
```
1 7 9 4
```

Expected output:
```
YES
```

Please note that you will need to run this Java code using a compiler or an IDE like IntelliJ IDEA, Eclipse, or NetBeans. When you run this program, it will wait for your input in the console. After you input the numbers and press Enter, it will print the result.

Also, remember that Java is case-sensitive, so the expected output is "YES" instead of "YoES," as the latter seems to be a typographical error in your Python code example.
