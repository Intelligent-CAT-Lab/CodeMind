def divide_h(h, w):
    min_diff = 1e12
    for x in range(1, h):
        h_rem = h - x
        s_A = x * w
        # vertical devide
        w1 = w // 2
        s_B = w1 * h_rem
        s_C = (w - w1) * h_rem
        tmp = max(s_A, s_B, s_C) - min(s_A, s_B, s_C)
        if min_diff > tmp:
            min_diff = tmp
        # horizontal devide
        h1 = h_rem // 2
        s_B = w * h1
        s_C = w * (h_rem - h1)
        tmp = max(s_A, s_B, s_C) - min(s_A, s_B, s_C)
        if min_diff > tmp:
            min_diff = tmp
    return min_diff
H, W = map(int, "3 5".split())
a1 = divide_h(H, W)
a2 = divide_h(W, H)
print(min(a1, a2))