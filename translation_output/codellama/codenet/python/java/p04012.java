<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

# coding = SJIS
Alfa = "abcdefghijklmnopqrstuvwxyz"
w = str(input())
for i in Alfa:
    if w.count(i) % 2 == 1:
        print("No")
        exit()
print("Yes")

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        String Alfa = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < Alfa.length(); i++) {
            if (w.indexOf(Alfa.charAt(i)) % 2 == 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
```
This is the Java code that translates the Python code. It uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. The `indexOf` method is used to find the index of a character in a string, and the `%` operator is used to check if the index is odd or even. If the index is odd, the program prints "No" and exits. If the index is even, the program prints "Yes" and continues to the next iteration.</s>
