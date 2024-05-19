System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
2 3 4 5 6 7
5 3 1 6 4 7
2 7 4 1 5 6
2 1 7 5 3 6
1 4 3 7 6 2
2 5 7 3 4 1
2 6 1 4 5 3


```
n=input()
for i in range(n-2/n):print-(n<3)or" ".join(`(i-~(j^(n%2<(j+2<n>i*2))))%n+1`for j in range(n-1))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n - 2 / n; i++) {
            System.out.println(generateLine(n, i));
        }
    }

    private static String generateLine(int n, int i) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n - 1; j++) {
            int value = (i - ~ (j ^ (n % 2 < (j + 2 < n? 1 : 0)))) % n + 1;
            sb.append(value).append(" ");
        }
        return sb.toString().trim();
    }
}
```

Test input:
```
7
```

Expected output:
```
2 3 4 5 6 7
5 3 1 6 4 7
2 7 4 1 5 6
2 1 7 5 3 6
1 4 3 7 6 2
2 5 7 3 4 1
2 6 1 4 5 3
```<|endoftext|>
