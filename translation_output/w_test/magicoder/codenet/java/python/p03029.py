<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
try:
    A, P = map(int, input().split())
    print((P + 3 * A) // 2)
except Exception as e:
    print("Exception :", e)
```

This Python code does the same thing as the Java code. It reads two integers from the input, calculates the result as per the formula (P + 3 * A) / 2, and prints the result. If any exception occurs during the execution, it prints the exception message.<｜end▁of▁sentence｜>
