Here's the Python code translated to Java. Please note that we're assuming the input will be given via command-line arguments for this implementation.

```java
public class Main {
    public static void main(String[] args) {
        // Assuming the input is given as command-line arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int t = 0;
        boolean found = false;

        for (int loop = 0; loop < 61; loop++) {
            if (t % 60 <= c && c <= t % 60 + a) {
                System.out.println(t / 60 * 60 + c);
                found = true;
                break;
            }
            t += a + b;
        }

        if (!found) {
            System.out.println(-1);
        }
    }
}
```

To run this Java program, compile it using `javac Main.java` and then run it passing the test input as arguments like so: `java Main 10 10 5`. The expected output would be `86`, as per your provided test case.
