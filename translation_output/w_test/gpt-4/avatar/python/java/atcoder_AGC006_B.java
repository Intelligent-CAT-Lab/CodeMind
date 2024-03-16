```java
import java.util.Scanner;
import java.util.ArrayList;

public class SampleTestCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = scanner.nextInt();

        if (x == 1 || x == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            ArrayList<Integer> l = new ArrayList<>();
            for (int i = 1; i < 2 * N; i++) {
                l.add(i);
            }
            l.remove(Integer.valueOf(x - 1));
            l.remove(Integer.valueOf(x));
            l.remove(Integer.valueOf(x + 1));

            for (int i = 0; i < N - 2; i++) {
                System.out.println(l.get(i));
            }

            System.out.println(x - 1);
            System.out.println(x);
            System.out.println(x + 1);

            for (int i = 0; i < N - 2; i++) {
                System.out.println(l.get(N - 2 + i));
            }
        }
        scanner.close();
    }
}
```

Remember to use the import statement for Scanner and ArrayList, as these are not in the default package. Also, notice the use of `Integer.valueOf()` for removing elements from the `ArrayList` since we want to remove the object representing the value, not the element at the index.
