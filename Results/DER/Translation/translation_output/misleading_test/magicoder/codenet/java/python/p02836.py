<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the equivalent Python code:

```python
s = input()
length = len(s)

count = 0
for i in range(length // 2):
    a = s[i]
    b = s[length - 1 - i]
    if a != b:
        count += 1

print(count)
```

This Python code does the same thing as the Java code. It reads a string from the user, calculates the length of the string, and then compares the characters at the beginning and end of the string, moving inwards from both ends. If the characters are not equal, it increments a counter. Finally, it prints the counter.<｜end▁of▁sentence｜>
