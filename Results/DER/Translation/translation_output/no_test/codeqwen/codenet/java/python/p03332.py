Here is the Python version of the Java code:

```python
import sys

class StdIn:
    def __init__(self):
        self.buffer = sys.stdin.read()
        self.buffer_pointer = 0
        self.bytes_read = len(self.buffer)

    def next(self):
        while self.buffer_pointer < self.bytes_read and (self.buffer[self.buffer_pointer] == ' ' or self.buffer[self.buffer_pointer] == '\n' or self.buffer[self.buffer_pointer] == '\r'):
            self.buffer_pointer += 1
        start = self.buffer_pointer
        while self.buffer_pointer < self.bytes_read and self.buffer[self.buffer_pointer] != ' ' and self.buffer[self.buffer_pointer] != '\n' and self.buffer[self.buffer_pointer] != '\r':
            self.buffer_pointer += 1
        return self.buffer[start:self.buffer_pointer]

    def next_line(self):
        while self.buffer_pointer < self.bytes_read and (self.buffer[self.buffer_pointer] == ' ' or self.buffer[self.buffer_pointer] == '\n' or self.buffer[self.buffer_pointer] == '\r'):
            self.buffer_pointer += 1
        start = self.buffer_pointer
        while self.buffer_pointer < self.bytes_read and self.buffer[self.buffer_pointer] != '\n' and self.buffer[self.buffer_pointer] != '\r':
            self.buffer_pointer += 1
        return self.buffer[start:self.buffer_pointer]

    def next_int(self):
        ret = 0
        c = self.buffer[self.buffer_pointer]
        while c <= ' ':
            c = self.buffer[self.buffer_pointer]
            self.buffer_pointer += 1
        neg = (c == '-')
        if neg:
            c = self.buffer[self.buffer_pointer]
            self.buffer_pointer += 1
        while c >= '0' and c <= '9':
            ret = ret
