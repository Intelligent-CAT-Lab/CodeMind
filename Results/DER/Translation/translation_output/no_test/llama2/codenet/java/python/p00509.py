<s> Translate the following java code to python and enclose your solution inside ```python```:
```

import java.io.IOException;
import java.util.Scanner;

public class p00509 {

	public static void main(String[] args) throws IOException {

		new p00509().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int c = scanner.nextInt();
		int[] num = new int[n];
		if (c < 0) {
			if (n == 1)
				System.out.println(11);
			else {
				for (int i = 0; i < n * 2; i++)
					System.out.print(9);
				System.out.println();
			}
		} else {
			int a = 1;
			for (int i = 0; i < n; i++)
				a *= 10;
			int b = a / 10;
			a--;
			for (int i = a; i >= b; i--) {
				if (check(i, c))
					return;

			}
		}
	}

	private boolean check(int i, int c) {
		StringBuilder builder = new StringBuilder(String.valueOf(i));
		StringBuilder builder2 = new StringBuilder(String.valueOf(i)).reverse();
		builder.append(c).append(builder2);
		if (prime(Integer.valueOf(builder.toString()))) {
			System.out.println(builder);
			return true;
		} else
			return false;

	}

	private boolean prime(int b) {
		for (int i = 2; i * i <= b; i++)
			if (b % i == 0)
				return false;
		return true;
	}
}
```

### 解析

```python
import java.io.IOException;
import java.util.Scanner;

class p00509:

    def run(self):
        scanner = Scanner(System.in)
        n = scanner.nextInt()
        c = scanner.nextInt()
        num = [0] * n
        if c < 0:
            if n == 1:
                print(11)
            else:
                for i in range(n * 2):
                    print(9)
                print()
        else:
            a = 1
            for i in range(n):
                a *= 10
            b = a // 10
            a -= 1
            for i in range(a, b, -1):
                if check(i, c):
                    return

    def check(self, i, c):
        builder = StringBuilder(str(i))
        builder2 = StringBuilder(str(i)).reverse()
        builder.append(c).append(builder2)
        if prime(int(builder.toString())):
            print(builder)
            return True
        else:
            return False

    def prime(self, b):
        for i in range(2, int(b ** 0.5) + 1):
            if b % i == 0:
                return False
        return True
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [p00508](./p00508.md)
</s>
