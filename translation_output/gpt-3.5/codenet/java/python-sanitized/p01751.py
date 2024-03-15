import sys

class Reader:
    def __init__(self, input_=sys.stdin):
        self.input = input_
        self.buf = input_.read().split()
        self.ptr = 0

    def hasNextByte(self):
        return self.ptr < len(self.buf)

    def readByte(self):
        if self.hasNextByte():
            val = self.buf[self.ptr]
            self.ptr += 1
            return int(val)
        else:
            return -1

    def nextInt(self):
        if self.hasNextByte():
            return int(self.buf[self.ptr])
        else:
            raise StopIteration()

    def close(self):
        try:
            self.input.close()
        except:
            sys.exit()

def main():
    sc = Reader()
    out = sys.stdout
    a = sc.nextInt()
    b = sc.nextInt()
    c = sc.nextInt()
    d = a + b
    e = -1
    for i in range(1000):
        if 0 <= (60*i+c) % d <= a:
            e = i
            break

    if e == -1:
        out.write("-1\n")
    else:
        out.write(str(60*e+c) + "\n")

    out.flush()
    sc.close()
    out.close()

if __name__ == "__main__":
    main()