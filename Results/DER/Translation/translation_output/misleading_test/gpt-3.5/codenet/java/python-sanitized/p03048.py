import sys

def nextPermutation(a):
    t = len(a) - 1
    tt = t + 1
    for i in range(t, 0, -1):
        if a[i - 1] < a[i]:
            swapIndex = Find(a[i - 1], a, i, t)
            temp = a[swapIndex]
            a[swapIndex] = a[i - 1]
            a[i - 1] = temp
            a[i:tt] = sorted(a[i:tt])
            return True
    return False

def Find(dest, a, s, e):
    if s == e:
        return s
    m = (s + e + 1) // 2
    return Find(dest, a, s, m - 1) if a[m] <= dest else Find(dest, a, m, e)

def main():
    inputs = list(map(int, input().split()))
    R, G, B, N = inputs
    f = 0
    for r in range(N // R + 1):
        for g in range((N - r * R) // G + 1):
            if (N - r * R - g * G) % B == 0:
                f += 1
    print(f)

if __name__ == '__main__':
    main()