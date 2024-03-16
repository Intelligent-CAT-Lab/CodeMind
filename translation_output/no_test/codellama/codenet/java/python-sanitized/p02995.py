import java.util.*;

class Euclid:
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
            while (tmp = x % y) != 0:
                x = y
                y = tmp
            return y

class Compute:
    def cumulativeSum(A, k):
        ans = 0
        B = [0] * (len(A) + 1)
        B[0] = 0
        for i in range(1, len(B)):
            B[i] = B[i - 1] + A[i -