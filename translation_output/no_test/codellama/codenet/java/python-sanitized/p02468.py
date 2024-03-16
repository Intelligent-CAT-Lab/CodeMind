import sys

def power(a, e, modP):
    ret = 1
    for i in range(e):
        if e % 2 != 0:
            ret = (ret * a) % modP
        a = (a * a) % modP
    return ret

def solve(testNumber, in, out):
    m = in.nextInt()
    n = in.nextInt()
    out.println(power(m, n, modP))

if __name__ == "__main__":
    inputStream = sys.stdin
    outputStream = sys.stdout
    in = InputReader(inputStream)
    out = PrintWriter(outputStream)
    solver = TaskX()
    solver.solve(1, in, out)
    out.close()