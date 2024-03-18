Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        sc.close();

        if (R - L > 2019) {
            System.out.println(0);
        } else {
            List<Integer> l = new ArrayList<>();
            for (int i = L; i <= R; i++) {
                for (int j = i + 1; j <= R; j++) {
                    l.add(i * j % 2019);
                }
            }
            System.out.println(l.stream().min(Integer::compare).get());
        }
    }
}
```

The Java code uses `Scanner` to read the input from the console, `ArrayList` to store the modulo results, and a stream with `min` to find the smallest element in the list.

To compile and run the code, save it into a file called `Main.java`, compile it with `javac Main.java`, and then run it with `java Main`. Ensure you input the test case like "2020 2040" to the console to check the expected output of `-78`.
