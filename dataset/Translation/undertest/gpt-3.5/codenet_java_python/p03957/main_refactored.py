class main:
    import sys
    from io import BytesIO, IOBase
    
    class FastInput:
        def __init__(self, fd=sys.stdin.buffer):
            self.io = IOBase(fd)
            self.internal_buffer = BytesIO()
            self.read_pos = 0
            self.read_end = 0
    
        def read(self):
            while self.read_pos >= self.read_end:
                self.read_end = self.io.readinto(self.internal_buffer)
                self.read_pos = 0
                if self.read_end == 0:
                    return -1
            val = self.internal_buffer[self.read_pos]
            self.read_pos += 1
            return val
    
        def read_string(self):
            sb = bytearray()
            self.consume_blank()
            while 48 <= self.peek() <= 255:
                sb.append(self.read())
            return sb.decode()
    
        def consume_blank(self):
            while 0 <= self.peek() <= 32:
                self.read()
    
        def peek(self):
            if self.read_pos < self.read_end:
                return self.internal_buffer[self.read_pos]
            self.read_pos = 0
            self.read_end = self.io.readinto(self.internal_buffer)
            if self.read_end <= 0:
                return -1
            return self.internal_buffer[0]
    
    class FastOutput:
        def __init__(self, fd=sys.stdout.buffer):
            self.io = IOBase(fd)
            self.internal_buffer = BytesIO()
            self.print_str = b''
    
        def flush(self):
            self.io.write(self.internal_buffer.getvalue())
            self.io.flush()
            self.internal_buffer.seek(0)
            self.internal_buffer.truncate(0)
    
        def print(self, string):
            self.internal_buffer.write(string.encode('utf-8'))
    
        def println(self, string):
            self.print(string + '\n')
    
        def close(self):
            self.flush()
    
    class TaskA:
        def solve(self, input_obj, output_obj):
            s = input_obj.read_string()
            c_index = s.find('C')
            f_index = s.rfind('F')
            if c_index < 0 or f_index < 0 or f_index < c_index:
                output_obj.println("No")
            else:
                output_obj.println("Yes")
    
    def main():
        input_obj = FastInput()
        output_obj = FastOutput()
        solver = TaskA()
        solver.solve(input_obj, output_obj)
        output_obj.close()
    
    if __name__ == "__main__":
        main()