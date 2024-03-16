Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class OddDigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            String hoge = Integer.toString(i + 1);
            if (hoge.length() % 2 == 1) {
                ans++;
            }
        }
        
        System.out.println(ans);
        scanner.close();
    }
}
```

To test the provided test case with the input `11`, you would compile and run the `OddDigitCounter` class, then input `11` when prompted. The expected output would be `9`, as in the Python script.
