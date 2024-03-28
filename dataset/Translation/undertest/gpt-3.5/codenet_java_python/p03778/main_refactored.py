class main:
    import sys
    
    class FastScanner:
        def __init__(self):
            self.buffer = ""
        
        def next(self):
            while not self.buffer:
                self.buffer = input().strip()
            result, self.buffer = self.buffer.split()[0], " ".join(self.buffer.split()[1:])
            return result
        
        def nextInt(self):
            return int(self.next())
    
    w, a, b = map(int, input().split())
    if a <= b and b <= a+w:
        print(0)
    elif a <= b+w and b+w <= a+w:
        print(0)
    elif a+w <= b:
        print(b-a-w)
    else:
        print(a-b-w)