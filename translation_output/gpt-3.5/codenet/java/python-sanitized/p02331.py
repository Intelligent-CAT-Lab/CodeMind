import sys

class SC:
    def __init__(self, input_stream):
        self.reader = input_stream
        self.tokenizer = None
    
    def next(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = iter(input().split())
            except EOFError:
                return None
        return next(self.tokenizer)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        try:
            return input()
        except EOFError:
            return None

def pl(o):
    print(o)

def main():
    MOD = 1000000007
    sc = SC(sys.stdin)
    n = sc.nextLong()
    k = sc.nextLong()
    ans = 1
    for i in range(n):
        ans = (ans * k) % MOD
    pl(ans)

if __name__ == "__main__":
    main()