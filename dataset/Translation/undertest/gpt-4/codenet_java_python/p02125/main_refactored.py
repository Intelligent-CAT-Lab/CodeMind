class main:
    import io
    import sys
    
    class Scanner:
        
        def __init__(self):
            self.buffer = io.BytesIO()
            self.buffer.write(sys.stdin.buffer.read())
            self.buffer.seek(0)
    
        def next_int(self):
            return int(self.next_token())
        
        def next_long(self):
            return int(self.next_token())
        
        def next_token(self):
            while True:
                current_pos = self.buffer.tell()
                s = self.buffer.readline()
                if not s:
                    raise ValueError("No more input")
                token = s.strip().decode()
                if token:
                    return token
                self.buffer.seek(current_pos)
    
    def run():
        sc = Scanner()
        N = sc.next_int()
        if N == 1:
            print(1)
            return
        c = 1
        while 2 * c - 1 <= N:
            c *= 2
        c -= 1
        print(bin(c).count('1'))
    
    if __name__ == "__main__":
        run()