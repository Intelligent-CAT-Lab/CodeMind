import sys

def main():
    s = sys.stdin.readline().strip()
    abc = [False] * 3
    for i in range(3):
        if s[i] == 'a':
            abc[0] = True
        if s[i] == 'b':
            abc[1] = True
        if s[i] == 'c':
            abc[2] = True

    is_ok = True
    for i in range(3):
        is_ok &= abc[i]

    print("Yes" if is_ok else "No")

if __name__ == "__main__":
    main()