<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a=input()
K=a.count('K')
U=a.count('U')
P=a.count('P')
C=a.count('C')
print(min(K,U,P,C))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int K = 0, U = 0, P = 0, C = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'K') {
                K++;
            } else if (a.charAt(i) == 'U') {
                U++;
            } else if (a.charAt(i) == 'P') {
                P++;
            } else if (a.charAt(i) == 'C') {
                C++;
            }
        }
        System.out.println(Math.min(K, Math.min(U, Math.min(P, C))));
    }
}

This code uses the `Scanner` class to read a line of input from the user, and then uses a `for` loop to iterate over the characters in the input string. For each character, it checks whether it is equal to 'K', 'U', 'P', or 'C', and if so, it increments the corresponding variable. Finally, it prints the minimum of the four variables using the `Math.min()` method.</s>
