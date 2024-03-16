```python
import sys

class MScanner:
    def __init__(self, system):
        self.br = sys.stdin if system == sys.stdin else open(system, 'r')
        self.st = None

    def next(self):
        while self.st is None or not self.st.hasMoreTokens():
            self.st = self.br.readline().split()
        return self.st.pop(0)

    def takearr(self, n):
        in_arr = [int(self.next()) for _ in range(n)]
        return in_arr

    def takearrl(self, n):
        in_arr = [int(self.next()) for _ in range(n)]
        return in_arr

    def takearrobj(self, n):
        in_arr = [int(self.next()) for _ in range(n)]
        return in_arr

    def takearrlobj(self, n):
        in_arr = [int(self.next()) for _ in range(n)]
        return in_arr

    def nextLine(self):
        return self.br.readline()

    def nextInt(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextChar(self):
        return self.next()[0]

    def nextLong(self):
        return int(self.next())

    def ready(self):
        return self.br.isatty()

    def waitForInput(self):
        import time
        time.sleep(3)

if __name__ == "__main__":
    sc = MScanner(sys.stdin)
    days = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]
    in_day = sc.nextLine().strip()
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
```
```
