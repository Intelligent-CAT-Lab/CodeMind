import sys

def main():
    sc = MScanner(sys.stdin)
    pw = sys.stdout
    days = ["MON", "TUE", "WED", "THU", "FRI","SAT","SUN"]
    inp = sc.nextLine()
    idx = 0
    for i in range(len(days)):
        if days[i] == inp:
            idx = i
            break
    ans = ((6 - idx + 7) % 7)
    if ans == 0:
        pw.write(str(7) + '\n')
    else:
        pw.write(str(ans) + '\n')
    pw.flush()

class MScanner:
    def __init__(self, inp):
        self.inp = inp

    def next(self):
        return self.inp.readline().strip()

    def nextLine(self):
        return self.inp.readline().strip()

    def nextInt(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextChar(self):
        return self.next()[0]

    def nextLong(self):
        return long(self.next())

    def ready(self):
        return self.inp.ready()

    def waitForInput(self):
        time.sleep(3)

if __name__ == "__main__":
    main()