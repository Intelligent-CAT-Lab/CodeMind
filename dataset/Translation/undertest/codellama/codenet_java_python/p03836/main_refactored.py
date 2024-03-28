class main:
    import sys
    
    def solve(sx, sy, tx, ty):
        dx = tx - sx
        dy = ty - sy
        b = ""
        # first
        b += renzoku("R", dx)
        b += renzoku("U", dy)
        # second
        b += renzoku("L", dx)
        b += renzoku("D", dy)
        # third
        b += renzoku("D", 1)
        b += renzoku("R", dx + 1)
        b += renzoku("U", dy + 1)
        b += renzoku("L", 1)
        # forth
        b += renzoku("U", 1)
        b += renzoku("L", dx + 1)
        b += renzoku("D", dy + 1)
        b += renzoku("R", 1)
        return b
    
    def renzoku(c, n):
        return c * n
    
    if __name__ == "__main__":
        sx, sy, tx, ty = map(int, sys.stdin.readline().split())
        print(solve(sx, sy, tx, ty))