<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

S = str(input())

if S == 'AAA' or S == 'BBB':
    print('No')
else:
    print('Yes')

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if (S.equals("AAA") || S.equals("BBB")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}</s>
