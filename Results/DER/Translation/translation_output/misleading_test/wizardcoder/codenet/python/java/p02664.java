Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
PD?D??P

Expected output:
PDPJDPDP

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
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                arr[i] = 'D';
            }
        }
        String output = new String(arr);
        System.out.println(output);
    }
}
```<|endoftext|>
