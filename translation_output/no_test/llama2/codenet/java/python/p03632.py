<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.*;
import java.util.*;
 
public class p03632 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.lines()
                .map(line -> Arrays.stream(line.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray())
                .forEach(in -> {
                    int a = in[0];
                    int b = in[1];
                    int c = in[2];
                    int d = in[3];
                    
                    int start = Math.max(a,c);
                    int end = Math.min(b,d);
                    System.out.println( (end-start)>0 ? end-start : 0 );
                });
        }
    }
}
```

### 解题思路

```python
import sys

def main():
    a, b, c, d = map(int, sys.stdin.readline().split())
    start = max(a, c)
    end = min(b, d)
    print(end - start)

if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：O(N)。
- 空间复杂度：O(1)。

### 相关题目

- [p03631](https://leetcode-cn.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/)
</s>
