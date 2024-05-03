import sys
from math import factorial

def main():
    fact = 1
    for i in range(1, 1511):
        fact *= i
    fact += 2

    for line in sys.stdin:
        n = int(line)
        print(fact)
        for i in range(2, 2 + n):
            print(i)

if __name__ == "__main__":
    main()