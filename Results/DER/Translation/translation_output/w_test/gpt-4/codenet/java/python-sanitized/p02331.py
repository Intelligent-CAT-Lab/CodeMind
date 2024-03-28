class SC:
    def __init__(self):
        self.tokens = []
        self.current_index = 0

    def next(self):
        while not self.tokens:
            self.tokens = input().split(' ')
        token = self.tokens[self.current_index]
        self.current_index += 1
        if self.current_index >= len(self.tokens):
            self.tokens = []
            self.current_index = 0
        return token

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())  # In Python, there's no distinct type for long integers like in Java.

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return input()

def main():
    sc = SC()
    MOD = 1000000007
    n = sc.next_long()
    k = sc.next_long()
    ans = 1
    for i in range(n):  # In Python, range generates a sequence of integers
        ans = (ans * k) % MOD
    print(ans)

if __name__ == '__main__':
    main()