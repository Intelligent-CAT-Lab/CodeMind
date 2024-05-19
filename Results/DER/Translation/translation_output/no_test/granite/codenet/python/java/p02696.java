System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
from math import floor
A, B, N = map(int, input().split())
print(floor(A*min(B-1, N)/B))
```


Answer:
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int N = Integer.parseInt(input[2]);
        int result = (int) Math.floor(A * Math.min(B - 1, N) / (double) B);
        System.out.println(result);
    }
}
```<|endoftext|>
