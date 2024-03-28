<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
def p03107():
    S = input()
    S0mas = S.count('0')
    S1mas = len(S) - S0mas
    if S0mas < S1mas:
        print(S0mas * 2)
    else:
        print(S1mas * 2)

p03107()
```

This Python code does the same thing as the Java code. It reads a string from the user, counts the number of '0's and '1's, and then prints the product of the count of '0's and '1's.<｜end▁of▁sentence｜>
