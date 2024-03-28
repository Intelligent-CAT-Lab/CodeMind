import sys

class Scanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray()
        self.pos = 0
        self.buffer_len = 0
        self.eof = False

    def read(self, n):
        while self.buffer_len < n and not self.eof:
            self.buffer += self.stream.read(1024)
            self.buffer_len = len(self.buffer)
            if self.buffer_len == 0:
                self.eof = True
        if self.eof and self.buffer_len == 0:
            return None
        else:
            data = self.buffer[self.pos:self.pos+n]
            self.pos += n
            return data

    def readline(self):
        data = []
        while True:
            c = self.read(1)
            if c == b'\n' or c == b'':
                break
            data.append(c)
        return b''.join(data)

    def next_int(self):
        data = self.readline()
        if data == None:
            return None
        return int(data)

    def next_long(self):
        data = self.readline()
        if data == None:
            return None
        return int(data)

    def close(self):
        self.stream.close()

def main():
    sc = Scanner(sys.stdin)
    x = sc.next_long()
    sc.close()

    ans = x // 11 * 2 + x % 11 // 7 + min(x % 11, 1)
    print(ans)

if __name__ == '__main__':
    main()