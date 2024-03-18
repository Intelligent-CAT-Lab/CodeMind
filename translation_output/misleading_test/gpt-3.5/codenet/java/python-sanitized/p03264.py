import sys

class FScanner:
    def __init__(self):
        self.sc = sys.stdin
    def read_int(self):
        i = int(self.sc.readline())
        return i

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

if __name__ == "__main__":
    main()