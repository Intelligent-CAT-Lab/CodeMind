import sys

def main():
    h, w, a, b = map(int, sys.stdin.readline().split())
    result = []

    for i in range(h):
        row = []
        for j in range(w):
            x = 1 if (j < a) ^ (i < b) else 0
            row.append(str(x))
        result.append("".join(row))
    print("\n".join(result))

if __name__ == "__main__":
    main()