```python
class Euclid:
    def gcd(self, x, y):
        if x < y:
            x, y = y, x
        if x == 0:
            return y
        elif y == 0:
            return x
        else:
            while y != 0:
                x, y = y, x % y
            return x

class Compute:
    def cumulative_sum(self, A, k):
        ans = 0
        B = [0] * (len(A) + 1)
        for i in range(1, len(B)):
            B[i] = B[i - 1] + A[i - 1]

        ans = B[k] - B[0]
        for i in range(1, len(A) - k):
            tmp = B[i + k] - B[i]
            if tmp > ans:
                ans = tmp
        return ans

    def least_common_multiple(self, a, b):
        e1 = Euclid()
        return (a * b) // e1.gcd(a, b)

if __name__ == "__main__":
    e1 = Euclid()
    c1 = Compute()

    A, B, C, D = map(int, input().split())
    n = B - A + 1

    if C == D:
        a = A // C
        b = B // C
        x = b - a
        if A % C == 0:
            x += 1
        answer = n - x
    else:
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

        e = c1.least_common_multiple(C, D)
        a = A // e
        b = B // e
        r = b - a
        if A % e == 0:
            r += 1

        answer = n - (p + q - r)

    print(answer)
```
The translated Python code performs the same functionality as the provided Java code. Just input the values for A, B, C, and D on separate lines when running the Python code.
