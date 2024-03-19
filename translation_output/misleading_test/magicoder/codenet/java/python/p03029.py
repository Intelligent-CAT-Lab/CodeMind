<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
try:
    A, P = map(int, input().split())
    print((P + 3 * A) // 2)
except Exception as e:
    print("Exception :", e)
```

In this Python code, we use the `input()` function to read the input from the user. The `split()` function is used to split the input into two parts based on the space. The `map()` function is used to convert these two parts into integers. The `//` operator is used for integer division in Python. If any exception occurs during the execution of the code, it is caught and printed.<｜end▁of▁sentence｜>
