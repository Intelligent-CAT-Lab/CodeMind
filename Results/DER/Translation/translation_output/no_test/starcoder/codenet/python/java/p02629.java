<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = "";
        while(n > 0) {
            res += (char)('a' + n % 26);
            n /= 26;
        }
        System.out.println(res.substring(0, res.length() - 1));
    }
}
```
<|endoftext|>
