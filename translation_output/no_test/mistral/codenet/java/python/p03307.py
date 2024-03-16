<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def problem102a(n):
    return (n % 2 == 0) ? n : (n * 2)

n = int(input())
print(problem102a(n))
```</s>
