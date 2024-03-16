<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s1,s2,s3=input().upper().split()
print(s1[0]+s2[0]+s3[0])

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().toUpperCase();
        String s2 = scanner.nextLine().toUpperCase();
        String s3 = scanner.nextLine().toUpperCase();
        System.out.println(s1.charAt(0) + s2.charAt(0) + s3.charAt(0));
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `toUpperCase()` method to convert the input to uppercase. It then uses the `charAt()` method to get the first character of each string, and the `+` operator to concatenate them. Finally, it prints the result to the console.</s>
