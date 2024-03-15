```python
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
        maxW = 0
        maxH = 0
        maxDist = self.v * self.t
        maxDist = maxDist * maxDist
        
        while self.getPowDistance(maxW, 0) <= maxDist:
            maxW += 1
        
        if maxW == 0:
            return 0
        
        ans = maxW
        w = maxW - 1
        h = 1
        while w >= 0:
            if self.getPowDistance(w, h) <= maxDist:
                ans += (w + 1)
            else:
                w -= 1
                for w in range(w, -1, -1):
                    if self.getPowDistance(w, h) <= maxDist:
                        ans += (w + 1)
                        break
            h += 1
        
        w = maxW - 1
        h = -1
        while w >= 0:
            if self.getPowDistance(w, h) <= maxDist:
                ans += (w + 1)
            else:
                w -= 1
                for w in range(w, -1, -1):
                    if self.getPowDistance(w, h) <= maxDist:
                        ans += (w + 1)
                        break
            h -= 1
        
        w = -maxW
        h = 0
        while w < 0:
            if self.getPowDistance(w, h) <= maxDist:
                ans -= w
            else:
                w += 1
                for w in range(w, 0):
                    if self.getPowDistance(w, h) <= maxDist:
                        ans -= w
                        break
            h += 1
        
        w = -maxW
        h = -1
        while w < 0:
            if self.getPowDistance(w, h) <= maxDist:
                ans -= w
            else:
                w += 1
                for w in range(w, 0):
                    if self.getPowDistance(w, h) <= maxDist:
                        ans -= w
                        break
            h -= 1
        
        return ans

    def getPowDistance(self, mx, my):
        wp = 0
        wq = 0

        if mx % 2 == 0:
            wp = mx * self.w + self.p
        else:
            wp = mx * self.w + self.w - self.p

        if my % 2 == 0:
            wq = my * self.h + self.q
        else:
            wq = my * self.h + self.h - self.q

        wp -= self.x
        wq -= self.y

        return wp * wp + wq * wq

def main():
    w, h, v, t, x, y, p, q = map(int, input().split())
    wave = Wave(w, h, v, t, x, y, p, q)
    ans = wave.attack()
    print(ans)

if __name__ == "__main__":
    main()
```
```
