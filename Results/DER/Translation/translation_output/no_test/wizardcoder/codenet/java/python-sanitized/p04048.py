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
        n = p04048.nl()
        x = p04048.nl()
        sum = 0
        if x == n - x:
            sum = 3 * x
            p04048.out.println(sum)
            return
        else:
            if x > n - x:
                sum += x + n - x
                sum += p04048.calc(x, n - x, False)
            elif x < n - x:
                sum += x + n - x
                sum += p04048.calc(x, n - x, False)
            p04048.out.println(sum)
            return

    def calc(x, y, first):
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
            sum += p04048.calc(y, x % y, False)
            return sum

    def main(args):
        p04048.is = INPUT.isEmpty() and System.in or ByteArrayInputStream(INPUT.getBytes())
        p04048.out = PrintWriter(System.out)

        p04048.solver()
        p04048.out.flush()

    def nl():
        try:
            num = 0
            minus = False
            while ((num = p04048.is.read())!= -1 and not((num >= '0' and num <= '9') or num == '-')):
                pass
            if num == '-':
                num = 0
                minus = True
            else:
                num -= '0'

            while True:
                b = p04048.is.read()
                if b >= '0' and b <= '9':
                    num = num * 10 + (b - '0')
                else:
                    return minus and -num or num
        except IOException as e:
            pass
        return -1

    def nc():
        try:
            b = p04048.skip()
            if b == -1:
                return 0
            return chr(b)
        except IOException as e:
            pass
        return 0

    def