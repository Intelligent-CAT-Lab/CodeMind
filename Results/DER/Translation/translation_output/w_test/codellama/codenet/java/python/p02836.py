<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
redcoder

Expected output:
1


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

s = sys.stdin.readline().strip()
length = len(s)

count = 0
for i in range(length // 2):
    a = s[i]
    b = s[length - 1 - i]
    if a != b:
        count += 1

print(count)
```
This code reads a string from standard input using `sys.stdin.readline()`, strips the newline character at the end of the string using `strip()`, and then calculates the number of characters that are different between the first and last halves of the string. The number of characters that are different is printed to standard output using `print()`.

Note that the code uses the `//` operator to perform integer division, which returns the integer part of the result. This is necessary because the length of the string is an integer, and we want to divide it by 2 to get the number of characters in the first half of the string.</s>
