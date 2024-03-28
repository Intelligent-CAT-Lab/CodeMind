import sys

class FastReader:
    def __init__(self):
        self.input = sys.stdin.readline

    def next(self):
        return self.input().strip()

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

def main():
    fr = FastReader()
    n, m = map(int, input().split())
    output = []
    
    for i in range(0, m - (n % m)):
        output.append(str(n // m))
    
    for i in range(m - (n % m), m):
        output.append(str(-(-n // m)))  # Equivalent to ceil(n / m)
    
    print(" ".join(output))

if __name__ == "__main__":
    main()