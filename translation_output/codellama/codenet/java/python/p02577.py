<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long c=0;
        for(int i=0;i<s.length();i++){
            c+=(s.charAt(i)-'0');
        }
        if(c%9 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

s = sys.stdin.readline().strip()
c = 0
for i in range(len(s)):
    c += int(s[i])
if c % 9 == 0:
    print("Yes")
else:
    print("No")
```
Note: The `sys.stdin.readline()` method is used to read a line of input from the standard input stream. The `strip()` method is used to remove any trailing newline characters from the input string. The `range(len(s))` is used to iterate over the characters in the input string. The `int(s[i])` is used to convert each character to an integer. The `c % 9 == 0` is used to check if the sum of the digits is divisible by 9.</s>
