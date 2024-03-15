import sys

class p03264:
    @staticmethod
    def main():
        sc = FScanner()
        
        n = sc.read_int()
        
        o = 0
        e = 0
        
        for i in range(1, n+1):
            if i % 2 == 1:
                o += 1
            else:
                e += 1
        
        print(o * e)
    
    @staticmethod
    def solve():
        pass  # empty method, no translation needed

    @staticmethod
    def disp(data):
        if all(isinstance(item, int) for item in data):
            print(' '.join(map(str, data)))
        elif all(isinstance(item, str) for item in data):
            print(' '.join(data))
        else:
            raise ValueError("Data must be a list of integers or strings.")
        print()

class FScanner:
    def __init__(self):
        self.sc = sys.stdin

    def has_next_line(self):
        return True if self.sc.readline() else False

    def read_int(self):
        return int(self.sc.readline().strip())

    def read_long(self):
        return int(self.sc.readline().strip())

    def read_int_list(self):
        return list(map(int, self.sc.readline().strip().split()))

    def read_string(self):
        return self.sc.readline().strip()
    
    def read_string_list(self, delim=' '):
        return self.sc.readline().strip().split(delim)

if __name__ == "__main__":
    p03264.main()