System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
12

Expected output:
;@G

```
n = int(input())
list_N = list(str(n))
num = 0

for i in list_N:
    num += int(i)
ans = "No"

if n%num == 0:
    ans = "Yes"

print(ans)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String numString = String.valueOf(n);
        int sum = 0;
        for (char c : numString.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        String ans = n % sum == 0? "Yes" : "No";
        System.out.println(ans);
    }
}
```

Test input:
12

Expected output:
Yes<|endoftext|>
