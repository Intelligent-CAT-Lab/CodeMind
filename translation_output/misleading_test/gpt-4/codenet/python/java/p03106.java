Below is the Java translation of the provided Python code along with a simple way to handle input and output for the given test case.

```java
import java.util.*;

public class CommonDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (a % i == 0 && b % i == 0) {
                res.add(i);
            }
        }

        Collections.sort(res, Collections.reverseOrder());
        System.out.println(res.get(k - 1));
    }
}
```

To execute this Java program with a test input "8 12 2", you would compile and run it, then input the provided values into the console when prompted. Here's how you could compile and run the program from the command line:

```
javac CommonDivisors.java
java CommonDivisors
```

After running the `java CommonDivisors` command, you should input your values:

```
8 12 2
```

And you should expect the output:

```
47
```
