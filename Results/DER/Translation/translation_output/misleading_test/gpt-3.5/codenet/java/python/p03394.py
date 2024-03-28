```python
import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream

    def is_whitespace(self, c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

    def read(self):
        num_chars = self.stream.read(1024)
        for char in num_chars:
            yield char

    def next_int(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.read()
        res = 0
        while c.isdigit():
            res *= 10
            res += int(c)
            c = self.read()
        return res * sgn

class OutputWriter:
    def __init__(self, writer):
        self.writer = writer

    def print_val(self, *objects):
        for i in range(len(objects)):
            if i != 0:
                self.writer.write(' ')
            self.writer.write(str(objects[i]))
        self.writer.write('\n')

if __name__ == "__main__":
    input_reader = InputReader(sys.stdin)
    output_writer = OutputWriter(sys.stdout)
    
    n = input_reader.next_int()
    
    if n == 3:
        output_writer.print_val(2, 5, 63)
    elif n == 4:
        output_writer.print_val(2, 5, 20, 63)
    else:
        ans = []
        _2 = 0
        _3 = 0
        _23 = 0
        i = 2
        while len(ans) < n - 2:
            num = i
            if num % 2 == 0 and num % 3 == 0:
                _23 += 1
            elif num % 2 == 0:
                _2 += num
            elif num % 3 == 0:
                _3 += num
            
            if num % 2 == 0 or num % 3 == 0:
                ans.append(num)
            i += 1
        
        k = i
        sn = -1
        while True:
            num = i
            if num % 2 == 0 and (_2 % 3 == 0 or num % 3 != 0) and (_2 + num) % 3 == 0:
                sn = num
                ans.append(num)
                break
            i += 1
        
        i = k
        while True:
            num = i
            if num % 3 == 0 and (_3 % 2 == 0 or num % 2 != 0) and num != sn and (_3 + num) % 2 == 0:
                ans.append(num)
                break
            i += 1
        
        for val in ans:
            output_writer.print_val(val)
```
