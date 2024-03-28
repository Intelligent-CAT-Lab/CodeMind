Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
def main():
    A, B, C, K = map(int, input().split())
    if K&1 == 0:# å¶æ°
        print(A-B)
    else:
        print(B-A)

if __name__ == "__main__":
    main()
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        if (K % 2 == 0) { // å¶æ°
            System.out.println(A - B);
        } else {
            System.out.println(B - A);
        }
    }
}
```<|endoftext|>
