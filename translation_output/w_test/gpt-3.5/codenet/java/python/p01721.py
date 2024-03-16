```python
import sys
from math import pow

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
        max_dist = self.v * self.t * self.v * self.t

        def get_pow_distance(mx, my):
            wp = mx * self.w + self.p if mx % 2 == 0 else mx * self.w + self.w - self.p
            wq = my * self.h + self.q if my % 2 == 0 else my * self.h + self.h - self.q
            wp -= self.x
            wq -= self.y
            return wp * wp + wq * wq

        maxW = 0
        while get_pow_distance(maxW, 0) <= max_dist:
            maxW += 1

        if maxW == 0:
            return 0

        ans = maxW
        w = maxW - 1
        h = 1
        while w >= 0:
            if get_pow_distance(w, h) <= max_dist:
                ans += (w + 1)
            else:
                for w in range(w - 1, -1, -1):
                    if get_pow_distance(w, h) <= max_dist:
                        ans += (w + 1)
                        break
            h += 1

        w = -maxW
        h = 0
        while w < 0:
            if get_pow_distance(w, h) <= max_dist:
                ans -= w
            else:
                for w in range(w + 1, 0):
                    if get_pow_distance(w, h) <= max_dist:
                        ans -= w
                        break
            h += 1

        w = -maxW
        h = -1
        while w < 0:
            if get_pow_distance(w, h) <= max_dist:
                ans -= w
            else:
                for w in range(w + 1, 0):
                    if get_pow_distance(w, h) <= max_dist:
                        ans -= w
                        break
            h -= 1

        return ans

if __name__ == '__main__':
    input_values = list(map(int, input().split()))
    w, h, v, t, x, y, p, q = input_values
    wave = Wave(w, h, v, t, x, y, p, q)
    print(wave.attack())
```
```
