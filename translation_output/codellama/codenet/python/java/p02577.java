<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n = input()
tmp = 0
for i in range(len(n)):
  tmp = (tmp + int(n[i])) % 9

print("Yes") if tmp == 0 else print("No")

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int tmp = 0;
        for (int i = 0; i < n.length(); i++) {
            tmp = (tmp + Integer.parseInt(n.substring(i, i + 1))) % 9;
        }
        System.out.println(tmp == 0 ? "Yes" : "No");
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `Integer.parseInt()` method is used to convert the input string to an integer. The `substring()` method is used to extract the individual digits from the input string.</s>
