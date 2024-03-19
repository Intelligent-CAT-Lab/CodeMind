<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
AIZU

Expected output:
80

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class p01938 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] list=br.readLine().toCharArray();
        char a='A';
        int sum=0;
        for(int i=0;i<list.length;i++){
            if(list[i]<=a){
                sum++;
            }
            a=list[i];
        }
        System.out.println(sum);
    }
}
```

@@ Response
```python
import sys

def count_chars(input_string):
    a = 'A'
    sum = 0
    for char in input_string:
        if ord(char) <= ord(a):
            sum += 1
        a = char
    return sum

if __name__ == "__main__":
    input_string = sys.stdin.readline().strip()
    print(count_chars(input_string))
```

In this Python code, we define a function `count_chars` that takes a string as input and returns the count of characters that are less than or equal to the previous character. The `ord` function is used to get the ASCII value of a character. The `sys.stdin.readline().strip()` is used to read the input from the standard input.<｜end▁of▁sentence｜>
