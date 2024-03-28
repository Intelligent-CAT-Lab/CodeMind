Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7 3

Expected output:
-60

```
# -*- coding: utf-8 -*-


def main():
    n, k = list(map(int, input().split()))

    if n % k == 0:
        print(0)
    else:
        print(1)


if __name__ == '__main__':
    main()

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        if (n % k == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
```<|endoftext|>
