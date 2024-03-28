class main:
    import sys
    
    
    class MScanner:
        def __init__(self, system):
            self.br = system
            self.st = None
    
        def next(self):
            while self.st is None or not self.st.hasMoreTokens():
                self.st = self.br.readline().split()
            return self.st.pop(0)
    
        def nextInt(self):
            return int(self.next())
    
        def nextLong(self):
            return int(self.next())
    
        def nextLine(self):
            return self.br.readline().strip()
    
    
    days = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]
    
    scanner = MScanner(sys.stdin)
    in_day = scanner.nextLine()
    idx = 0
    for i in range(len(days)):
        if days[i] == in_day:
            idx = i
            break
    
    ans = ((6 - idx + 7) % 7)
    if ans == 0:
        print(7)
    else:
        print(ans)