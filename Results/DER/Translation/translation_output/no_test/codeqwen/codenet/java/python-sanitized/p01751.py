import sys

class Reader:
    def __init__(self):
        self.inp = sys.stdin.readline

    def nextInt(self):
        return int(self.inp().strip())

    def nextLine(self):
        return self.inp().strip()

    def close(self):
        sys.stdin.close()

sc = Reader()
out = sys.stdout

a = sc.nextInt()
b = sc.nextInt()
c = sc.nextInt()
d = a + b
e = -1

for i in range(1000):
    if 0 <= (60 * i + c) % d and (60 * i + c) % d <= a:
        e = i
        break

if e == -1:
    out.write(str(-1) + '\n')
else:
    out.write(str(60 * e + c) + '\n')

out.flush()
sc.close()