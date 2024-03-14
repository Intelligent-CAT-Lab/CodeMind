<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p03268 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		long num[] = new long[k];

		for (int i = 1; i <= n; i++) {
			num[i % k]++;
		}

		long res = 0;
		for (int a = 0; a < k; ++a) {
			int b = (k - a) % k;
			int c = (k - a) % k;
			if ((b + c) % k != 0)
				continue;
			res += num[a] * num[b] * num[c];
		}

		System.out.println(res);
	}
}

```

### Response:
```python
import sys

def main():
    line = sys.stdin.readline().split()
    n = int(line[0])
    k = int(line[1])

    num = [0]*k

    for i in range(1, n+1):
        num[i % k] += 1

    res = 0
    for a in range(k):
        b = (k - a) % k
        c = (k - a) % k
        if ((b + c) % k != 0):
            continue
        res += num[a] * num[b] * num[c]

    print(res)

if __name__ == "__main__":
    main()
```
<|EOT|>
