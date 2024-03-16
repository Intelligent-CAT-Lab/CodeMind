class BufferedReader:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            self.tokenizer = input().split()
        return self.tokenizer.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return input()

def p02331():
    sc = BufferedReader(sys.stdin)
    MOD = 1000000007
    n = sc.next_long()
    k = sc.next_long()
    ans = 1
    for i in range(n):
        ans = (ans * k) % MOD
    pl(ans)

def pl(o=''):
    print(o)

def p(o):
    print(o, end='')

# Assuming that you will run this code in an environment where sys.stdin is available
# for example, in a command-line interface.
if __name__ == '__main__':
    import sys
    p02331()