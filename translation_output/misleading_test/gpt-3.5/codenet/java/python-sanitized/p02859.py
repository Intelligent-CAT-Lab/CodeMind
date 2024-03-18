class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray()
        self.cur_char = 0
        self.num_chars = 0

    def read(self):
        if self.num_chars == -1:
            raise ValueError("InputMismatchException")
        
        if self.cur_char >= self.num_chars:
            self.cur_char = 0
            try:
                self.num_chars = self.stream.readinto(self.buf)
            except IOError as e:
                raise ValueError("InputMismatchException")
            if self.num_chars <= 0:
                return -1
        return self.buf[self.cur_char]
    
    def next_int(self):
        c = self.read()
        while c != -1 and chr(c).isspace():
            c = self.read()
        
        sign = 1
        if c == ord('-'):
            sign = -1
            c = self.read()
        
        res = 0
        while c != -1 and chr(c).isdigit():
            res = 10 * res + c - ord('0')
            c = self.read()
        
        return res * sign

class OutputWriter:
    def __init__(self, output_stream):
        self.writer = output_stream
    
    def close(self):
        self.writer.close()
    
    def println(self, i):
        self.writer.write(str(i) + '\n')

def solve(r):
    return r * r

if __name__ == "__main__":
    import sys
    inputStream = sys.stdin
    outputStream = sys.stdout
    in_reader = InputReader(inputStream)
    out_writer = OutputWriter(outputStream)
    
    r = in_reader.next_int()
    result = solve(r)
    
    out_writer.println(result)
    out_writer.close()