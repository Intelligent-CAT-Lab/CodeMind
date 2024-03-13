<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char a = input.charAt(0);
        char b = input.charAt(1);
        char c = input.charAt(2);
        char d = input.charAt(3);
        int flag = 0;
        if (a == b && c == d) {
            flag = 1;
        } else if (a == c && b == d) {
            flag = 1;
        } else if (a == d && b == c) {
            flag = 1;
        } else {
            flag = 0;
        }
        if (a == b && a == c && a == d) {
            flag = 0;
        }
        if (flag == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, then checks if the characters at the first, second, third, and fourth positions are the same. If they are, it sets the flag to 1. If the characters are not the same, it sets the flag to 0. If all characters are the same, it sets the flag to 0. Finally, it prints "Yes" if the flag is 1, and "No" if the flag is 0.<｜end▁of▁sentence｜>
