import sys
from collections import deque

mod = 1000000007

def main():
    reader = Reader(sys.stdin)
    out = sys.stdout

    # int n=sc.nextInt();
    # char c[]=sc.nextString().toCharArray();
    # int l=c.length;

    c = list(reader.next_string())
    l = len(c)

    if c[0]=='0' or c[l-1]=='1':
        out.write(str(-1)+'\n')
        return
    else:
        for i in range(l//2):
            if c[i]!=c[l-i-2]:
                out.write(str(-1)+'\n')
                return

    out.write('1 2\n')

    for i in range(3, l+1):
        out.write(str(i-1)+' '+str(i)+'\n')
        if c[i-2]=='1':
            pass

    out.flush()

class Reader:
    def __init__(self, inp):
        self.x = inp
        self.st = None

    def next_string(self):
        while True:
            line = self.x.readline()
            if line:
                return line.strip()

    def next_int(self):
        return int(self.next_string())

    def next_long(self):
        return long(self.next_string())

    def next_double(self):
        return float(self.next_string())

if __name__ == "__main__":
    main()