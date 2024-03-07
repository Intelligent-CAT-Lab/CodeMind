<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

x = input()

if x == "a" or x == "i" or x == "u" or x == "e" or x == "o" :
    print("vowel")
else:
    print("consonant")


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

```
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String input = scanner.nextLine();
        if (input.equals("a") || input.equals("i") || input.equals("u") || input.equals("e") || input.equals("o")) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
```

In this code, we first import the `Scanner` class from the `java.util` package, which allows us to read input from the user. We then create a `Scanner` object and use it to read a line of input from the user. We then check if the input is equal to any of the vowels using the `equals` method, and if it is, we print "Vowel" to the console. If the input is not equal to any of the vowels, we print "Consonant" to the console.</s>
