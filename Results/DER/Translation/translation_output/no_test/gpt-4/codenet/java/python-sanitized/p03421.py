import sys

class p03421:
    def __init__(self):
        self.output = []

    def run(self):
        scanner = Scanner(sys.stdin)
        n = scanner.next_int()
        a = scanner.next_int()
        b = scanner.next_int()
        self.calc(n, a, b)

    def calc(self, n, a, b):
        for i in range(n - a + 1, n + 1):
            self.output.append(str(i))

        rest = n - a - b + 1
        if rest < 0:
            print(-1)
            return
        elif rest >= 1:
            if not self.calc_inner(rest, a - 1, b - 1):
                print(-1)
                return
        
        for i in range(n - a, rest, -1):
            self.output.append(str(i))

        print(' '.join(self.output))

    def calc_inner(self, n, a, b):
        first = []
        second = []
        while True:
            if a <= 0 or b <= 0:
                return False
            
            first_i = max(n - a + 1, 1)
            for i in range(first_i, n + 1):
                first.append(str(i))
            
            rest = n - a - b + 1
            end_i = max(rest + 1, 1)
            sub_second = []
            for i in range(first_i - 1, end_i - 1, -1):
                sub_second.insert(0, str(i))
            
            second = sub_second + second
            if rest <= 0:
                self.output.extend(first)
                self.output.extend(second)
                return True
            else:
                n = rest
                a -= 1
                b -= 1

class Scanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = []
    
    def next_int(self):
        if not self.buffer:
            self.buffer = self.stream.readline().split()
        return int(self.buffer.pop(0))

if __name__ == '__main__':
    main = p03421()
    main.run()