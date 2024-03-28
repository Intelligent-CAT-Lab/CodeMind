<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ATCODER

Expected output:
3


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

### Response:
```python
def nCombination3(c):
    count = c
    num = 0
    for i in range(count - 2):
        for j in range(i + 1, count - 1):
            for k in range(j + 1, count):
                num += 1
    return num

def main():
    S = input()
    currentlength = 0
    length = 0
    for i in range(len(S)):
        if S[i] in ['A', 'C', 'G', 'T']:
            currentlength += 1
        else:
            if currentlength > length:
                length = currentlength
            currentlength = 0
    print(max(length, currentlength))

main()
```
<|EOT|>
