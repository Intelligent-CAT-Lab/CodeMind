Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Seishin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int K = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        if (K % 2 == 0) {
            System.out.println(Arrays.toString(new int[]{K / 2}).toString().replace("[", "").replace("]", "").replace(" ", "") + " " + String.join(" ", new String[N - 1]));
        } else {
            List<Integer> X = new ArrayList<>();
            X.add((K + 1) / 2);
            for (int i = 0; i < N / 2; i++) {
                if (X.get(X.size() - 1) == 1) {
                    X.remove(X.size() - 1);
                } else {
                    X.set(X.size() - 1, X.get(X.size() - 1) - 1);
                    for (int j = 0; j < N - X.size(); j++) {
                        X.add(K);
                    }
                }
            }
            System.out.println(String.join(" ", X.stream().map(String::valueOf).toArray(String[]::new)));
        }
    }
}
```

Please note that in Java, we use `System.out.println` to print the output. Also, we use `Scanner` to read the input from the user. The `Arrays.toString` method is used to convert an array to a string. The `replace` method is used to remove the unwanted characters from the string. The `String.join` method is used to join the elements of a list into a string. The `stream` method is used to convert the list
