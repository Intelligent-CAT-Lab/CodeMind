Here is the Java version of your Python code:

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());

        Map<Integer, Integer> dic = new HashMap<>();
        for (int i = 1; i < 50001; i++) {
            int p = (int) (i * 1.08);
            dic.put(p, i);
        }
        if (dic.containsKey(n)) {
            System.out.println(dic.get(n));
        } else {
            System.out.println(":(");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the console, creates a HashMap to store the results of the calculation, and then checks if the input integer is in the HashMap. If it is, it prints the corresponding value; otherwise, it prints ":(".
