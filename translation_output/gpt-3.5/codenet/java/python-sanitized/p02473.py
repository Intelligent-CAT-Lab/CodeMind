from sys import stdin
from math import sqrt

def main():
    line = stdin.readline()
    a, b = map(int, line.strip().split())
    
    a = abs(a - b)
    
    print(a)

if __name__ == "__main__":
    main()