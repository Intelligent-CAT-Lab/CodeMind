System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9

Expected output:
2


```
import java.util.*;
import java.util.ArrayList;

public class codeforces_579_A {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int n = str.nextInt();
        String s = " ";
        
        while (n > 0) {
            int x = n % 2;
            n /= 2;
            s += x + " ";
        }
        
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}
```


Answer:
```python
def count_set_bits(n):
    count = 0
    while n:
        count += n & 1
        n >>= 1
    return count

n = int(input())
print(count_set_bits(n))
```

You can write the following test cases to ensure it works correctly:

```python
test_cases = [
    (9, 2),
    (10, 2),
    (15, 4),
    (32, 5),
    (63, 5),
    (64, 1),
    (128, 7),
    (256, 8),
    (512, 9),
    (1024, 10),
]
for n, expected_output in test_cases:
    assert count_set_bits(n) == expected_output
```<|endoftext|>
