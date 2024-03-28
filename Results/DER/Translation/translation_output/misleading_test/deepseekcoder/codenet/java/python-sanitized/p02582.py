import sys

def main():
    s = sys.stdin.readline().strip()
    res = 0
    if s[0:3] == 'RRS':
        res = 3
    elif s[0:2] == 'RR':
        res = 2
    elif s[1:3] == 'RR':
        res = 2
    elif s == 'SSS':
        res = 0
    else:
        res = 1

    print(res)

if __name__ == "__main__":
    main()