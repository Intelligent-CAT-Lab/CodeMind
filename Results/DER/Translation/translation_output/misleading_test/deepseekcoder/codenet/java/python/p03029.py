<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3

Expected output:
71

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

def main():
    try:
        A, P = map(int, sys.stdin.readline().split())
        print((P+3*A)//2)
    except Exception as e:
        print("Exception :" + str(e))

if __name__ == "__main__":
    main()
```

In Python, we don't need to import `BufferedReader`, `InputStreamReader`, or `IOException` as they are not needed in Python. We use `sys.stdin.readline()` to read input from the console. The `map()` function is used to convert the input strings to integers. The `//` operator is used for integer division in Python.
<|EOT|>
