class main:
    import math
    import sys
    from functools import cmp_to_key
    
    D = [1, 0, -1, 0]
    
    
    def main():
        n = int(input())
        sqi = [0] * n
        sqj = [0] * n
        for i in range(1, n):
            x, d = [int(z) for z in input().split()]
            sqi[i] = sqi[x] + D[d]
            sqj[i] = sqj[x] + D[d ^ 1]
    
        pp = []
        for i in range(n):
            pp.append(Vector2(sqi[i], sqj[i]))
            pp.append(Vector2(sqi[i], sqj[i]+1))
            pp.append(Vector2(sqi[i]+1, sqj[i]))
            pp.append(Vector2(sqi[i]+1, sqj[i]+1))
    
        v = convex_hull(pp)
        m = len(v)
        theta = [0] * m
        for i in range(m):
            v1 = v[i]
            v2 = v[(i + 1) % m]
            theta[i] = math.atan2(v2.y - v