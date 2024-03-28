#8-A
import sys

def main():
    n = sys.stdin.readline().strip()

    num = len(n)

    for i in range(num):
        if n[i].islower():
            print(n[i].upper(), end='')
        elif n[i].isupper():
            print(n[i].lower(), end='')
        #elif n[i] == ' ':
        #    print(' ', end='')
        else:
            print(n[i], end='')

    print()

if __name__ == "__main__":
    main()