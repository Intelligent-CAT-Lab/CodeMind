<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

S = input()
print('Yes' if S[:4] == 'YAKI' else 'No')

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Yaki {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        if (S.substring(0, 4).equals("YAKI")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}</s>
