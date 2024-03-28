import sys
import os

MOD = 1_000_000_007
MAX = 2_147_483_646

class P03327:
    def __init__(self):
        self.input_stream = sys.stdin
        self.buffer = []
        self.buffer_idx = 0
    
    def has_next(self):
        if self.buffer_idx < len(self.buffer):
            return True
        else:
            self.buffer_idx = 0
            self.buffer = os.read(0, 1024).split()
            return len(self.buffer) > 0
    
    def next_int(self):
        if not self.has_next():
            raise StopIteration
        val = int(self.buffer[self.buffer_idx])
        self.buffer_idx += 1
        return val
    
    def next_long(self):
        return self.next_int()
    
def main():
    problem = P03327()
    n = problem.next_int()
    if n < 1000:
        print("ABC")
    else:
        print("ABD")
        
    sys.stdout.close()

if __name__ == "__main__":
    main()