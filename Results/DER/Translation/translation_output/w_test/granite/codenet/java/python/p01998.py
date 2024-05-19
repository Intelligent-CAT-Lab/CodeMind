System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
2


```
import java.util.*;

public class p01998 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] arr = new boolean[n + 3];
		arr[0] = true;
		arr[1] = true;
		int count = 0;
		for (int i = 2; i < arr.length; i++) {
		    if (!arr[i]) {
		        for (int j = 2; j * i < arr.length; j++) {
		            arr[i * j]  = true;
		        }
		        if (!arr[i] &&!arr[i - 2]) {
		            count++;
		        }
		    }
		}
		System.out.println(count * 2);
	}
}


```


Answer:
```python
def main():
    n = int(input())
    arr = [False] * (n + 3)
    arr[0] = True
    arr[1] = True
    count = 0
    for i in range(2, len(arr)):
        if not arr[i]:
            for j in range(2, (len(arr) - 1) // i + 1):
                arr[i * j] = True
            if not arr[i] and not arr[i - 2]:
                count += 1
    print(count * 2)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
import io
import sys
from contextlib import redirect_stdout

def test_p01998():
    test_inputs = [
        "3",
    ]
    test_outputs = [
        "2",
    ]
    for test_input, test_output in zip(test_inputs, test_outputs):
        sys.stdin = io.StringIO(test_input)
        with redirect_stdout(io.StringIO()) as stdout:
            main()
            assert stdout.getvalue() == test_output + "\n"

test_p01998()
```<|endoftext|>
