import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import java.io.PrintWriter
import java.util.Arrays

class p04048:
    is = None
    out = None
    INPUT = ""

    def solver():
        n = int(input())
        x = int(input())
        sum = 0
        if x == n - x:
            sum = 3 * x
            print(sum)
            return
        else:
            if x > n - x:
                sum += x + n - x
                sum += self.calc(x, n - x, False)
            elif x < n - x:
                sum += x + n - x
                sum += self.calc(x, n - x, False)
            print(sum)
            return

    def calc(self, x, y, first):
        sum = 0
        if x % y == 0:
            if first:
                sum += y
            sum += (x // y * 2 - 1) * y
            return sum
        else:
            if first:
                sum += y
            sum += (x // y * 2) * y
            sum += self.calc(y, x % y, False)
            return sum

    def main(self):
        self.is = INPUT.isEmpty() and System.in or ByteArrayInputStream(INPUT.getBytes())
        self.out = PrintWriter(System.out)

        self.solver()
        self.out.flush()

    def nl(self):
        try:
            num = 0
            minus = False
            while ((num = self.is.read())!= -1 and not((num >= '0' and num <= '9') or num == '-')):
                pass
            if num == '-':
                num = 0
                minus = True
            else:
                num -= '0'

            while True:
                b = self.is.read()
                if b >= '0' and b <= '9':
                    num = num * 10 + (b - '0')
                else:
                    return minus and -num or num
        except IOException as e:
            pass
        return -1

    def nc(self):
        try:
            b = self.skip()
            if b == -1:
                return 0
            return chr(b)
        except IOException as e:
            pass
        return 0

    def nd(self):
        try:
            return float(self.ns())
        except Exception as e:
            pass
        return 0

    def ns(self