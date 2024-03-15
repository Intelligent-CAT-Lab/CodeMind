import sys

class Scanner:
    def __init__(self):
        self.st = []
    
    def next(self):
        while not self.st:
            line = sys.stdin.readline()
            if not line:
                return None
            self.st = line.split()
        return self.st.pop(0)
    
    def next_int(self):
        return int(self.next())
    
    def next_long(self):
        return long(self.next())
    
    def next_line(self):
        return sys.stdin.readline().strip()
    
    def next_double(self):
        x = self.next()
        neg = False
        if x[0] == '-':
            neg = True
            x = x[1:]
        res, idx, f = 0, x.find('.'), 1
        if idx != -1:
            res = int(x[:idx])
            x = x[idx+1:]
            while x:
                res = res * 10 + int(x[0])
                f *= 10
                x = x[1:]
        else:
            res = int(x)
        return res / f * (-1 if neg else 1)
    
    def ready(self):
        return sys.stdin.readable()

def main():
    s = Scanner()
    word = s.next()
    flag = False
    for i in range(len(word) - 1):
        if word[i] == word[i + 1]:
            flag = True
            break
    if flag:
        print("Bad")
    else:
        print("Good")

if __name__ == "__main__":
    main()