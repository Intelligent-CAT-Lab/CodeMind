import sys

def main():
    insn = [int(i) for i in sys.stdin.readline().split()]
    a = insn[0]
    b = insn[1]
    c = insn[2]
    d = insn[3]

    t = c//b
    tt = c%b
    y = a//d
    u = a%d
    while(a >=0 or c>=0):
        c = c - b
        if (c <=0):
            print("Yes")
            return
        a = a - d
        if (a<=0):
            print("No")
            return

if __name__ == "__main__":
    main()