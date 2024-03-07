<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

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
This is the equivalent Python code for the given Java code. The `sys` module is used to read input from the standard input stream, and the `strip()` method is used to remove any trailing whitespace from the input string. The `len()` function is used to get the length of the input string, and the `range()` function is used to iterate over the indices of the string. The `//` operator is used to perform integer division and get the length of the string in half. The `[]` notation is used to access the characters of the string at the given indices. The `print()` function is used to output the final count.</s>
