<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20

Expected output:
0
0
0
0
0
1
0
0
0
0
3
0
0
0
0
0
3
3
0
0
-16

```
import java.util.Scanner;

public class p02608 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] eratosu = new int[100000];
		for(int i = 1 ; i <= 100 ; i++) {
			for(int j = 1 ; j <= 100 ; j++) {
				for(int k = 1 ; k <= 100 ; k++) {
                  if(i * i + j * j + k * k >= 100000)
                    continue;
					int result = i * i + j * j + k * k + i * j + j * k + k * i;
					eratosu[result]++;
				}
			}

		}
		String s = eratosu[1] + "";
		StringBuilder sb = new StringBuilder(s);

		for(int i = 2 ; i <= n ; i++) {
			sb.append("\n" + eratosu[i]);
		}

		sc.close();
		System.out.println(sb.toString());

	}
}


```

@@ Response
Here is the equivalent Python code:

```python
n = int(input())
eratosu = [0] * 100000

for i in range(1, 101):
    for j in range(1, 101):
        for k in range(1, 101):
            if i * i + j * j + k * k >= 100000:
                continue
            result = i * i + j * j + k * k + i * j + j * k + k * i
            eratosu[result] += 1

print("\n".join(map(str, eratosu[:n+1])))
```

This Python code does the same thing as the Java code. It initializes an array `eratosu` with 100000 zeros. Then it iterates over all possible combinations of `i`, `j`, and `k`, and for each combination, it calculates the result and increments the corresponding element in `eratosu`. Finally, it prints the first `n+1` elements of `eratosu`, separated by newlines.<｜end▁of▁sentence｜>
