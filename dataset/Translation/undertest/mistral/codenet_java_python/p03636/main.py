import sys

def main():
    s = sys.stdin.readline()
    leng = len(s)
    print(s[0])
    print(leng-2)
    print(s[leng-1])

if __name__ == "__main__":
    main()