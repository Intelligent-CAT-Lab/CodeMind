<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n = int(input())
list_N = list(str(n))
num = 0

for i in list_N:
    num += int(i)
ans = "No"

if n%num == 0:
    ans = "Yes"

print(ans)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] listN = String.valueOf(n).split("");
        int num = 0;

        for (String i : listN) {
            num += Integer.parseInt(i);
        }

        String ans = "No";
        if (n % num == 0) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}
```
Note that in Java, we use the `Scanner` class to read input from the user, and the `String.valueOf()` method to convert an integer to a string. We also use the `String.split()` method to split the string into an array of individual characters.</s>
