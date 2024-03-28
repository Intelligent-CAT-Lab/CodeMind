

```python
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

        for maxW in range(0, self.w):
            if self.getPowDistance(maxW, 0) <= maxDist:
                continue
            else:
                break
        if maxW == 0:
            return 0

        ans = maxW
        w = maxW - 1
        for h in range(1, self.h):
            if self.getPowDistance(w, h) <= max
