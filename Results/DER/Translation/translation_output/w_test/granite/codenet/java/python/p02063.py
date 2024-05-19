System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 6

Expected output:
8


```
import java.util.Scanner;

public class p02063 {
	static long startTime = System.currentTimeMillis();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long A = sc.nextLong();
		long B = sc.nextLong();
		for (long i = B + 1; ; i++) {
			if ((i & 0xFF) == 0 && System.currentTimeMillis() - startTime > 3500) break;
			long ca = i / A + i % A;
			long remb = i % B;
			long cb = i / B + remb / A + remb % A;
			if (ca < cb) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}

}


```


Answer:
```python
import time

def main():
    A, B = map(int, input().split())
    start_time = time.time()
    for i in range(B + 1, 10**18):
        ca = i // A + i % A
        remb = i % B
        cb = i // B + remb // A + remb % A
        if ca < cb:
            print(i)
            return
    print(-1)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "4 6",
    "1 1",
    "1 100000000000000000",
    "100000000000000000 1",
]

test_outputs = [
    "8",
    "2",
    "100000000000000001",
    "100000000000000000",
]

for test_input, expected_output in zip(test_inputs, test_outputs):
    with open('input.txt', 'w') as f:
        f.write(test_input)
    main()
    with open('output.txt', 'r') as f:
        actual_output = f.read().strip()
    assert actual_output == expected_output, f"Expected output: {expected_output}, Actual output: {actual_output}"
```<|endoftext|>
