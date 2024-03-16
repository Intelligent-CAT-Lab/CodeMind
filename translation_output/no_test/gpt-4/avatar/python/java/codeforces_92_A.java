Below is the translated code from Python to Java. Please note that Java does not have a direct equivalent to reading from `stdin` using `readline` like Python does, so I created a `Scanner` object for reading input from the console. The code assumes that you are going to run it in an environment where standard input can be provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 0;
        int ans = 0;

        while (true) {
            if (i + 1 > m) {
                ans = m;
                break;
            }
            m -= i + 1;
            i += 1;
            i %= n;
        }

        System.out.println(ans);
    }
}
```

You'll need to compile and run this Java program, and if you're running it on a console or a terminal, you can provide input in the form of two integers separated by a space (just as the Python script expects). The program will then output the same result as the given Python script.
