<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a=input()

a=list(a)

for i in range(len(a)):
	if a[i]=="?":
		a[i]="D"

b=""
for i in range(len(a)):
	b+=a[i]

print(b)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        char[] charArray = a.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '?') {
                charArray[i] = 'D';
            }
        }

        String b = new String(charArray);

        System.out.println(b);
    }
}
```<｜end▁of▁sentence｜>
