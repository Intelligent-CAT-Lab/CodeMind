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
        return (a * b) // e