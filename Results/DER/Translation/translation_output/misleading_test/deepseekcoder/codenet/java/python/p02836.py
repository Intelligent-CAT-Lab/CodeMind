<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
redcoder

Expected output:
44

```
import java.util.Scanner;

public class p02836 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int length = s.length();

        int count =0;
        for(int i=0;i<length/2;i++){
            char a = s.charAt(i);
            char b = s.charAt(length - 1 -i );
            if(a != b){
                count++;
            }

//            System.out.println(String.valueOf(a) + String.valueOf(b));

        }
        System.out.println(count);






    }
}
```

### Response:
```python
def count_diff(s):
    length = len(s)
    count = 0
    for i in range(length//2):
        if s[i] != s[length - 1 -i ]:
            count += 1
    return count

s = input()
print(count_diff(s))
```

This Python code does the same thing as the Java code. It reads a string from the input, counts the number of characters that are different from the corresponding characters from the end of the string, and prints this count.
<|EOT|>
