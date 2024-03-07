<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:


import java.util.Scanner;

public class p00290 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(d*c);

    }
}



Translate the above java code to python.

python code:

[/INST]

import sys

d = int(sys.stdin.readline())
c = int(sys.stdin.readline())
print(d*c)</s>
