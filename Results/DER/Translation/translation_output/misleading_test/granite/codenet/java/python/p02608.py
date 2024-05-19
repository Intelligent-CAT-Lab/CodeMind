System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
import sys

def main():
    n = int(sys.stdin.readline())
    eratosu = [0] * 100000
    for i in range(1, 101):
        for j in range(1, 101):
            for k in range(1, 101):
                result = i * i + j * j + k * k + i * j + j * k + k * i
                if result < 100000:
                    eratosu[result] += 1

    print(eratosu[1])
    for i in range(2, n + 1):
        print(eratosu[i])

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "20\n"
expected_output = "0\n0\n0\n0\n0\n0\n1\n0\n0\n0\n0\n3\n0\n0\n0\n0\n0\n3\n3\n0\n0\n-16\n"

output = io.StringIO()
with redirect_stdout(output):
    main()

assert output.getvalue() == expected_output
```<|endoftext|>
