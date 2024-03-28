<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
mmemewwemeww

Expected output:
EmL

```
import java.util.*;
import java.lang.*;

class p01486 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                String S = sc.next();
                if (saiki(S)) {
                        System.out.println("Cat");
                } else {
                        System.out.println("Rabbit");
                }
        }

        public static boolean saiki(String S){
                if (S.equals("")) {
                        return true;
                }
                if (S.charAt(0) != 'm') {
                        return false;
                }
                int en = 1;
                int i;
                for (i = 1; i < S.length() && en != 0; i++) {
                        if (S.charAt(i) == 'm') {
                                en++;
                        } else if(S.charAt(i) == 'e'){
                                en--;
                        }
                }
                if (i == S.length()) {
                        return false;
                }
                int eindex = i;
                int mn = 1;
                i++;
                for (; i < S.length() && mn != 0; i++) {
                        if (S.charAt(i) == 'e') {
                                mn++;
                        } else if(S.charAt(i) == 'w'){
                                mn--;
                        }
                }
                if (i != S.length()) {
                        return false;
                }
                return saiki(S.substring(1, eindex - 1)) && saiki(S.substring(eindex, S.length() - 1));
        }
}
```

### Response:
```python
def saiki(S):
    if S == "":
        return True
    if S[0] != 'm':
        return False
    en = 1
    i = 1
    while i < len(S) and en != 0:
        if S[i] == 'm':
            en += 1
        elif S[i] == 'e':
            en -= 1
        i += 1
    if i == len(S):
        return False
    eindex = i
    mn = 1
    i += 1
    while i < len(S) and mn != 0:
        if S[i] == 'e':
            mn += 1
        elif S[i] == 'w':
            mn -= 1
        i += 1
    if i != len(S):
        return False
    return saiki(S[1:eindex - 1]) and saiki(S[eindex: len(S) - 1])

S = input()
if saiki(S):
    print("Cat")
else:
    print("Rabbit")
```

This Python code does the same thing as the Java code. It reads a string from the input, checks if it matches the pattern described in the `saiki` function, and then prints "Cat" if it does, "Rabbit" if it doesn't.
<|EOT|>
