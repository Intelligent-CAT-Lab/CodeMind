Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N % 2 == 0) {
            int[][] edge = new int[N * (N - 1) / 2][2];
            int index = 0;
            for (int s = 1; s <= N; s++) {
                int ng = N - s + 1;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    edge[index][0] = s;
                    edge[index][1] = t;
                    index++;
                }
            }
            System.out.println(edge.length);
            for (int[] e : edge) {
                System.out.println(e[0] + " " + e[1]);
            }
        } else {
            int[][] edge = new int[N * (N - 1) / 2][2];
            int index = 0;
            for (int s = 1; s <= N; s++) {
                int ng = N - s;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    edge[index][0] = s;
                    edge[index][1] = t;
                    index++;
                }
            }
            System.out.println(edge.length);
            for (int[] e : edge) {
                System.out.println(e[0] + " " + e[1]);
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer N from the standard input, creates an array of integer arrays to store the edges, and then fills the array with the edges. It then prints
