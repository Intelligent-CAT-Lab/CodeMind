<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
w=input()
list=[]
for i in range(len(w)):
    if w[i]=='C':
        list.append('Z')
        
    elif w[i]=='B':
        list.append('Y')
        
    elif w[i]=='A':
        list.append('X')
    else:
        c=ord(w[i])-3
        list.append(chr(c))
l=''.join(list)
print(l)
    

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            if (c == 'C') {
                list.append('Z');
            } else if (c == 'B') {
                list.append('Y');
            } else if (c == 'A') {
                list.append('X');
            } else {
                list.append((char)(c - 3));
            }
        }
        String l = list.toString();
        System.out.println(l);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, then iterates over each character in the string. If the character is 'C', it appends 'Z' to the list. If the character is 'B', it appends 'Y'. If the character is 'A', it appends 'X'. Otherwise, it subtracts 3 from the ASCII value of the character and appends the resulting character to the list. Finally, it joins all the characters in the list into a string and prints it.<｜end▁of▁sentence｜>
