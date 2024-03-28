import sys

def solve():
    x = int(input())
    answer = x // 11 * 2
    mod = x % 11
    step = x // 11
    if mod > 0:
        if mod <= 6 - step:
            answer += 1
        else:
            answer += 2
    print(answer)

def main():
    S = time.time()
    is = sys.stdin
    out = sys.stdout

    solve()
    out.flush()
    G = time.time()
    print(f"{G-S:.3f}s")

def eof():
    if len(buf) == -1:
        return True
    lptr = ptr
    while lptr < len(buf):
        if not is_space(inbuf[lptr]):
            return False
        lptr += 1

    try:
        is.seek(1000)
        while True:
            b =