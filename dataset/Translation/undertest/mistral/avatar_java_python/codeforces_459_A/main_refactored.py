class main:
    import sys
    
    def main():
        inp = sys.stdin
        outp = sys.stdout
        
        x1, y1, x2, y2 = map(int, inp.readline().strip().split())
        
        if x1 == x2:
            diff = abs(y1 - y2)
            outp.write(f"{x1 + diff} {y1} {x1 + diff} {y2}\n")
        elif y1 == y2:
            diff = abs(x1 - x2)
            outp.write(f"{x1} {y1 + diff} {x2} {y2 + diff}\n")
        elif abs(x1 - x2) == abs(y1 - y2):
            outp.write(f"{x1} {y2} {x2} {y1}\n")
        else:
            outp.write("-1\n")
    
    if __name__ == "__main__":
        main()