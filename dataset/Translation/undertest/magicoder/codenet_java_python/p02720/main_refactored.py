class main:
    class FasterScanner:
        def __init__(self, is_):
            self.is_ = is_
            self.buf = bytearray(1024)
            self.cur_char = 0
            self.num_chars = 0
    
        def read(self):
            if self.num_chars == -1:
                raise ValueError("InputMismatchException")
            if self.cur_char >= self.num_chars:
                self.cur_char = 0
                try:
                    self.num_chars = self.is_.readinto(self.buf)
                except IOError:
                    raise ValueError("InputMismatchException")
                if self.num_chars <= 0:
                    return -1
            return self.buf[self.cur_char]
    
        def next_line(self):
            c = self.read()
            while self.is_space_char(c):
                c = self.read()
            res = []
            while not self.is_end_of_line(c):
                res.append(chr(c))
                c = self.read()
            return ''.join(res)
    
        def next_string(self):
            c = self.read()
            while self.is_space_char(c):
                c = self.read()
            res = []
            while not self.is_space_char(c):
                res.append(chr(c))
                c = self.read()
            return ''.join(res)
    
        def next_long(self):
            c = self.read()
            while self.is_space_char(c):
                c = self.read()
            sgn = 1
            if c == ord('-'):
                sgn = -1
                c = self.read()
            res = 0
            while not self.is_space_char(c):
                if c < ord('0') or c > ord('9'):
                    raise ValueError("InputMismatchException")
                res *= 10
                res += c - ord('0')
                c = self.read()
            return res * sgn
    
        def next_int(self):
            c = self.read()
            while self.is_space_char(c):
                c = self.read()
            sgn = 1
            if c == ord('-'):
                sgn = -1
                c = self.read()
            res = 0
            while not self.is_space_char(c):
                if c < ord('0') or c > ord('9'):
                    raise ValueError("InputMismatchException")
                res *= 10
                res += c - ord('0')
                c = self.read()
            return res * sgn
    
        def is_space_char(self, c):
            return c == ord(' ') or c == ord('\n') or c == ord('\r') or c == ord('\t') or c == -1
    
        def is_end_of_line(self, c):
            return c == ord('\n') or c == ord('\r') or c == -1
    
        def close(self):
            try:
                self.is_.close()
            except IOError as e:
                print(e)
    
    
    def main():
        sc = FasterScanner(sys.stdin)
        k = sc.next_int()