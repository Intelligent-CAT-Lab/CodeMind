import sys

def main():
    x, y, a, b = map(int, sys.stdin.readline().split())
    res = []
    for i in range(a, x+1):
        for j in range(b, y+1):
            if i <= j:
                continue
            res.append(str(i) + " " + str(j))
    print(len(res))
    for r in res:
        print(r)

if __name__ == "__main__":
    main()