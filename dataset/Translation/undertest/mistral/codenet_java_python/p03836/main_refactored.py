class main:
    import sys
    
    def solve(sx, sy, tx, ty):
        dx = tx - sx
        dy = ty - sy
    
        b = ''
        # sx < tx, sy < ty ãªã®ã§ ç¹å®ã®å½¢å¼ã§è¡ãã
        # first
        b += 'R' * dx
        b += 'U' * dy
    
        # second
        b += 'L' * dx
        b += 'D' * dy
    
        # third
        b += 'D'
        b += 'R' * (dx + 1)
        b += 'U' * (dy + 1)
        b += 'L'
    
        # forth
        b += 'U'
        b += 'L' * (dx + 1)
        b += 'D' * (dy + 1)
        b += 'R'
    
        return b
    
    def renzoku(c, n):
        chars = [c] * n
        return ''.join(chars)
    
    if __name__ == '__main__':
        sx, sy, tx, ty = map(int, sys.stdin.readline().split())
        print(solve(sx, sy, tx, ty))