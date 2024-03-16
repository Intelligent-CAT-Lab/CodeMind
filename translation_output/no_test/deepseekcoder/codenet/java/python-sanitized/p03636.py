import sys

def main():
    s = sys.stdin.readline().strip()
    leng = len(s)
    print(s[0], end='')
    print(leng-2, end='')
    print(s[leng-1])

if __name__ == "__main__":
    main()