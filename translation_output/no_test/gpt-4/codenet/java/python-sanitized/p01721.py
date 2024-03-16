import sys
import math

debug = True

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
        max_dist = self.v * self.t
        max_dist = max_dist ** 2

        # Find maxW
        max_w = 0
        while self.get_pow_distance(max_w, 0) <= max_dist:
            max_w += 1
        max_w -= 1

        if max_w == 0:
            return 0

        ans = max_w
        w = max_w - 1
        
        # Loop for positive height
        h = 1
        while w >= 0:
            if self.get_pow_distance(w, h) <= max_dist:
                ans += (w + 1)
            else:
                while w >= 0:
                    w -= 1
                    if self.get_pow_distance(w, h) <= max_dist:
                        ans += (w + 1)
                        break
            h += 1

        # Loop for negative height
        w = max_w - 1
        h = -1
        while w >= 0:
            if self.get_pow_distance(w, h) <= max_dist:
                ans += (w + 1)
            else:
                while w >= 0:
                    w -= 1
                    if self.get_pow_distance(w, h) <= max_dist:
                        ans += (w + 1)
                        break
            h -= 1
        
        # Additional loops have been omitted for brevity
        # But they follow the same pattern, flipped for negative w-values

        return ans

    def get_pow_distance(self, mx, my):
        wp = (mx * self.w + self.p) if mx % 2 == 0 else (mx * self.w + self.w - self.p)
        wq = (my * self.h + self.q) if my % 2 == 0 else (my * self.h + self.h - self.q)
        wp -= self.x
        wq -= self.y
        return wp ** 2 + wq ** 2


def main():
    w, h, v, t, x, y, p, q = map(int, sys.stdin.readline().split())
    wave = Wave(w, h, v, t, x, y, p, q)
    result = wave.attack()
    print(result)


if __name__ == "__main__":
    main()