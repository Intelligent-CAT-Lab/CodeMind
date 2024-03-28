Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a = a.replaceAll("\\?", "D");
        System.out.println(a);
    }
}
```

Explanation:

In Java, we can use the `Scanner` class to read input from the user. We can then use the `replaceAll()` method to replace all occurrences of the character "?" with "D". Finally, we can print the modified string using the `System.out.println()` method.<|endoftext|>
