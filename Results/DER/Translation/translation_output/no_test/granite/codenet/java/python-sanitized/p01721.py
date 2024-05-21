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
        max_w = 0
        max_dist = self.v * self.t
        max_dist = max_dist * max_dist

        while self.get_pow_distance(max_w, 0) <= max_dist:
            max_w += 1

        ans = max_w
        w = max_w - 1
        for h in range(1, max_w + 1):
            if self.get_pow_distance(w, h) <= max_dist:
                ans += (w + 1)
            else:
                for w = w - 1; w >= 0; w--:
                    if self.get_pow_distance(w, h) <= max_dist:
                        ans += (w + 1)
                        break

        w = max_w - 1
        for h in range(-1, -max_w - 1, -1):
            if self.get_pow_distance(w, h) <= max_dist:
                ans += (w + 1)
            else:
                for w = w - 1; w >= 0; w--:
                    if self.get_pow_distance(w, h) <= max_dist:
                        ans += (w + 1)
                        break

        w = -max_w
        for h in range(0, max_w + 1):
            if self.get_pow_distance(w, h) <= max_dist:
                ans -= w
            else:
                for w = w + 1; w < 0; w++:
                    if self.get_pow_distance(w, h) <= max_dist:
                        ans -= w
                        break

        w = -max_w
        for h in range(-1, -max_w - 1, -1):
            if self.get_pow_distance(w, h) <= max_dist:
                ans -= w
            else:
                for w = w + 1; w < 0; w++:
                    if self.get_pow_distance(w, h) <= max_dist:
                        ans -= w
                        break

        return ans

    def get_pow_distance(self, mx, my):
        # get reflected wave distance as powered
        #
        # mx=0,my=0 direct
        # mx=1,my=0 reflect right wall at once
        #... equal to the distance between (2w-p,q) and (x,y)
        # mx=2,my=0 reflect right wall at once and left wall at once
        #... equal to the distance between (2w+p,q) and (x,y)
        # mx=3,my=0 reflect right,left,right
        #... equal to the distance between (4w-p,q) and (x,y)
        # mx=k,my=0 if k is even (k*w + p, q) else (k*w + w - p, q)
        #... it can apply to negative k
        #
        # mx=0,my=l if l is even (p, l*h + q) else (p, l*h + h - q)
        #... mx=k,my=l if k and l are even (k*w + p, l*h + q)...
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
    print(wave.attack())

if __name__ == "__main__":
    main()