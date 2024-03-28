```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();

        if (R - L > 2019) {
            System.out.println(0);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = L; i <= R; i++) {
                for (int j = i + 1; j <= R; j++) {
                    list.add((i * j) % 2019);
                }
            }
            System.out.println(list.stream().min(Integer::compare).get());
        }
    }
}
```
