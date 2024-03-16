```python
import math

class Euclid:
    @staticmethod
    def gcd(x, y):
        tmp = 0
        if x < y:
            tmp = x
            x = y
            y = tmp
        if x == 0:
            return y
        elif y == 0:
            return x
        else:
            while (tmp := x % y) != 0:
                x = y
                y = tmp
            return y

class Compute:
    def cumulative_sum(self, A, k):
        ans = 0
        B = [0] * (len(A) + 1)

        for i in range(1, len(B)):
            B[i] = B[i - 1] + A[i - 1]

        tmp = 0
        ans = B[k] - B[0]
        for i in range(1, len(A) - k):
            tmp = B[i + k] - B[i]
            if tmp > ans:
                ans = tmp
        print(B)
        return ans

    def least_common_multiple_int(self, a, b):
        e1 = Euclid()
        return (a*b) // e1.gcd(a, b)

    def least_common_multiple_long(self, a, b):
        e1 = Euclid()
        return (a*b) // e1.gcd(a, b)

def main():
    e1 = Euclid()
    c1 = Compute()

    count = 0
    sw = False
    max_value = -math.inf
    min_value = math.inf
    dMax = -math.inf
    dMin = math.inf

    answer = 0
    A, B, C, D = map(int, input().split())
    n = B - A + 1

    if C == D:
        a = A // C
        b = B // C
        x = b - a
        if A % C == 0:
            x += 1
        answer = n - x
        print(answer)
        return

    a = A // C
    b = B // C
    p = b - a
    if A % C == 0:
        p += 1

    a = A // D
    b = B // D
    q = b - a
    if A % D == 0:
        q += 1

    e = c1.least_common_multiple_int(C, D)
    a = A // e
    b = B // e
    r = b - a
    if A % e == 0:
        r += 1

    answer = n - (p + q - r)
    print(answer)

if __name__ == "__main__":
    main()
```
