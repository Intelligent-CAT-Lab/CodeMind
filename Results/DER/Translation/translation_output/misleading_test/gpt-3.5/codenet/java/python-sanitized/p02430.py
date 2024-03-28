import sys

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray()
        self.pointer = 0

    def has_next_byte(self):
        if self.pointer < len(self.buffer):
            return True
        else:
            self.pointer = 0
            self.buffer = self.stream.read(1024)
            if len(self.buffer) <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte():
            result = self.buffer[self.pointer]
            self.pointer += 1
            return result
        return -1

    def is_printable(self, n):
        return 33 <= n <= 126

    def skip(self):
        while self.has_next_byte() and not self.is_printable(self.buffer[self.pointer]):
            self.pointer += 1

    def has_next(self):
        self.skip()
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise StopIteration
        result = bytearray()
        cur = self.read_byte()
        while self.is_printable(cur):
            result.append(cur)
            cur = self.read_byte()
        return result.decode()

    def next_int(self):
        return int(self.next())

    def close(self):
        try:
            self.stream.close()
        except Exception:
            pass

def solve(scanner, out):
    n = scanner.next_int()
    k = scanner.next_int()
    
    for bit in range(1 << n):
        if bin(bit).count('1') != k:
            continue
        out.write(f"{bit}:")
        for j in range(n):
            if (bit >> j) & 1 == 1:
                out.write(f" {j}")
        out.write("\n")

def main():
    scanner = FastScanner(sys.stdin.buffer)
    out = sys.stdout
    solve(scanner, out)
    scanner.close()
    out.close()

if __name__ == "__main__":
    main()