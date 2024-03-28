import sys

def main():
    line = sys.stdin.readline().split()
    n = int(line[0])
    k = int(line[1])

    num = [0]*k

    for i in range(1, n+1):
        num[i % k] += 1

    res = 0
    for a in range(k):
        b = (k - a) % k
        c = (k - a) % k
        if ((b + c) % k != 0):
            continue
        res += num[a] * num[b] * num[c]

    print(res)

if __name__ == "__main__":
    main()