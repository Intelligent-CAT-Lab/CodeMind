<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n = int(input())
ans = 0
for x in (25, 10, 5, 1):
  ans += n // x
  n %= x
print(ans)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        for (int x = 25; x >= 1; x /= 2) {
            ans += n / x;
            n %= x;
        }
        System.out.println(ans);
    }
}
```
This code uses a `Scanner` object to read the input from the user, and then uses a `for` loop to iterate over the values of `x` from 25 to 1, dividing `n` by each value and storing the result in `ans`. The remainder of the division is stored in `n` using the modulo operator `%`. Finally, the value of `ans` is printed to the console.</s>
