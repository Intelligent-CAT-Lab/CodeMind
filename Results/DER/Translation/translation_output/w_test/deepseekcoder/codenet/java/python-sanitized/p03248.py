import sys

def main():
    s = input().strip()
    l = len(s)

    if s[0] == '1' or s[-1] == '0':
        print(-1)
        return
    else:
        for i in range(l // 2):
            if s[i] != s[l - i - 1]:
                print(-1)
                return

    print(1, 2)
    for i in range(3, l + 1):
        print(i - 1, i)
        if s[i - 2] == '1':
            pass

if __name__ == "__main__":
    main()