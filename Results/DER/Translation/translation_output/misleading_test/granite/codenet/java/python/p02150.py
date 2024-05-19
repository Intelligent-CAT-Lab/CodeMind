System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 1 5

Expected output:
5

```
import java.util.*;

public class p02150 {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		long s = a - b;
		long count = Math.max(x - a, 0) / s;
		long total = (count % MOD) * (a % MOD) % MOD;
		x -= count * s;
		while (x >= a) {
		    total += a;
		    x += - a + b;
		}
		total += x;
		total %= MOD;
		System.out.println(total);
	}
}


```


Answer:
```python
MOD = 1000000007

def main():
    a, b, x = map(int, input().split())
    s = a - b
    count = (x - a) // s
    total = (count % MOD) * (a % MOD) % MOD
    x -= count * s
    while x >= a:
        total += a
        x += - a + b
    total += x
    total %= MOD
    print(total)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "3 1 5",
    "1 1 1",
    "100000000 1 100000000",
]

expected_outputs = [
    "5",
    "1",
    "100000000",
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    with open('input.txt', 'w') as f:
        f.write(test_input)
    main()
    with open('output.txt', 'r') as f:
        actual_output = f.read().strip()
    assert actual_output == expected_output, f"Expected output: {expected_output}, Actual output: {actual_output}"
```<|endoftext|>
