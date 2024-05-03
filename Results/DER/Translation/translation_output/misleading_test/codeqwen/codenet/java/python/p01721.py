Here is the Python version of the provided Java code:

```python
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
        max_w, max_h = 0, 0

        max_dist = self.v * self.t
        max_dist = max_dist * max_dist

        for max_w in range(max_w, 0, -1):
            if self.get_pow_distance(max_w, 0) <= max_dist:
                break
        if max_w == 0:
            return 0

        ans = max_w
        w = max_w - 1
        for h in range(1, max_h + 1):
            if self.get_pow_distance(w, h) <= max_dist:
                ans += (w + 1)
            else:
                for w in range(w - 1, -1, -1):
                    if self.get_pow_distance(w, h) <= max_dist:
                        ans += (w + 1)
                        break

        w = max_w - 1
        for h in range(-1, -max_h - 1, -1):
            if self.get_pow_distance(w, h) <= max_dist:
                ans += (w + 1)
            else:
                for w in range(w - 1, -1, -1):
                    if self.get_pow_distance(w, h) <= max_dist:
                        ans += (w + 1)
                        break

        w = -max_w
        for h in range(max_h, -1, -1):
            if self.get_pow_distance(w, h) <= max_dist:
                ans -= w
            else:
            
