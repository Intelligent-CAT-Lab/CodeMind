<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p02392 {

	public static void main(String[] args) throws Exception {
		String inStr;
		inStr = inp();
		String[] in;
		in = inStr.split(" ");

		int a = Integer.valueOf(in[0]);
		int b = Integer.valueOf(in[1]);
		int c = Integer.valueOf(in[2]);

		if (a < b && b < c)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	private static String inp() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

}
```

### 解题思路

```python
import java.io.BufferedReader;
import java.io.InputStreamReader;

class p02392:
    def main(self, args):
        inStr = input()
        in = inStr.split(" ")
        a = int(in[0])
        b = int(in[1])
        c = int(in[2])
        if a < b and b < c:
            print("Yes")
        else:
            print("No")

if __name__ == "__main__":
    p02392().main(sys.argv)
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p02391](./p02391.md)
</s>
