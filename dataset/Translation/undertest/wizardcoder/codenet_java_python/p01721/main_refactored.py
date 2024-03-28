class main:
    import sys
    
    class Wave:
        def __init__(self, w, h, v, t, x, y, p, q):
            self.w = w
            self.h = h
            self.v = v
            self.t = t
            self.x = x
            self.y = y
            self.p = p
            self.q = q
    
        def attack(self):
            maxW, maxH = 0, 0
            maxDist = self.v * self.t
            maxDist = maxDist * maxDist
    
            for w in range(maxDist + 1):
                if w * w <= maxDist:
                    maxW = w
                    break
    
            for h in range(maxDist + 1):
                if h * h <= maxDist:
                    maxH = h