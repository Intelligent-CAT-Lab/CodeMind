<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '?') {
                a = a.substring(0, i) + "D" + a.substring(i + 1);
            }
            b += a.charAt(i);
        }
        System.out.println(b);
    }
}
```</s>
