System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
432

Expected output:
400


```
import java.util.Scanner;

public class p02842 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i=0;i<=N;i++) {
			if ((int)(i*1.08)==N) {
				System.out.println(i);
				return ;
			}
		}
		System.out.println(":(");
	}
}

```


Answer:
```python
import math

def main():
    N = int(input())
    for i in range(0, N+1):
        if math.floor(i * 1.08) == N:
            print(i)
            return
    print(":(")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    432,
]

test_outputs = [
    400,
]

for test_input, expected_output in zip(test_inputs, test_outputs):
    with patch('builtins.input', return_value=test_input):
        main()
        captured = capsys.readouterr()
        assert captured.out == str(expected_output) + '\n'
```<|endoftext|>
