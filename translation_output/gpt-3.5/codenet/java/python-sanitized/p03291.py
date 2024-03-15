import sys
from io import StringIO
import math

class InputReader:
    def __init__(self, input_string):
        self.input_string = input_string
        self.pointer = 0

    def next(self):
        while self.pointer < len(self.input_string) and not self.input_string[self.pointer].isalnum():
            self.pointer += 1
        start = self.pointer
        while self.pointer < len(self.input_string) and self.input_string[self.pointer].isalnum():
            self.pointer += 1
        return self.input_string[start:self.pointer]

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextString(self):
        return self.next()

    def nextDouble(self):
        return float(self.next())

    def nextIntArray(self, n):
        return [int(self.next()) for _ in range(n)]

    def nextIntArrayDec(self, n):
        return [int(self.next()) - 1 for _ in range(n)]

    def nextLongArray(self, n):
        return [int(self.next()) for _ in range(n)]

    def nextLongArrayDec(self, n):
        return [int(self.next()) - 1 for _ in range(n)]

class TaskX:

    def solve(self, testNumber, input_reader, output_stream):
        s = input_reader.nextString()
        n = len(s)
        ac = [0] * (n+1)
        bc = [0] * (n+1)
        cc = [0] * (n+1)
        xc = [0] * (n+1)
        for i in range(n):
            ac[i+1] = ac[i]
            bc[i+1] = bc[i]
            cc[i+1] = cc[i]
            xc[i+1] = xc[i]
            if s[i] == 'A':
                ac[i+1] += 1
            if s[i] == 'B':
                bc[i+1] += 1
            if s[i] == 'C':
                cc[i+1] += 1
            if s[i] == '?':
                xc[i+1] += 1

        ans = 0
        for i in range(n):
            if s[i] == 'B' or s[i] == '?':
                a = ac[i] - ac[0]
                l = xc[i] - xc[0]
                c = cc[n] - cc[i+1]
                r = xc[n] - xc[i+1]

                ans += self.power(3, l+r, MOD) * a % MOD * c % MOD
                ans += self.power(3, l+r-1, MOD) * a % MOD * r % MOD
                ans += self.power(3, l+r-1, MOD) * l % MOD * c % MOD
                ans += self.power(3, l+r-2, MOD) * l % MOD * r % MOD

        output_stream.write(str(ans % MOD) + '\n')

    def power(self, a, e, modp):
        ret = 1
        for _ in range(int(e)):
            if e % 2 != 0:
                ret = (ret * a) % modP
            a = (a * a) % modP
        return ret

MOD = 1000000007

def main(input_string):
    input_reader = InputReader(input_string)
    task = TaskX()
    task.solve(1, input_reader, sys.stdout)

# Input example to test the conversion
input_string = "??ACB??"
main(input_string)