<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3 1

Expected output:
-90

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
public class Main {
    public static void main(String[] args) {
        int A, B, C, K;
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        K = scanner.nextInt();
        if (K % 2 == 0) {
            System.out.println(A - B);
        } else {
            System.out.println(B - A);
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user. The `nextInt()` method is used to read an integer from the input. The `%` operator is used to check if the value of `K` is even or odd.</s>
