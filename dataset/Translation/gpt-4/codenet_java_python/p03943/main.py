import sys

class FastScanner:
    def __init__(self):
        self.stream = sys.stdin
        self.buffer = ''
        self.offset = 0

    def read_to_buffer(self):
        self.buffer += self.stream.read(1024)

    def has_next_token(self):
        while len(self.buffer) <= self.offset:
            self.read_to_buffer()
            if not self.buffer:
                return False
        while self.buffer[self.offset].isspace():
            self.offset += 1
            if len(self.buffer) == self.offset:
                self.read_to_buffer()
                if not self.buffer:
                    return False                
        return True

    def next(self):
        if not self.has_next_token():
            raise ValueError('No more tokens available')
        start = self.offset
        while self.offset < len(self.buffer) and not self.buffer[self.offset].isspace():
            self.offset += 1
        token = self.buffer[start:self.offset]
        return token.strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

def main():
    scanner = FastScanner()
    a = scanner.next_int()
    b = scanner.next_int()
    c = scanner.next_int()

    i = (a + b == c)
    j = (a + c == b)
    k = (b + c == a)

    if i or j or k:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()