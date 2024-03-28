<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class p02476 {
	public static void main(String []args)
	{
		Scanner in =new Scanner(new BufferedInputStream(System.in));
		while(in.hasNext())
		{
			BigInteger a = in.nextBigInteger(),b = in.nextBigInteger();
			System.out.println(a.remainder(b));
		}
		in.close();
	}
}


```

### 解题思路

```python
import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;

class p02476:
    def main(self, args):
        in =Scanner(new BufferedInputStream(System.in))
        while in.hasNext():
            a = in.nextBigInteger()
            b = in.nextBigInteger()
            print(a.remainder(b))
        in.close()

```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p02475](https://leetcode-cn.com/problems/remainder-of-big-integers/)
</s>
