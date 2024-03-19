import sys

def main():
    s = sys.stdin.readline().strip()
    abc = [False, False, False]
    for c in s:
        if c == 'a':
            abc[0] = True
        elif c == 'b':
            abc[1] = True
        elif c == 'c':
            abc[2] = True
    is_ok = all(abc)
    print("Yes" if is_ok else "No")

if __name__ == "__main__":
    main()