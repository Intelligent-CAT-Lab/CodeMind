import sys

def main():
    s = sys.stdin.readline().strip()
    abc = [False] * 3
    for i in range(len(s)):
        if s[i] == 'a':
            abc[0] = True
        elif s[i] == 'b':
            abc[1] = True
        elif s[i] == 'c':
            abc[2] = True
    isOK = True
    for i in range(3):
        isOK = isOK and abc[i]
    print('Yes' if isOK else 'No')

if __name__ == '__main__':
    main()