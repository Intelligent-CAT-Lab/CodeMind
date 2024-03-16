from collections import deque

class P03212:
    
    def __init__(self):
        self.queue = deque()
        self.set = set()
        self.count = 0
        self.ch = ['3', '5', '7']
        
    def main(self):
        N = int(input())
        self.queue.extend(["357", "375", "537", "573", "735", "753"])
        
        if N < 1000:
            for s in self.queue:
                if int(s) <= N:
                    self.count += 1
            print(self.count)
            return
        
        while self.queue:
            s = self.queue.popleft()
            if int(s) <= N:
                self.count += 1
                for i in range(len(s)+1):
                    for j in range(len(self.ch)):
                        temp = self.add_char(s, i, self.ch[j])
                        if temp not in self.set:
                            self.set.add(temp)
                            self.queue.append(temp)
        
        print(self.count)
    
    def add_char(self, s, location, c):
        sb = []
        sb.append(s[:location])
        sb.append(c)
        if location < len(s):
            sb.append(s[location:])
        
        return ''.join(sb)

p = P03212()
p.main()