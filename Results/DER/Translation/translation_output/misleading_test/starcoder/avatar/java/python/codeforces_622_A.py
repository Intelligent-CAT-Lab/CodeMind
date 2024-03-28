<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
99992

Expected output:
344

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeforces_622_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n1 = Long.parseLong(br.readLine());
        long n = (long) ((Math.sqrt(1 + (8 * n1)) - 1) / 2);
        long ans = n1 - (((n + 1) * n) / 2);
        System.out.print((ans!= 0)? ans : n);
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import math

n = int(input())
print(int((math.sqrt(1 + (8 * n)) - 1) / 2))
```

"""
<|endoftext|>
