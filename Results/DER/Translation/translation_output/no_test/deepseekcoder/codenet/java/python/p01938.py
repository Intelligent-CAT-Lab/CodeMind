<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
    char_list = list(input_string)
    a = 'A'
    sum = 0
    for i in range(len(char_list)):
        if ord(char_list[i]) <= ord(a):
            sum += 1
        a = char_list[i]
    return sum

if __name__ == "__main__":
    input_string = sys.stdin.readline().strip()
    print(count_chars(input_string))
```

This Python code does the same thing as the Java code. It reads a line of input from the standard input, converts it to a list of characters, and then iterates over the list, counting the number of characters that are less than or equal to 'A'. The result is then printed to the standard output.
<|EOT|>
