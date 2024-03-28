import sys

class MScanner:
    def __init__(self, system):
        self.br = sys.stdin

    def next(self):
        return self.br.readline().strip()

    def takearr(self, n):
        in = []
        for i in range(n):
            in.append(self.nextInt())
        return in

    def takearrl(self, n):
        in = []
        for i in range(n):
            in.append(self.nextLong())
        return in

    def takearrobj(self, n):
        in = []
        for i in range(n):
            in.append(self.nextInt())
        return in

    def takearrlobj(self, n):
        in = []
        for i in range(n):
            in.append(self.nextLong())
        return in

    def nextLine(self):
        return self.br.readline().strip()

    def nextInt(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextChar(self):
        return self.next()[0]

    def nextLong(self):
        return int(self.next())

    def ready(self):
        return self.br.ready()

    def waitForInput(self):
        time.sleep(3)

def main():
    sc = MScanner(sys.stdin)
    pw = sys.stdout
    days = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]
    in = sc.nextLine()
    idx = 0
    for i in range(len(days)):
        if days[i] == in:
            idx = i
            break
    ans = ((6 - idx + 7) % 7)
    if ans == 0:
        pw.write("7\n")
    else:
        pw.write(str(ans) + "\n")
    pw.flush()

if __name__ == "__main__":
    main()