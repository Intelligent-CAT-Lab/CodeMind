<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N = input()

if "7" in N:
    print("Yes")
else:
    print("No")

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();

        if (N.contains("7")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}</s>
