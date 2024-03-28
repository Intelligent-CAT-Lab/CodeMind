<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0011

Expected output:
-47

```
import java.util.*;

public class p03107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        char S0 = '0';
        int S0mas = 0;
        for(char str : S.toCharArray()){
            if(str == S0){
                ++S0mas;
            }
        }
        int S1mas = S.length() - S0mas;
        if(S0mas < S1mas){
            System.out.println(S0mas * 2);
        }else{
            System.out.println(S1mas * 2);
        }
    }
}
```

### Response:
```python
def p03107(S):
    S0mas = S.count('0')
    S1mas = len(S) - S0mas
    if S0mas < S1mas:
        return S0mas * 2
    else:
        return S1mas * 2

print(p03107(input()))
```

This Python code does the same thing as the Java code. It counts the number of '0's and '1's in the input string, then returns the smaller count multiplied by 2.
<|EOT|>
