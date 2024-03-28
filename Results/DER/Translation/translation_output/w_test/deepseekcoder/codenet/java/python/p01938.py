<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
AIZU

Expected output:
2


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

### Response:
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

input_string = sys.stdin.readline().strip()
print(count_chars(input_string))
```

In this Python code, we define a function `count_chars` that takes a string as input and returns the count of characters that are less than or equal to the previous character in the string. The function uses a for loop to iterate over each character in the string, and an if statement to check if the ASCII value of the current character is less than or equal to the ASCII value of the previous character. If it is, the count is incremented. The function returns the total count.

The input string is read from standard input using `sys.stdin.readline().strip()`, and the result of `count_chars` is printed to standard output.
<|EOT|>
