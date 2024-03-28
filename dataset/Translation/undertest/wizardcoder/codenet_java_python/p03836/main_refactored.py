class main:
    import java.util.Arrays
    import java.util.Scanner
    
    def solve(sx, sy, tx, ty):
        dx = tx - sx
        dy = ty - sy
    
        b = ""
        # sx < tx, sy < ty ãªã®ã§ ç¹å®ã®å½¢å¼ã§è¡ãã
        # first
        b += renzoku('R', dx)
        b += renzoku('U', dy)
    
        # second
        b += renzoku('L', dx)
        b += renzoku('D', dy)
    
        # third
        b += renzoku('D', 1)
        b += renzoku('R', dx + 1)
        b += renzoku('U', dy + 1)
        b += renzoku('L', 1)
    
        # forth
        b += renzoku('U', 1)
        b += renzoku('L', dx + 1)
        b += renzoku('D', dy + 1)
        b += renzoku('R', 1)
    
        return b
    
    def renzoku(c, n):
        chars = [c] * n
        return "".join(chars)
    
    if __name__ == '__main__':
        sc = Scanner(System.in)
        sx = sc.nextInt()
        sy = sc.nextInt()
        tx = sc.nextInt()
        ty = sc.nextInt()
    
        print(solve(sx, sy, tx, ty))