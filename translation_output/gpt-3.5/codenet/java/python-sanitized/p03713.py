def get_min(x, y):
    return x if x < y else y

def get_max(x, y):
    return x if x > y else y

if __name__ == "__main__":
    h = int(input())
    w = int(input())
    ans = 0

    if h % 3 != 0 and w % 3 != 0:
        if h > w:
            h, w = w, h

        s = h * w
        ans = s

        for h_loop in range(1, h):
            s_a = h_loop * w
            s_b = ((h - h_loop) % 2 == 0) * ((h - h_loop) // 2 * w) or (h - h_loop) * (w // 2)
            s_c = s - s_a - s_b
            smax = get_max(get_max(s_a, s_b), s_c)
            smin = get_min(get_min(s_a, s_b), s_c)
            ans = get_min(ans, smax - smin)

        if h < w:
            for w_loop in range(1, w):
                s_a = w_loop * h
                s_b = ((w - w_loop) % 2 == 0) * ((w - w_loop) // 2 * h) or (w - w_loop) * (h // 2)
                s_c = s - s_a - s_b
                smax = get_max(get_max(s_a, s_b), s_c)
                smin = get_min(get_min(s_a, s_b), s_c)
                ans = get_min(ans, smax - smin)

    print(ans)