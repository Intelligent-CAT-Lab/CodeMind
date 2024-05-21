import sys

def main():
    s = sys.stdin.read().strip()
    leng = len(s)
    print(s[0] + str(leng-2) + s[leng-1])

if __name__ == "__main__":
    main()