<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C, K;
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        K = scanner.nextInt();
        if ((K & 1) == 0) {
            System.out.println(A - B);
        } else {
            System.out.println(B - A);
        }
    }
}
```</s>
