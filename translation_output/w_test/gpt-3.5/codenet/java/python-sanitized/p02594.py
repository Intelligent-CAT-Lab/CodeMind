import sys

class FastScanner:
    def __init__(self):
        self.input = sys.stdin.readline()
        self.current_token = 0
        self.tokens = self.input.split()
    
    def next(self):
        if self.current_token == len(self.tokens):
            self.tokens = sys.stdin.readline().split()
            self.current_token = 0
        result = self.tokens[self.current_token]
        self.current_token += 1
        return result
    
    def nextInt(self):
        return int(self.next())
    
    def readArray(self, n):
        a = []
        for _ in range(n):
            a.append(self.nextInt())
        return a
    
    def nextLong(self):
        return int(self.next())


def main():
    fs = FastScanner()
    x = fs.nextInt()
    if x >= 30:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()