<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    length = len(s)

    count = 0
    for i in range(length // 2):
        a = s[i]
        b = s[length - 1 - i]
        if a != b:
            count += 1

    print(count)

if __name__ == "__main__":
    main()
```
This is the Python code that translates the given Java code. The `sys` module is used to read input from the standard input stream, and the `strip()` method is used to remove any trailing newline characters from the input string. The `len()` function is used to get the length of the input string, and the `range()` function is used to iterate over the half of the length of the string. The `a` and `b` variables are assigned the corresponding characters from the input string, and the `if` statement checks if they are not equal. If they are not equal, the `count` variable is incremented. Finally, the `print()` function is used to print the value of the `count` variable.</s>
