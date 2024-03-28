class main:
    import sys
    
    def count(pnum):
        result = 0
        for i in range(1, pnum+1):
            result |= 1 << i
        return result
    
    if __name__ == "__main__":
        out = sys.stdout
        sc = sys.stdin
        out.write(str(count(int(sc.readline().strip()))))
        out.flush()
        sc.close()