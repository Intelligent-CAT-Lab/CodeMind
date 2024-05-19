System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC142_A {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();
        double sum = 0;
        
        for (int i = 1; i <= N; i++) {
            if (i % 2!= 0) {
                sum += 1;
            }
        }
        
        System.out.println(sum / N);
    }
}
```


Answer:
```python
import sys

N = int(input())
sum = 0

for i in range(1, N + 1):
    if i % 2!= 0:
        sum += 1

print(sum / N)
```<|endoftext|>
