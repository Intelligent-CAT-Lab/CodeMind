Here's the given Python code translated into Java:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String s = reader.readLine().trim();
            if (s.equals("RRR")) {
                System.out.println(3);
            } else if (s.equals("RRS") || s.equals("SRR")) {
                System.out.println(2);
            } else if (!s.contains("R")) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

To test this code with the input "RRS", you would run the program and provide "RRS" as the input, probably through the console or a file redirect, depending on how your Java environment is set up. The expected output for this input would be `2`.

Note that the `mod` variable and the method `readline` in the Python code are not used, so they have been omitted from the Java translation. Also, the `solve` function has been integrated directly into the `main` method, as Java execution starts from the `main` method.
