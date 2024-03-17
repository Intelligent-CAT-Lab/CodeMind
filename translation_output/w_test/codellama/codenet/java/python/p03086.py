<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]

Here is the Python code that translates the Java code:
```python
import math

def n_combination_3(c):
    count = c
    num = 0
    for i in range(count - 2):
        for j in range(i + 1, count - 1):
            for k in range(j + 1, count):
                num += 1
    return num

def main():
    sc = input("Enter a string: ")
    S = sc.split()
    current_length = 0
    length = 0
    for i in range(len(S)):
        if S[i] in ["A", "C", "G", "T"]:
            current_length += 1
        else:
            if current_length > length:
                length = current_length
            current_length = 0
    print(max(length, current_length))

if __name__ == "__main__":
    main()
```
Note that the Python code uses the `input()` function to get the input from the user, and the `split()` method to split the input string into a list of characters. The `math.max()` function is used to find the maximum of two numbers.</s>
