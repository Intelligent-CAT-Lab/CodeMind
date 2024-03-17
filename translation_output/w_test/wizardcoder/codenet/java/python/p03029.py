Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3

Expected output:
3


```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class p03029 {
    public static void main(String[] args){
        try {

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String str[] = (br.readLine()).split("\\s+");
        int A = Integer.parseInt(str[0]);
        int P = Integer.parseInt(str[1]);
        System.out.println((P+3*A)/2);

        } catch(IOException e) {
            System.out.println("Exception :" + e);
        }

    }
}
```

### Response:
```python
import sys

try:
    input_str = sys.stdin.readline().strip()
    A, P = map(int, input_str.split())
    result = (P + 3*A) // 2
    print(result)
except Exception as e:
    print("Error:", e)
```

Explanation:

- We first import the `sys` module to read input from the command line.
- We then use a `try-except` block to handle any exceptions that may occur while reading input.
- We read the input string using `sys.stdin.readline().strip()` and split it into two integers using `map(int, input_str.split())`.
- We calculate the result using `(P + 3*A) // 2` and print it using `print(result)`.
- If an exception occurs, we print an error message using `print("Error:", e)`.<|endoftext|>
