<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

import sys
import numpy as np

n = int(sys.stdin.readline().strip())
a = int(np.sqrt(n))
print(str(a*a))

Translate the above python code to java.

java code:

[/INST]

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (int) Math.sqrt(n);
        System.out.println(a * a);
    }
}</s>
