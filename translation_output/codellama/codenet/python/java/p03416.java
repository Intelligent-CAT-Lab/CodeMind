<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

f, t = [int(i) for i in input().split()]
print(len([i for i in range(f, t+1) if str(i) == str(i)[::-1]]))

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int t = scanner.nextInt();
        int count = 0;
        for (int i = f; i <= t; i++) {
            String str = String.valueOf(i);
            if (str.equals(new StringBuilder(str).reverse().toString())) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it uses a `for` loop to iterate over the range of numbers from `f` to `t`, and for each number it checks if it is a palindrome by reversing the string representation of the number and comparing it to the original string. If the two strings are equal, it means that the number is a palindrome, and it increments the `count` variable. Finally, it prints the value of `count` which is the number of palindromes in the range.</s>
