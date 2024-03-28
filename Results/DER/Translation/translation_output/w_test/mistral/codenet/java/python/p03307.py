<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
6


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p03307 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(problem102a(n));
    }

    private static int problem102a(int n) {
        return (n % 2 == 0) ? n : (n * 2);
    }
}
```
[/INST]
```python
n = int(input())
print(problem102a(n))

def problem102a(n):
    if n % 2 == 0:
        return n
    else:
        return n * 2
```</s>
