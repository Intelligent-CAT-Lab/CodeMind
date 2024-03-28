class main:
    import sys
    from io import BytesIO
    import os
    
    # Fast scanner to emulate input reading behavior (optional for Python; you can use input())
    class FastScanner:
        def __init__(self):
            self.stdin = sys.stdin.buffer
            self.buffer = BytesIO()
            self.ptr = 0
    
        def read(self):
            self.buffer.seek(0)
            data = self.buffer.read()
            if not data:
                data = self.stdin.read(1024)
            self.buffer = BytesIO(data)
            return data
    
        def readline(self):
            while True:
                line = self.buffer.readline()
                if line:
                    return line.decode('ascii').rstrip()
                else:
                    self.read()
    
        def next_int(self):
            return int(self.readline())
    
    
    def print_numbers_missing_from_sum(N):
        table = [0] * (N + 1)
        table[0] = 0
        M = 0
        for i in range(1, N + 1):
            table[i] = table[i - 1] + i
            if table[i] >= N:
                M = i
                break
        
        s = set(range(1, M + 1))
        s.remove(table[M] - N)
        for a in s:
            print(a)
    
    
    def main():
        if os.isatty(sys.stdin.fileno()):  # Check if input comes from terminal/console
            sc = FastScanner()
            N = sc.next_int()
        else:  # Simpler input reading, such as file or redirect
            N = int(input().strip())
        print_numbers_missing_from_sum(N)
    
    
    if __name__ == '__main__':
        main()