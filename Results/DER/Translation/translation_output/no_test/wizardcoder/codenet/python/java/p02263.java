Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n = input().split()
s = []
for i in range(len(n)):
    if n[i] == "+":
        a = s.pop()
        b = s.pop()
        s.append(b + a)
    elif n[i] == "-":
        a = s.pop()
        b = s.pop()
        s.append(b - a)
    elif n[i] == "*":
        a = s.pop()
        b = s.pop()
        s.append(b * a)
    else:
        s.append(int(n[i]))
print(s.pop())

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split(" ");
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n.length; i++) {
            if (n[i].equals("+")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b + a);
            } else if (n[i].equals("-")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b - a);
            } else if (n[i].equals("*")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b * a);
            } else {
                s.push(Integer.parseInt(n[i]));
            }
        }
        System.out.println(s.pop());
    }
}
```<|endoftext|>
