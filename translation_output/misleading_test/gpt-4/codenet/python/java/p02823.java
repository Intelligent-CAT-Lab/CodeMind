Certainly! Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result;

        if ((A - B) % 2 == 0) {
            result = (B - A) / 2;
        } else {
            result = Math.min(A - 1, N - B) + 1 + (B - A) / 2;
        }

        System.out.println(result);
    }
}

```

To replicate the test case you've provided in the Java program, you would input "5 2 4" (without quotes) when prompted. The expected output, as per the Python script, would be -61.
