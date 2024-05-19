System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
78

```


import java.util.Scanner;

public class p03779{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int ans = 0;

		for (int i = 0; i < 100000; i++) {
			if (x <= i * (i + 1) / 2) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}

```


Answer:
```python
def main():
    x = int(input())
    ans = 0
    i = 0
    while ans < x:
        i += 1
        ans = i * (i + 1) // 2
    print(ans)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "6",
]

test_outputs = [
    "78",
]

def test_p03779():
    for test_input, expected_output in zip(test_inputs, test_outputs):
        input_value = test_input
        expected_value = expected_output
        try:
            output = main(input_value)
        except:
            output = None
        assert str(output) == expected_value, f"Input: {input_value}. Expected output: {expected_value}. Actual output: {output}"

test_p03779()
```<|endoftext|>
