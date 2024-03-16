<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

B = input()

O = ["1 1 0", "0 0 1"]

if B in O :
    print("Open")
else :
    print("Close")



Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String B = scanner.nextLine();

        String[] O = {"1 1 0", "0 0 1"};

        if (Arrays.asList(O).contains(B)) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `Arrays.asList()` method is used to convert the array `O` to a list, which can be used with the `contains()` method to check if the input `B` is in the list.</s>
