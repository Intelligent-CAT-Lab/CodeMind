import sys

def main():
    s = sys.stdin.readline().rstrip()
    while len(s) > 3:
        if "ABC" not in s:
            print("No")
            return
        s = s.replace("ABC", "X", 1)
        if "X" not in s:
            print("Yes")
            return
        s = s.replace("X", "A")
    print("Yes" if s == "ABC" else "No")

if __name__ == '__main__':
    main()