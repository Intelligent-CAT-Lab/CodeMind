<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ASSA

Expected output:
Yes


```
a,b,c,d = input()
flag = 0
if(a==b and c==d):
    flag = 1
elif(a==c and b==d):
    flag = 1
elif(a==d and b==c):
    flag = 1
else:
    flag = 0
if(a==b and a==c and a==d):
    flag = 0
if(flag==1):
    print("Yes")
else:
    print("No")
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char a = input.charAt(0);
        char b = input.charAt(1);
        char c = input.charAt(2);
        char d = input.charAt(3);
        boolean flag = false;
        if ((a == b && c == d) || (a == c && b == d) || (a == d && b == c)) {
            flag = true;
        }
        if (a == b && a == c && a == d) {
            flag = false;
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code reads a string of 4 characters from the user, then checks if any two characters are the same and if the string contains all the same characters. If either condition is true, it prints "Yes", otherwise it prints "No".
<|EOT|>
