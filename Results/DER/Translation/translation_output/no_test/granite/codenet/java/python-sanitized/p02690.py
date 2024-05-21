import math

class FastScanner:
    def __init__(self):
        self.st = None
        self.reader = None

    def next(self):
        if self.st is None or not self.st.hasMoreElements():
            self.st = StringTokenizer(self.reader.readLine())
        return self.st.nextToken()

    def next_line(self):
        self.st = None
        read_line = None
        read_line = self.reader.readLine()
        return read_line

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_int_arr(self, n):
        ret_arr = []
        for i in range(n):
            ret_arr.append(self.next_int())
        return ret_arr

    def next_long_arr(self, n):
        ret_arr = []
        for i in range(n):
            ret_arr.append(self.next_long())
        return ret_arr

    def close(self):
        self.reader.close()

def pow(base, n):
    retVal = 1
    while n > 0:
        if (n & 1) == 1:
            retVal *= base
        n >>= 1
        base *= base
    return retVal

def main():
    fs = FastScanner()
    x = fs.next_int()

    pow_map = {0: 0, 1: 1}
    before_pow = 1
    base = 2
    while True:
        pow_val = pow(base, 5)
        pow_map[pow_val] = base
        if pow_val - before_pow > x:
            break
        base += 1
        before_pow = pow_val

    for pow_val, base in pow_map.items():
        diff = abs(x - pow_val)
        if diff in pow_map:
            print(base, end=' ')
            if pow_val - x < 0:
                print('-', end=' ')
            print(pow_map[diff])
            fs.close()
            return

if __name__ == '__main__':
    main()