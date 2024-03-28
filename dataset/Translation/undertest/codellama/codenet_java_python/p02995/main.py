import math

class Euclid:
    def gcd(x, y):
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
    def cumulative_sum(A, k):
        B = [0] + [B[i - 1] + A[i - 1] for i