Here's the Python code translated into Java. Please note that Java doesn't have a direct equivalent to Python's `input()`, so `Scanner` is used for console input. Additionally, exception handling is added to properly manage the resource (`Scanner`).

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String[]> arrData = getInputData();
        int r1 = Integer.parseInt(arrData.get(0)[0]);
        int r2 = Integer.parseInt(arrData.get(0)[1]);

        System.out.println(1.0 / ((r2 + r1) / (double)(r1 * r2)));
    }

    private static ArrayList<String[]> getInputData() {
        ArrayList<String[]> arrayResult = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {
            arrayResult.add(scanner.nextLine().split(" "));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (!line.isEmpty()) {
                    arrayResult.add(line.split(" "));
                } else {
                    break;
                }
            }
        } finally {
            scanner.close();
        }

        return arrayResult;
    }
}
```

Remember that this Java program needs to be in a file named `Main.java` because of the public class named `Main`. Users will need to enter their input in the console similar to how input is provided in Python.

The output will be a little different due to the floating-point division, and the behavior won't be exactly the same since Java's IO operations behave differently, especially in cases of EOF and error handling.
