import sys

class FastScanner:
    def __init__(self):
        self.buffer = ""
        self.position = 0
    
    def next_token(self):
        while True:
            if self.position >= len(self.buffer):
                self.buffer = sys.stdin.readline()
                if not self.buffer:
                    return None
                self.position = 0
            while self.position < len(self.buffer) and self.buffer[self.position].isspace():
                self.position += 1
            if self.position < len(self.buffer):
                start_pos = self.position
                while self.position < len(self.buffer) and not self.buffer[self.position].isspace():
                    self.position += 1
                return self.buffer[start_pos:self.position]

    def next_int(self):
        token = self.next_token()
        if token is None:
            raise ValueError("No more input")
        return int(token)

def main():
    fsc = FastScanner()
    w = fsc.next_int()
    a = fsc.next_int()
    b = fsc.next_int()
    if a <= b and b <= a + w:
        print(0)
    elif a <= b + w and b + w <= a + w:
        print(0)
    elif a + w <= b:
        print(b - a - w)
    else:
        print(a - b - w)

if __name__ == "__main__":
    main()