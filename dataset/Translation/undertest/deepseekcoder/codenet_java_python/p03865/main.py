import sys

def main():
    s = sys.stdin.readline().strip()
    a = len(s)
    flag = True

    if s[0] == s[-1]:
        if a % 2 == 1:
            flag = False
        else:
            flag = True
    else:
        if a % 2 == 1:
            flag = True
        else:
            flag = False

    if flag:
        print("First")
    else:
        print("Second")

if __name__ == "__main__":
    main()