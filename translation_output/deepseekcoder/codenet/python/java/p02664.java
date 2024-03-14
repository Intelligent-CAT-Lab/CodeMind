<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        char[] aArray = a.toCharArray();

        for (int i = 0; i < aArray.length; i++) {
            if (aArray[i] == '?') {
                aArray[i] = 'D';
            }
        }

        String b = new String(aArray);
        System.out.println(b);
    }
}
```
<|EOT|>
