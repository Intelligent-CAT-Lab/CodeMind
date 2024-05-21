import sys

def main():
    str = sys.stdin.readline().strip()
    str = str.replace("BC", "X")
    a = 0
    ans = 0
    for i in range(len(str)-1, -1, -1):
        c = str[i]
        if c == 'X':
            a += 1
        elif c == 'A':
            ans += a
        else:
            a = 0
    print(ans)

if __name__ == "__main__":
    main()