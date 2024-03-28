import sys
import re

def main():
    line = sys.stdin.readline().strip()
    list_chars = list(line)
    a = 'A'
    sum = 0
    for char in list_chars:
        if char <= a:
            sum += 1
        a = char
    print(sum)

if __name__ == "__main__":
    main()