<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String nStr = Integer.toString(n);
        char[] listN = nStr.toCharArray();
        int num = 0;
        for (char c : listN) {
            num += Character.getNumericValue(c);
        }
        String ans = "No";
        if (n % num == 0) {
            ans = "Yes";
        }
        System.out.println(ans);
    }
}
```
<|EOT|>
