import sys

def main():
    N = int(sys.stdin.readline())
    out = [0] * 11
    for i in range(11):
        N -= 1
        x = N // 26
        y = N % 26
        out[i] = chr(ord('a') + y)
        if x == 0:
            break
        N = x
    for i in range(10, -1, -1):
        if out[i] == 0:
            continue
        sys.stdout.write(out[i])

if __name__ == "__main__":
    main()