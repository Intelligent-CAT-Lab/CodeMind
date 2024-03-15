<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
def main():
    N = input()

    a, b, c, d = list(N)
    if a == b == c or b == c == d:
        print("Yes")
    else:
        print("No")

if __name__ == '__main__':
    main()

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt();
        }

        if (arr[0] == arr[1] && arr[1] == arr[2] || arr[1] == arr[2] && arr[2] == arr[3]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
