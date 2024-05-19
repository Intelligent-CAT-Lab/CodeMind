System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
x_list = list(map(int, input().split()))
for i in range(5):
    if x_list[i] == 0:
        print(i+1)
```


Answer:
```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] input = args[0].split(" ");
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
```<|endoftext|>
