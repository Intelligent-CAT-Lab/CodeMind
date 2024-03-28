import sys

class Reader:
    def __init__(self):
        self.reader = sys.stdin
        self.tokenizer = iter([])

    def next(self):
        while not self.tokenizer:
            self.tokenizer = iter(next(self.reader).split())
        return next(self.tokenizer)

    def next_int(self):
        return int(self.next())
    
    def next_double(self):
        return float(self.next())
    
    def next_long(self):
        return int(self.next())
    
    def next_line(self):
        return next(self.reader)
    
    def close(self):
        self.reader.close()

class PrintWriter:
    def __init__(self):
        self.output = []

    def print(self, data):
        self.output.append(str(data))

    def println(self, data):
        self.output.append(str(data) + '\n')

    def pprint(self):
        print(''.join(self.output))

in_ = Reader()
out = PrintWriter()

def main():
    S = in_.next()
    if S[0] == S[1] == S[2]:
        out.println("No")
    else:
        out.println("Yes")
        
    in_.close()

if __name__ == "__main__":
    main()
    out.pprint()