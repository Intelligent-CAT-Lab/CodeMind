import sys
import math

class FastReader:
    def __init__(self):
        self.reader = sys.stdin
        self.st = None
    
    def next_line(self):
        try:
            return next(self.reader)
        except StopIteration:
            return None
    
    def next_int(self):
        return int(self.next())
    
    def next_long(self):
        return int(self.next())  # Python's int type can handle long values
    
    def next_double(self):
        return float(self.next())
    
    def next(self):
        while self.st is None or len(self.st) == 0:
            line = self.next_line()
            if line:
                self.st = line.split()
            else:
                return None
        return self.st.pop(0)


def main():
    reader = FastReader()
    sum_value = 0
    h = reader.next_long()
    if h == 1:
        print(1)
    else:
        count = 1
        while h > 1:
            h = h // 2
            sum_value += int(math.pow(2, count))
            count += 1
        print(sum_value + 1)


if __name__ == "__main__":
    main()