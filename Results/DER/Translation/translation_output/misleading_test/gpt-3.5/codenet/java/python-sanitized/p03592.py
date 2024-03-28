import sys

class Pair:
    def __init__(self, key, value):
        self.key = key
        self.value = value

    def getKey(self):
        return self.key

    def getValue(self):
        return self.value

    def __repr__(self):
        return "{" + str(self.key) + ", " + str(self.value) + "}"

    def __lt__(self, other):
        t = self.value / self.key
        o = other.value / other.key
        if t < o:
            return -1
        elif t > o:
            return 1
        else:
            return 0

def main():
    N, M, K = map(int, input().split())

    for i in range(N+1):
        for j in range(M+1):
            sum_val = M * i + N * j - (i * j * 2)
            if sum_val == K:
                print("Yes")
                return

    print("No")

class Scanner:
    def __init__(self):
        self.input_stream = sys.stdin
        self.buffer = []

    def nextInt(self):
        num = 0
        sign = 1

        read = self.skip()
        if read == '-':
            sign = -1
            read = self.input_stream.read(1)

        while read >= '0' and read <= '9':
            num = num * 10 + sign * (ord(read) - ord('0'))
            read = self.input_stream.read(1)
        
        return num

    def skip(self):
        read = self.input_stream.read(1)
        while read != '' and (read == ' ' or read == '\n' or read == '\r' or read == '\t'):
            read = self.input_stream.read(1)

        return read

sys.setrecursionlimit(10**6)
scanner = Scanner()
main()