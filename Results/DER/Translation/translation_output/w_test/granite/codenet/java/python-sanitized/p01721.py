import sys

def get_pow_distance(mx, my):
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
        wp = mx * w + p
    else:
        wp = mx * w + w - p

    if my % 2 == 0:
        wq = my * h + q
    else:
        wq = my * h + h - q

    wp -= x
    wq -= y
    return wp * wp + wq * wq

def attack():
    max_w, max_h = 0, 0

    max_dist = v * t
    max_dist = max_dist * max_dist

    for w in range(1, 1000000):
        if get_pow_distance(w, 0) <= max_dist:
            max_w = w
        else:
            break

    ans = max_w
    w = max_w - 1
    for h in range(1, 1000000):
        if get_pow_distance(w, h) <= max_dist:
            ans += (w + 1)
        else:
            for w in range(w - 1, -1, -1):
                if get_pow_distance(w, h) <= max_dist:
                    ans += (w + 1)
                    break

    w = max_w - 1
    for h in range(-1, -1000000, -1):
        if get_pow_distance(w, h) <= max_dist:
            ans += (w + 1)
        else:
            for w in range(w - 1, -1, -1):
                if get_pow_distance(w, h) <= max_dist:
                    ans += (w + 1)
                    break

    w = -max_w
    for h in range(0, 1000000):
        if get_pow_distance(w, h) <= max_dist:
            ans -= w
        else:
            for w in range(w + 1, 0):
                if get_pow_distance(w, h) <= max_dist:
                    ans -= w
                    break
    
    w = -max_w
    for h in range(-1, -1000000, -1):
        if get_pow_distance(w, h) <= max_dist:
            ans -= w
        else:
            for w in range(w + 1, 0):
                if get_pow_distance(w, h) <= max_dist:
                    ans -= w
                    break

    return ans

if __name__ == "__main__":
    w, h, v, t, x, y, p, q = map(int, sys.stdin.readline().split())
    print(attack())