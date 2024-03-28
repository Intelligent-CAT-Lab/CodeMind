import java.io.BufferedInputStream
import java.io.IOException
import java.io.InputStream
import java.util.Arrays

class p03592:

    def __init__(self):
        pass

    def main(self, args):
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

        def __str__(self):
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
        def __init__(self, in_stream):
            self.in_stream = in_stream
            self.buffer = ""

        def nextInt(self):
            num = 0
            sign = 1

            read = self.skip()
            if read == '-':
                sign = -1
                read = self.in_stream.read()

            while read > 0x20:
                num = num * 10 + sign * (read - 0x30)
                read = self.in_stream.read()

            return num

        def fill(self, a):
            for i in range(len(a)):
                a[i] = self.nextInt()

        def fill(self, a, b):
            if len(a)!= len(b):
                raise ValueError("Arrays must be of equal length")

            for i in range(len(a)):
                a[i] = self.nextInt()
                b[i] = self.nextInt()

        def nextLong(self):
            num = 0
            sign = 1

            read = self.skip()
            if read == '-':
                sign = -1
                read = self.in_stream.read()

            while read > 0x20:
                num = num * 10 + sign * (read - 0x30)
                read = self.in_stream.read()

            return num

        def fill(self, a):
            for i in range(len(a)):
                a[i] = self.nextLong()

        def fill(self, a, b):
            if len(a)!= len(b):
                raise ValueError("Arrays must be of equal length")

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
                self.buffer += chr(read)
                read = self.in_stream.read()

            text = self.buffer
            self.buffer =