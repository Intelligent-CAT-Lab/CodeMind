<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ATCODER

Expected output:
-84

```
import java.util.*;

public class p03086 {

    private static void nCombination3(int c) {
        int count = c;
        int num = 0;
        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    num++;
                }
            }
        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        char[] S=sc.next().toCharArray();
        int currentlength = 0;
        int length = 0;
        for(int i=0;i<S.length;i++){
            if(S[i]=='A'||S[i]=='C'||S[i]=='G'||S[i]=='T'){
               currentlength++;

            }else{
                if(currentlength>length){
                    length = currentlength;
                }
                currentlength = 0;
            }
        }
        System.out.println(Math.max(length,currentlength));

    }
}

```

@@ Response
```python
def max_length(s):
    current_length = 0
    length = 0
    for i in s:
        if i in ['A', 'C', 'G', 'T']:
            current_length += 1
        else:
            if current_length > length:
                length = current_length
            current_length = 0
    return max(length, current_length)

def n_combination_3(c):
    count = c
    num = 0
    for i in range(count - 2):
        for j in range(i + 1, count - 1):
            for k in range(j + 1, count):
                num += 1
    return num

s = input()
print(max_length(s))
```

This Python code does the same thing as the Java code. It reads a string from the user, calculates the maximum length of a substring containing only 'A', 'C', 'G', 'T', and 'n_combination_3' function is not needed in this case.<｜end▁of▁sentence｜>
