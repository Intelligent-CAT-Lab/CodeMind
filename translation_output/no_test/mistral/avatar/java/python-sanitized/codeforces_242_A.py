import sys

def main():
    in = sys.stdin
    pw = sys.stdout
    x, y, a, b = map(int, in.readline().split())
    res = []
    for i in range(a, x+1):
        for j in range(b, y+1):
            if i <= j:
                continue
            res.append(str(i) + " " + str(j))
    pw.write(str(len(res)) + "\n")
    for s in res:
        pw.write(s + "\n")
    pw.close()

if __name__ == "__main__":
    main()