import sys
import threading

def main():
    thread = threading.Thread(target=taskadapter)
    thread.start()
    thread.join()

def taskadapter():
    # In Python, sys.stdin and sys.stdout already provide file-like objects for IO
    inp = FastInput()
    out = FastOutput()
    solver = TaskA()
    solver.solve(1, inp, out)
    out.close()

class TaskA:
    def solve(self, testNumber, inp, out):
        s = inp.read_string()
        # Python's str.find() returns -1 if not found, which is similar to indexOf in Java.
        c_index = s.find('C')
        f_index = s.rfind('F')  # Equivalent of lastIndexOf in Java
        if c_index == -1 or f_index == -1 or f_index < c_index:
            out.println("No")
        else:
            out.println("Yes")

class FastInput:
    def __init__(self):
        self._fileobj = sys.stdin.buffer  # Binary I/O

    def read(self):
        # In Python, sys.stdin.read() is used to read from stdin
        return self._fileobj.read(1)

    def skip_blank(self):
        ch = self.read()
        while ch and ch in b' \t\r\n':
            ch = self.read()
        return ch

    def read_string(self):
        # Use the skip_blank method to ignore initial whitespace
        ch = self.skip_blank()
        builder = []
        while ch and ch not in b' \t\r\n':
            builder.append(ch.decode('utf-8'))
            ch = self.read()
        return ''.join(builder)

class FastOutput:
    def __init__(self):
        self.cache = []

    def println(self, text):
        self.cache.append(text + '\n')
        return self

    def flush(self):
        sys.stdout.write(''.join(self.cache))
        self.cache.clear()
        sys.stdout.flush()

    def close(self):
        self.flush()

if __name__ == "__main__":
    main()