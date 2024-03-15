import sys

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

    def __lt__(self, other):
        t = self.value / self.key
        o = other.value / other.key
        if t < o:
            return -1
        elif t > o:
            return 1
        else:
            return 0	

class Scanner:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.buffer = []

    def nextInt(self):
        num = 0
        sign = 1

        read = self.skip()
        if read == '-':
            sign = -1
            read = self.input_stream.read(1)

        while read.isdigit():
            num = num * 10 + sign * int(read)
            read = self.input_stream.read(1)

        return num

    def fill(self, a):
        for i in range(len(a)):
            a[i] = self.nextInt()

    def fillPairs(self, pair_list):
        for pair in pair_list:
            pair[0] = self.nextInt()
            pair[1] = self.nextInt()

    def next(self):
        read = self.skip()
        result = ''
        while read.isalpha():
            result += read
            read = self.input_stream.read(1)

        return result

    def skip(self):
        read = self.input_stream.read(1)
        while not read or read.isspace():
            read = self.input_stream.read(1)

        return read

def main():
    N, M, K = map(int, input().split())

    for i in range(N+1):
        for j in range(M+1):
            sum_value = M * i + N * j - (i * j * 2)
            if sum_value == K:
                print("Yes")
                return

    print("No")

if __name__ == "__main__":
    main()