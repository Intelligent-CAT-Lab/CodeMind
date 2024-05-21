import sys

class Scanner:
    def __init__(self):
        self.buffer = sys.stdin.readline().strip()
        self.index = 0

    def next_int(self):
        while self.index < len(self.buffer) and not self.buffer[self.index].isdigit():
            self.index += 1
        if self.index == len(self.buffer):
            return None
        number = 0
        while self.index < len(self.buffer) and self.buffer[self.index].isdigit():
            number = number * 10 + int(self.buffer[self.index])
            self.index += 1
        return number

    def next_line(self):
        if self.index < len(self.buffer):
            line = self.buffer[self.index:]
            self.index = len(self.buffer)
            return line
        else:
            return None

def put(object):
    print(object)

def main():
    scanner = Scanner()
    x = scanner.next_int()
    y = scanner.next_int()
    put(x + y // 2)

if __name__ == "__main__":
    main()