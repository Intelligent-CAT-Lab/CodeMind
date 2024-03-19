#8-A
import sys

def p02415():
    n = input()
    num = len(n)
    for i in range(num):
        if n[i].islower():
            print(n[i].upper(), end='')
        elif n[i].isupper():
            print(n[i].lower(), end='')
        else:
            print(n[i], end='')
    print()

if __name__ == '__main__':
    p02415()