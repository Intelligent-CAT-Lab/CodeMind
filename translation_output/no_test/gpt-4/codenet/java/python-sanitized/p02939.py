import sys

class Scanner:
    def __init__(self):
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            self.tokenizer = sys.stdin.readline().strip().split()
        return self.tokenizer.pop(0)

scanner = Scanner()

def main():
    s = scanner.next()
    n = len(s)
    count = 0
    i = 0
    while i < n:
        count += 1
        if i + 1 >= n:
            break
        if s[i] == s[i + 1]:
            if i + 2 >= n:
                break
            i += 2
            count += 1
        i += 1
    print(count)

if __name__ == "__main__":
    main()