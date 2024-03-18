import sys

class Scanner:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.tokenizer = None
    
    def next(self):
        while self.tokenizer is None or not self.tokenizer.has_more_tokens():
            self.tokenizer = iter(input().split())
        return next(self.tokenizer)
    
    def next_int(self):
        return int(self.next())

def main():
    scanner = Scanner(sys.stdin)
    n = scanner.next_int()
    x = scanner.next_int() - 1
    y = scanner.next_int() - 1
    edges = [0] * n
    
    for i in range(n):
        for j in range(i+1, n):
            edge = min(j - i, min(abs(x - i) + abs(j - y), abs(y - i) + abs(j - x)) + 1)
            edges[edge] += 1
    
    for i in range(1, n):
        print(edges[i])

if __name__ == "__main__":
    main()