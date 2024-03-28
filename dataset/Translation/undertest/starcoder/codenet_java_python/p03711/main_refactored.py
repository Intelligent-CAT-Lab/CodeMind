class main:
    import sys
    
    def grouped(grp, x, y):
        bx = False
        by = False
    
        for i in range(len(grp)):
            if grp[i] == x:
                bx = True
            if grp[i] == y:
                by = True
    
        return bx and by
    
    if __name__ == "__main__":
        x = int(sys.stdin.readline())
        y = int(sys.stdin.readline())
    
        grp1 = [1, 3, 5, 7, 8, 10, 12]
        grp2 = [4, 6, 9, 11]
        grp3 = [2]
    
        print("Yes" if (grouped(grp1, x, y) or grouped(grp2, x, y)) else "No")