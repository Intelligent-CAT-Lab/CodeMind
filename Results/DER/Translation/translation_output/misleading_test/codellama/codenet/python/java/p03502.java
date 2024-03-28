<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String listN = String.valueOf(n);
        int num = 0;

        for (int i = 0; i < listN.length(); i++) {
            num += Integer.parseInt(listN.substring(i, i + 1));
        }

        String ans = "No";
        if (n % num == 0) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}
```
Note: The code uses the `Scanner` class to read input from the user, and the `String.valueOf()` method to convert the input to a string. The `String.substring()` method is used to extract the individual digits from the string and convert them to integers. The `Integer.parseInt()` method is used to convert the individual digits to integers. The `String.length()` method is used to get the length of the string.</s>
