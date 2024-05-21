import sys

def main():
    n, w = map(int, sys.stdin.readline().split())
    for i in range(n - w + 1):
        count = [0] * (n + 1)
        for j in range(1, int(w ** 0.5) + 1):
            if w % j == 0:
                count[j] += 1
                count[w // j] += 1
        for j in range(1, int((i + w) ** 0.5) + 1):
            if (i + w) % j == 0:
                count[j] -= 1
                count[(i + w) // j] -= 1
        for j in range(1, int(i ** 0.5) + 1):
            if i % j == 0:
                count[j] += 1
                count[i // j] += 1
        ans = sum(1 for c in count if c > 0)
        print(ans, end=' ')

if __name__ == '__main__':
    main()