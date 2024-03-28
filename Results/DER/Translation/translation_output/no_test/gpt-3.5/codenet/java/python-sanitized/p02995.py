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
        return (a*b) // e