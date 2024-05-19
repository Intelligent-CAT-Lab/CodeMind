System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 2 3 4 5

Expected output:
1


```
x_list = list(map(int, input().split()))
for i in range(5):
    if x_list[i] == 0:
        print(i+1)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] xList = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            xList[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < xList.length; i++) {
            if (xList[i] == 0) {
                System.out.println(i + 1);
            }
        }
    }
}
```

Test input:
```
0 2 3 4 5
```

Expected output:
```
1
```<|endoftext|>
