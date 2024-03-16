import sys

def solve(inp, out, ms):
    s = inp.readline().strip()
    length = len(s)
    ans = 0

    for i in range(1, length - 2):
        for j in range(i + 1, length - 1):
            for k in range(j + 1, length):
                a = [s[:i], s[i:j], s[j:k], s[k:]]

                for x in range(4):
                    if len(a[x]) != len(str(int(a[x]))):
                        break
                else:
                    b = [int(a[0]), int(a[1]), int(a[2]), int(a[3])]
                    if all(0 <= x <= 255 for x in b):
                        ans += 1

    out.write(str(ans) + '\n')


if __name__ == "__main__":
    solve(sys.stdin, sys.stdout, None)