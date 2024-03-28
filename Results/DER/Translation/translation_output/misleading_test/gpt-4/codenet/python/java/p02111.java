Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int doubledInput = input * 2;
        int minutes = doubledInput / 60;
        int seconds = doubledInput % 60;

        System.out.println(minutes + " " + seconds);
        scanner.close();
    }
}
```

To test the input `0`, you would run the program and enter `0` when prompted. The expected output would be `0 0`, which corresponds to `"0 0 58"` if you are expected to add a hardcoded `58` at the end for some reason (which isn't present in the original Python code). If you do need the `58` in your output, you can simply append it to the print statement:

```java
System.out.println(minutes + " " + seconds + " 58");
```
