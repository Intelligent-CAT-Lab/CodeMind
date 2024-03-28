class main:
    P = 1_000_000_007
    
    def count_pieces(a, b, c, d, x, y, z):
        return max(min(b, d) - max(a, c) + 1, 0)
    
    def count_full(x, y, z, a, b, c, d):
        return count_pieces(x - d, x + d, 0, a - 1, x, y, z) \
            * count_pieces(y - d, y + d, 0, b - 1, x, y, z) \
            * count_pieces(z - d, z + d, 0, c - 1, x, y, z) % P
    
    def countX(x, y, z, a, b, c, d):
        return count_pieces(x - d + 1, x + d, 0, a - 1, x, y, z) \
            * count_pieces(y - d, y + d, 0, b - 1, x, y, z) \
            * count_pieces(z - d, z + d, 0, c - 1, x, y, z) % P
    
    def countY(x, y, z, a, b, c, d):
        return count_pieces(x - d, x + d, 0, a - 1, x, y, z) \
            * count_pieces(y - d + 1, y + d, 0, b - 1, x, y, z) \
            * count_pieces(z - d, z + d, 0, c - 1, x, y, z) % P
    
    def countZ(x, y, z, a, b, c, d):
        return count_pieces(x - d, x + d, 0, a - 1, x, y, z) \
            * count_pieces(y - d, y + d, 0, b - 1, x, y, z) \
            * count_pieces(z - d + 1, z + d, 0, c - 1, x, y, z) % P
    
    
    #