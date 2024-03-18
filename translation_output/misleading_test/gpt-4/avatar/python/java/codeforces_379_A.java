Here's how you could translate the given Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a;
        int h = 0;
        int s = 0;

        while (x > 0) {
            x -= 1;
            h += 1;
            s += 1;
        }
        while (s / b != 0) {
            h += 1;
            s = s - b + 1;
        }
        
        System.out.println(h);
        sc.close();
    }
}
```

Here, we use a `Scanner` to get the input from the user, two while loops to implement the logic in the Python code, and then we print the result to the console with `System.out.println(h)`. The Java code will calculate the same result as the Python code for the same inputs.
