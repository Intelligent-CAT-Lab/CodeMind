Certainly! Below is the Python code translated into Java:

```java
import java.util.HashMap;
import java.util.Scanner;

public class TaxIncludedPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        HashMap<Integer, Integer> dic = new HashMap<>();
        for (int i = 1; i <= 50000; i++) {
            int p = (int)(i * 1.08);
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

To run a test case on this code in Java, you could simply input `432` when prompted after running the program, and you should see `401` as the output, which is the expected result. If you run the program in a console or command line, input the number and press enter. The program reads the input, processes it, and prints the result or ":(" if no solution is found.
