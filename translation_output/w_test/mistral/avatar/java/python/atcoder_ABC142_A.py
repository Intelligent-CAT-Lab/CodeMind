<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
64

Expected output:
0.5


```
import java.util.Scanner;

public class atcoder_ABC142_A {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();
        double sum = 0;
        
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                sum += 1;
            }
        }
        
        System.out.println(sum / N);
    }
}
```
[/INST]
```python
N = int(input())
sum = 0

for i in range(1, N+1):
    if i % 2 != 0:
        sum += 1

print(sum / N)
```</s>
