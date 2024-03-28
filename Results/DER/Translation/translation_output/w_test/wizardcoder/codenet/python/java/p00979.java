Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
19

Expected output:
5


```
#!/usr/bin/env python3
t = int(input())

count = 0
speed = 1
margin = 0
while t > 0:
    t -= speed
    count += 1
    if margin + speed * 3 <= t:
        speed *= 3
        margin += speed
    elif t < margin:
        margin -= speed
        speed /= 3
print(count)


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        int speed = 1;
        int margin = 0;
        while (t > 0) {
            t -= speed;
            count++;
            if (margin + speed * 3 <= t) {
                speed *= 3;
                margin += speed;
            } else if (t < margin) {
                margin -= speed;
                speed /= 3;
            }
        }
        System.out.println(count);
    }
}
```<|endoftext|>
