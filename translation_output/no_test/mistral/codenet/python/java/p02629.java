<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
import sys 
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines
N = int(readline())
res = ''
while(N):
    N -= 1
    res += chr(ord('a') + N % 26)
    N //= 26
print(res[::-1])
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int N = Integer.parseInt(input);
        StringBuilder res = new StringBuilder();
        while (N > 0) {
            N--;
            res.append((char) (('a' + N % 26)));
            N /= 26;
        }
        System.out.println(res.reverse());
    }
}
```</s>
