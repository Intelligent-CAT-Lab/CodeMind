class main:
    import sys
    
    class Solver:
        def __init__(self, reader, writer):
            self.reader = reader
            self.writer = writer
    
        def run(self):
            a = self.reader.next_long()
            b = self.reader.next_long()
            c = self.reader.next_long()
            d = c - a - b
            if d > 0 and 4 * a * b < d * d:
                self.writer.println("Yes")
            else:
                self.writer.println("No")
    
    class Reader:
        def __init__(self, stream):
            self.stream = stream
            self.buffer = ""
    
        def next_int(self):
            while True:
                if self.buffer == "":
                    self.buffer = self.stream.readline().strip()
                if self.buffer == "":
                    return None
                if self.buffer.find(" ") == -1:
                    break
                self.buffer = self.buffer[self.buffer.find(" ") + 1:]
            ret = int(self.buffer)
            self.buffer = ""
            return ret
    
        def next_long(self):
            while True:
                if self.buffer == "":
                    self.buffer = self.stream.readline().strip()
                if self.buffer == "":
                    return None
                if self.buffer.find(" ") == -1:
                    break
                self.buffer = self.buffer[self.buffer.find(" ") + 1:]
            ret = long(self.buffer)
            self.buffer = ""
            return ret
    
        def next_string(self):
            while True:
                if self.buffer == "":
                    self.buffer = self.stream.readline().strip()
                if self.buffer == "":
                    return None
                if self.buffer.find(" ") == -1:
                    break
                self.buffer = self.buffer[self.buffer.find(" ") + 1:]
            ret = self.buffer
            self.buffer = ""
            return ret
    
    class Writer:
        def __init__(self, stream):
            self.stream = stream
    
        def println(self, s):
            self.stream.write(s + "\n")
            self.stream.flush()
    
    def main():
        reader = Reader(sys.stdin)
        writer = Writer(sys.stdout)
        solver = Solver(reader, writer)
        solver.run()
    
    if __name__ == "__main__":
        main()