<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

C=input()
al=[]
for idx in range(97,123):
  al.append(chr(idx))
idx = al.index(C)
print(al[idx+1])

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int index = Arrays.asList(alphabet).indexOf(input.charAt(0));
        System.out.println(alphabet[index + 1]);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Arrays.asList()` method to convert the alphabet array to a list, which allows us to use the `indexOf()` method to find the index of the input character in the alphabet. Finally, we print the character at the next index in the alphabet.</s>
