import sys
import io

class Scanner:
    def __init__(self, stream=sys.stdin):
        self.stream = stream
        self.current_line = []

    def next(self):
        if not self.current_line:
            self.current_line = self.stream.readline().strip().split()
        return self.current_line.pop(0)

    def next_int(self):
        return int(self.next())

    def next_line(self):
        line = ' '.join(self.current_line) if self.current_line else ''
        self.current_line = []
        return line or self.stream.readline().strip()

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())
    
    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_double_array(self, n):
        return [self.next_double() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

    def next_char_array(self, n):
        return list(self.next_line().replace(' ', '').strip())

    def next_string_array(self, n):
        return [self.next() for _ in range(n)]


def main():
    in_scanner = Scanner()
    out = io.StringIO()

    a = in_scanner.next_int()
    b = in_scanner.next_int()
    c = in_scanner.next_int()
    x = in_scanner.next_int()
    y = in_scanner.next_int()

    if a + b < 2 * c:
        out.write(f"{x * a + y * b}\n")
    else:
        min_value = min(x, y)
        max_value = max(x, y)
        res = 0
        res += 2 * c * min_value
        if max_value == x:
            res += min(a, 2 * c) * (max_value - min_value)
        else:
            res += min(b, 2 * c) * (max_value - min_value)
        out.write(f"{res}\n")

    sys.stdout.write(out.getvalue())
    out.close()


if __name__ == "__main__":
    main()