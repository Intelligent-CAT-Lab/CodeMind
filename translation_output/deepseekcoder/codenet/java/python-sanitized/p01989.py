import sys

def solve(inp, out, ms):
    s = inp.next()
    length = len(s)
    ans = 0

    for i in range(1, length-2):
        for j in range(i+1, length-1):
            for k in range(j+1, length):
                a = [s[0:i], s[i:j], s[j:k], s[k:length]]

                for x in range(4):
                    if len(a[x]) != len(str(int(a[x]))):
                        continue

                b = [int(a[0]), int(a[1]), int(a[2]), int(a[3])]
                if b[0]<=255 and b[1]<=255 and b[2]<=255 and b[3]<=255:
                    ans += 1

    out.write(str(ans))


class FastScanner:
    def __init__(self, stream):
        self.stream = stream

    def hasNext(self):
        self.stream.seek(self.stream.tell())
        return self.stream.read(1) != ''