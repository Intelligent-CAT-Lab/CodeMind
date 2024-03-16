Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] l = new int[3];

        for (int i = 0; i < 3; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);

        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (l[i] % 2 == 0) {
                ans = 0;
                break;
            } else {
                ans = l[0] * l[1];
            }
        }
        System.out.println(ans);
        scanner.close();
    }
}
```

To compile and execute this Java program, you would use a Java compiler to compile it, and then run the compiled program with Java Runtime Environment (JRE). When you run it, it will wait for you to input three integer numbers separated by spaces, and then it will output the result according to the logic defined in the code.
