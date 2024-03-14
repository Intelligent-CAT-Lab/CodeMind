Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s=input()
i=c=p=0;b=''
while i<len(s):
    if s[i]==b:
        if c > p:r=b;p=c
        c=0
    b=s[i]
    i+=[3,7][s[i]=='c']
    c+=1
if c>p:r=b
print(['chicken','egg'][r=='e'])
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0, c = 0, p = 0;
        char b ='';
        while (i < s.length()) {
            if (s.charAt(i) == b) {
                if (c > p) {
                    char r = b;
                    p = c;
                }
                c = 0;
            }
            b = s.charAt(i);
            i += (s.charAt(i) == 'c')? 3 : 7;
            c++;
        }
        if (c > p) {
            char r = b;
        }
        System.out.println((r == 'e')? "egg" : "chicken");
    }
}
```<|endoftext|>
