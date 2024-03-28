import sys

def main():
    input = sys.stdin
    output = sys.stdout
    solver = TaskA()
    solver.solve(1, input, output)
    output.close()

class TaskA:
    def solve(self, testNumber, input, output):
        t = int(input.readline())
        s = int(input.readline())
        q = int(input.readline())
        sum = 0
        while s < t:
            s = s * q
            sum += 1
        output.write(str(sum) + '\n')

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def hasNext(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readline())
            except Exception as e:
                return False
        return True

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readline())
            except Exception as e:
                raise RuntimeError(e)
        return self.tokenizer.nextToken()

    def nextLine(self):
        str = None
        try:
            str = self.reader.readline()
        except Exception as e:
            e.printStackTrace()
        return str

    def nextInt(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLong(self):
        return long(self.next())

    def nextBigInteger(self):
        return BigInteger(self.next())

    def nextBigDecimal(self):
        return BigDecimal(self.next())