import sys

def readline():
    global buf
    buf = sys.stdin.readline().split()
    bufidx = 0

def s():
    global buf
    readline()
    return buf[bufidx]

def i():
    global buf
    readline()
    return int(s())

def l():
    global buf
    readline()
    return long(s())

def d():
    global buf
    readline()
    return float(s())

def sa():
    global buf
    readline()
    if bufidx != 0:
        raise ValueError("illegal read")
    bufidx = -1
    return buf

def ia():
    global buf
    sa()
    if bufidx != 0:
        raise ValueError("illegal read")
    bufidx = -1
    return [int(s()) for s in sa()]

def la():
    global buf
    sa()
    if bufidx != 0:
        raise ValueError("illegal read")
    bufidx = -1
    return [long(s()) for s in sa()]

def da():
    global buf
    sa()
    if bufidx != 0:
        raise ValueError("illegal read")
    bufidx = -1
    return [float(s()) for s in sa()]

def im(N):
    im = [[0] * N for _ in range(N)]
    for i in range(N):
        im[i] = ia()
    return im

def lm(N):
    lm = [[0] * N for _ in range(N)]
    for i in range(N):
        lm[i] = la()
    return lm

def dm(N):
    dm = [[0] * N for _ in range(N)]
    for i in range(N):
        dm[i] = da()
    return dm

if __name__ == "__main__":
    try:
        N = int(s())
        print((N - 1) // 2)
    except Exception as e:
        print(str(e))