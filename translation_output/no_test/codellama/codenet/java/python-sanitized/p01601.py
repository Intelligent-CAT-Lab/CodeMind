import math
import sys

EPS = 1e-10

def is_palin(s):
    for i in range(len(s) // 2):
        if s[i] != s[-i-1]:
            return False
    return True

def run():
    n = int(input())
    for i in range(n):
        if is_palin(str(n-i)):
            print(n-i)
            break
        if is_palin(str(n+i)):
            print(n+i)
            break

if __name__ == "__main__":
    run()