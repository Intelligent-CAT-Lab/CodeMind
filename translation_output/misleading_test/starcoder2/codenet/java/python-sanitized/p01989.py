import sys

def solve(s):
    length = len(s)
    ans = 0
    for i in range(1, length-2):
        for j in range(i+1, length-1):
            for k in range(j+1, length):
                a = [s[0:i], s[i:j], s[j:k], s[k:length]]
                for x in range(0, 4):
                    if len(a[x]) != len(str(int(a[x]))):
                        continue
                b = [int(a[0]), int(a[1]), int(a[2]), int(a[3])]
                if b[0]<=255 and b[1]<=255 and b[2]<=255 and b[3]<=255:
                    ans += 1
    return ans

if __name__ == '__main__':
    s = sys.stdin.readline().strip()
    print(solve(s))