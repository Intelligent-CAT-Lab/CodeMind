import sys

class FastReader:
    def __init__(self):
        self.buffer = ""
        self.buffer_size = 1024
        self.file = sys.stdin

    def readline(self):
        while True:
            if "\n" in self.buffer:
                pos = self.buffer.find("\n")
                line = self.buffer[:pos]
                self.buffer = self.buffer[pos+1:]
                return line
            else:
                new_buffer = self.file.read(self.buffer_size)
                if not new_buffer:
                    if self.buffer:
                        return self.buffer
                    else:
                        return None
                self.buffer += new_buffer

    def read(self):
        line = self.readline()
        if line:
            return line
        else:
            return None

    def readint(self):
        return int(self.read())

    def readlong(self):
        return long(self.read())

    def readfloat(self):
        return float(self.read())

class p03280:
    def __init__(self):
        self.sc = FastReader()
        self.out = sys.stdout

    def main(self):
        k = self.sc.readint()-1
        b = self.sc.readint()-1

        self.out.write(str(k*b))
        self.out.flush()

if __name__ == '__main__':
    p03280().main()