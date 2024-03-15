import sys

def main():
    in = sys.stdin
    pw = sys.stdout
    
    x1, y1, x2, y2 = map(int, in.readline().split())
    
    if x1 == x2:
        dif = abs(y1 - y2)
        pw.write(str(x1 + dif) + " " + str(y1) + " " + str(x1 + dif) + " " + str(y2) + "\n")
    elif y1 == y2:
        dif = abs(x1 - x2)
        pw.write(str(x1) + " " + str(y1 + dif) + " " + str(x2) + " " + str(y2 + dif) + "\n")
    elif abs(x1 - x2) == abs(y1 - y2):
        pw.write(str(x1) + " " + str(y2) + " " + str(x2) + " " + str(y1) + "\n")
    else:
        pw.write("-1\n")
    
    pw.flush()

if __name__ == "__main__":
    main()