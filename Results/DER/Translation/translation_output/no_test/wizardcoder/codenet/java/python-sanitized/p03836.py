import java.util.Arrays
import java.util.Scanner

class p03836:

    def main(self):
        sc = Scanner(System.in)
        sx = sc.nextInt()
        sy = sc.nextInt()
        tx = sc.nextInt()
        ty = sc.nextInt()

        print( self.solve(sx, sy, tx, ty) )

    def solve(self, sx, sy, tx, ty):
        dx = tx - sx
        dy = ty - sy

        b = StringBuilder()
        # sx < tx, sy < ty ãªã®ã§ ç¹å®ã®å½¢å¼ã§è¡ãã
        # first
        b.append( self.renzoku('R', dx) )
        b.append( self.renzoku('U', dy) )

        # second
        b.append( self.renzoku('L', dx) )
        b.append( self.renzoku('D', dy) )

        # third
        b.append( self.renzoku('D', 1) )
        b.append( self.renzoku('R', dx + 1) )
        b.append( self.renzoku('U', dy + 1) )
        b.append( self.renzoku('L', 1) )

        # forth
        b.append( self.renzoku('U', 1) )
        b.append( self.renzoku('L', dx + 1) )
        b.append( self.renzoku('D', dy + 1) )
        b.append( self.renzoku('R', 1) )

        return b.toString()

    def renzoku(self, c, n):
        chars = [c] * n
        return ''.join(chars)

p03836().main()