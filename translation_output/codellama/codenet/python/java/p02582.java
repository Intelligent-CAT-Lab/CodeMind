<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

import sys


def solve():
    readline = sys.stdin.buffer.readline
    mod = 10 ** 9 + 7
    s = str(readline().rstrip().decode('utf-8'))
    if s == "RRR":
        print(3)
    elif s == "RRS" or s == "SRR":
        print(2)
    elif s.count("R") == 0:
        print(0)
    else:
        print(1)


if __name__ == '__main__':
    solve()


Translate the above python code to java.

java code:

[/INST]

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equals("RRR")) {
            System.out.println(3);
        } else if (s.equals("RRS") || s.equals("SRR")) {
            System.out.println(2);
        } else if (s.indexOf("R") == -1) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}

Note: The above code uses the `Scanner` class to read input from the standard input stream, and the `String` class to manipulate strings. The `indexOf` method is used to check if a string contains a specific substring.</s>
