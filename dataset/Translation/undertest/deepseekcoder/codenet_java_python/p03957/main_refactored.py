class main:
    import sys
    
    class FastInput:
        def __init__(self, is_):
            self.is_ = is_
            self.buf = bytearray(1 << 13)
            self.buf_len = 0
            self.buf_offset = 0
            self.next = 0
    
        def read(self):
            if self.buf_len == self.buf_offset:
                self.buf_offset = 0
                self.buf_len = self.is_.readinto(self.buf)
                if self.buf_len == -1:
                    return -1
            return self.buf[self.buf_offset := self.buf_offset + 1]
    
        def skip_blank(self):
            while self.next >= 0 and self.next <= 32:
                self.next = self.read()
    
        def read_string(self, builder):
            self.skip_blank()
            while self.next > 32:
                builder.append(chr(self.next))
                self.next = self.read()
            return builder.toString()
    
        def read_string(self):
            return self.read_string(StringBuilder())
    
    
    class FastOutput:
        def __init__(self, os):
            self.os = os
            self.cache = StringBuilder(1 << 20)
    
        def println(self, c):
            self.cache.append(c).append('\n')
            return self
    
        def flush(self):
            self.os.write(str(self.cache))
            self.cache.clear()
            return self
    
        def close(self):
            self.flush()
            self.os.close()
    
    
    class TaskA:
        def solve(self, test_number, in_, out):
            s = in_.read_string()
            c_index = s.find('C')
            f_index = s.rfind('F')
            if c_index < 0 or f_index < 0 or f_index < c_index:
                out.println("No")
            else:
                out.println("Yes")
    
    
    class TaskAdapter(Runnable):
        def run(self):
            in_ = FastInput(sys.stdin)
            out = FastOutput(sys.stdout)
            solver = TaskA()
            solver.solve(1, in_, out)
            out.close()
    
    
    Thread(target=TaskAdapter(), name="daltao", daemon=True).start().join()