import java.util
import java.math

class p00991:
    def main(self, r, c, a1, a2, b1, b2):
        x = abs(a1 - b1)
        y = abs(a2 - b2)
        x = min(x, r - x)
        y = min(y, c - y)
        z = 1
        C = min(x, y)
        if x == r - x:
            z *= 2
        if y == c - y:
            z *= 2
        b = 1
        for i in range(C):
            b = b.multiply(BigInteger(str(x + y - i)))
            b = b.divide(BigInteger(str(i + 1)))
        print(b.multiply(BigInteger(str(z))).mod(BigInteger(100000007)))