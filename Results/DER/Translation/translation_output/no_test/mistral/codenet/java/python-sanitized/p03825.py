import sys

def solve(test_number, in, out):
    zeroes = in.readline().strip().split()[0]
    ones = in.readline().strip().split()[0]
    k = int(in.readline().strip().split()[0])
    depth = (int(zeroes) + int(ones) - 1) // (k-1)
    ways = [0] * (int(ones) + 1)
    ways[0] = 1
    res = 0
    nice = [False] * (int(ones) + 1)
    for i in range(1, depth+1):
        nice = [False] * (int(ones) + 1)
        for extra in range(i, depth+1):
            now = int(ones) - extra * (k-1)
            if now >= 0:
                nice[now] = True
        for old in range(int(ones), -1, -1):
            if ways[old] != 0:
                for cur in range(1, k and old+cur <= int(ones)):
                    if nice[old+cur]:
                        res += ways[old]
                        if res >= 10**9:
                            res %= 10**9
                    ways[old+cur] += ways[old]
                    if ways[old+cur] >= 10**9:
                        ways[old+cur] %= 10**9
    out.write(str(res) + "\n")

def main():
    in = sys.stdin
    out = sys.stdout
    test_number = int(input())
    solve(test_number, in, out)

if __name__ == "__main__":
    main()