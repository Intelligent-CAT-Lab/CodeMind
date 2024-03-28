import sys

def main():
    s = sys.stdin.readline().strip()
    leng = len(s)
    print(s[0], leng-2, s[leng-1], sep='')

if __name__ == "__main__":
    main()