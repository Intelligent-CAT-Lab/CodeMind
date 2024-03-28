import sys
import math

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

        for i in range(maxDist):
            if self.getPowDistance(maxW, 0) <= maxDist:
                maxW += 1
            else:
                break

        ans = maxW
        w = maxW - 1
        for i in range(1, maxW + 1):
            if self.getPowDistance(w, i) <= maxDist:
                ans += i