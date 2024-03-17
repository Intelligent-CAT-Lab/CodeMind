import sys

def is_valid(s):
    abc = [0, 0, 0]
    for c in s:
        if c == 'a':
            abc[0] += 1
        elif c == 'b':
            abc[1] += 1
        elif c == 'c':
            abc[2] += 1
    abc.sort()
    return ((abc[1] - abc[0] < 2) and (abc[2] - abc[0] < 2))

def main():
    s = sys.stdin.readline().strip()
    print("YES" if is_valid(s) else "NO")

if __name__ == "__main__":
    main()