import java.io.BufferedInputStream
import java.io.IOException
import java.io.InputStream
import java.util.Arrays

class p03592:

    def main(self):
        sc = Scanner(System.in)
        N = sc.nextInt()
        M = sc.nextInt()
        K = sc.nextInt()

        for i in range(N+1):
            for j in range(M+1):
                sum = M * i + N * j - (i * j * 2)
                if sum == K:
                    print("Yes")
                    return

        print("No")

    class Pair:
        def __init__(self, key, value):
            self.key = key
            self.value = value

        def getKey(self):
            return self.key

        def getValue(self):
            return self.value

        def toString(self):
            return "{" + str(self.key) + ", " + str(self.value) + "}"

        def compareTo(self, other):
            t = self.value / self.key
            o = other.value / other.key
            if t < o:
                return -1
            elif t > o:
                return 1
            else:
                return 0

    class Scanner:
        def __init__(self, in_):
            self.inputStream = BufferedInputStream(in_)
            self.buffer = StringBuilder()

        def nextInt(self):
            num = 0
            sign = 1

            read = self.skip()
            if read == '-':
                sign = -1
                read = self.inputStream.read()

            while read > 0x20:
                num = num * 10 + sign * (read - 0x30)
                read = self.inputStream.read()

            return num

        def fill(self, a):
            for i in range(len(a)):
                a[i] = self.nextInt()

        def fill(self, a, b):
            if len(a)!= len(b):
                raise IllegalArgumentException()

            for i in range(len(a)):
                a[i] = self.nextInt()
                b[i] = self.nextInt()

        def nextLong(self):
            num = 0
            sign = 1

            read = self.skip()
            if read == '-':
                sign = -1
                read = self.inputStream.read()

            while read > 0x20:
                num = num * 10 + sign * (read - 0x30)
                read = self.inputStream.read()

            return num

        def fill(self, a):
            for i in range(len(a)):
                a[i] = self.nextLong()

        def fill(self, a, b):
            if len(a)!= len(b):
                raise IllegalArgumentException()

            for i in range(len(a)):
                a[i] = self.nextLong()
                b[i] = self.nextLong()

        def nextLong(self, n):
            array = [0] * n
            for i in range(n):
                array[i] = self.nextLong()

            return array

        def next(self):
            read = self.skip()
            while read > 0x20:
                self.buffer.append(chr(read))
                read = self.inputStream.read()

            text = self.buffer.toString()
            self.buffer.delete(0, len(self.buffer))

            return text

        def skip(self):
            read = self.inputStream.read()
            while read <= 0x20:
                read = self.inputStream.