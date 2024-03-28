class main:
    class Scanner:
        def __init__(self):
            self.input = input()
            self.index = 0
    
        def next(self):
            if self.index >= len(self.input):
                return None
            start = self.index
            while self.index < len(self.input) and self.input[self.index] != ' ':
                self.index += 1
            return self.input[start:self.index]
    
    scanner = Scanner()
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