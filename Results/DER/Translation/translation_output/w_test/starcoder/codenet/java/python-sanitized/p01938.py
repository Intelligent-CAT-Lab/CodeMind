import sys

def main():
    line = sys.stdin.readline().strip()
    a = ord('A')
    sum = 0
    for c in line:
        if ord(c) <= a:
            sum += 1
        a = ord(c)
    print(sum)

if __name__ == '__main__':
    main()