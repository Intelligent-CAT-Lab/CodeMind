import sys

def main():
    s = sys.stdin.readline()
    if s[0] == s[1] and s[1] == s[2]:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()