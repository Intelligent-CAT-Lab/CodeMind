import java.lang
import java.io
import java.util

class p03264:
    def main(self, args):
        sc = FScanner()
        n = sc.readInt()
        o = 0
        e = 0
        for i in range(1, n+1):
            if i % 2 == 1:
                o += 1
            else:
                e += 1
        print(o*e)

    def solve(self):
        pass

    def disp(self, data):
        for i in range(len(data)):
            print(data[i], end=" ")
        print()

    def disp(self, data):
        for i in range(len(data)):
            print(data[i], end=" ")
        print()

    class FScanner:
        def __init__(self):
            self.sc = Scanner(System.in)

        def hasNextLine(self):
            return self.sc.hasNextLine()

        def readInt(self):
            return self.sc.nextInt()

        def readLong(self):
            return Long.parseLong(self.sc.nextLine())

        def readIntL(self):
            buf = self.sc.nextLine().split(" ")
            num = [int(i) for i in buf]
            return num

        def readString(self):
            return self.sc.nextLine()

        def readStringL(self, dlm):
            s = self.sc.nextLine().split(dlm)
            return s