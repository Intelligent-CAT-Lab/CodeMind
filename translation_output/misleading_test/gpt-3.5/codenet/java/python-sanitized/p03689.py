import sys

def nextInt():
    return int(next(in_stream).strip())

def next():
    return next(in_stream)

def isSpaceChar(c):
    return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1


in_stream = sys.stdin
out_stream = sys.stdout

r, c, h, w = map(int, next().split())

if r % h == 0 and c % w == 0:
    out_stream.write("No\n")
    out_stream.flush()
    sys.exit()

mcnt = (r // h) * (c // w)
space = r * c - ((r // h) * h) * ((c // w) * w)

plusNumber = ((mcnt + space) // space) + 1
minusNumber = -(plusNumber * (h * w - 1) + 1)

out_stream.write("Yes\n")
for i in range(r):
    for j in range(c):
        num = minusNumber if (i+1) % h == 0 and (j+1) % w == 0 else plusNumber
        if j >= 1:
            out_stream.write(' ')
        out_stream.write(str(num))
    out_stream.write('\n')
out_stream.flush()