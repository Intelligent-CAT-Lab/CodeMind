class main:
    import sys
    
    class InputReader:
        def __init__(self, input_stream = sys.stdin):
            self.stream = input_stream
    
        def read(self):
            return self.stream.read(1)
    
        def next_int(self):
            return int(self.stream.readline())
    
    class OutputWriter:
        def __init__(self, output_stream = sys.stdout):
            self.writer = output_stream
    
        def println(self, i):
            self.writer.write(str(i) + '\n')
    
        def close(self):
            self.writer.close()
    
    class TaskA:
        def solve(self, in_reader, out_writer):
            a = in_reader.next_int()
            b = in_reader.next_int()
            out_writer.println(max(a + b, a - b, a * b))
    
    def main():
        in_reader = InputReader()
        out_writer = OutputWriter()
        solver = TaskA()
        solver.solve(in_reader, out_writer)
        out_writer.close()
    
    if __name__ == "__main__":
        main()