Certainly! Here is the equivalent Java code for the provided Python script.

```java
import java.util.HashMap;
import java.util.Scanner;

public class ChristmasDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        HashMap<Integer, String> d = new HashMap<>();
        d.put(25, "Christmas");
        d.put(24, "Christmas Eve");
        d.put(23, "Christmas Eve Eve");
        d.put(22, "Christmas Eve Eve Eve");

        System.out.println(d.get(D));
    }
}
```

To test it with the input `25`, you would run the Java program and input `25` when prompted. The expected output would be `Christmas`, just as with the Python script.
