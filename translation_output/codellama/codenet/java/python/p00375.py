<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:


import java.util.Scanner;

class p00375
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println((a - 30) / 2);
    }

}



Translate the above java code to python.

python code:

[/INST]

import sys

a = int(sys.stdin.readline())

print((a - 30) // 2)</s>
