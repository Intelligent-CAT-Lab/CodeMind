<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

# -*- coding: utf-8 -*-
import sys
from operator import itemgetter
from fractions import gcd
from math import ceil, floor, sqrt
from copy import deepcopy
from collections import Counter, deque
import heapq
from functools import reduce
# local only
# if not __debug__:
#     fin = open('in_1.txt', 'r')
#     sys.stdin = fin
# local only
sys.setrecursionlimit(200000)
input = sys.stdin.readline
def ii(): return int(input())
def mi(): return map(int, input().rstrip().split())
def lmi(): return list(map(int, input().rstrip().split()))
def li(): return list(input().rstrip())
def debug(*args, sep=" ", end="\n"): print("debug:", *args, file=sys.stderr, sep=sep, end=end) if not __debug__ else None
def exit(*arg): print(*arg); sys.exit()
# template




def main():
    A, B, C = mi()
    if (A * B) % 2 == 0 and (B * C) % 2 == 0 and (C * A) % 2 == 0:
        print('Tem')
    else:
        print('Hom')

if __name__ == '__main__':
    main()



Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if ((A * B) % 2 == 0 && (B * C) % 2 == 0 && (C * A) % 2 == 0) {
            System.out.println("Tem");
        } else {
            System.out.println("Hom");
        }
    }
}
```
Note: The above code uses the `Scanner` class to read input from the user. The `Scanner` class is a part of the `java.util` package, so you need to import it at the beginning of your code.

Also, note that the `main` method is the entry point of the program, and it is where the program starts executing. The `main` method takes an array of `String` arguments as input, but in this case, we are not passing any arguments, so we can ignore the `args` parameter.

Finally, note that the `System.out.println` method is used to print output to the console. The `System.out` object is a part of the `java.lang` package, so you need to import it at the beginning of your code.</s>
