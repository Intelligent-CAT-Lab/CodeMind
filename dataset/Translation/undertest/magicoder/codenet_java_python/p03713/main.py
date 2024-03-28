def get_min(x, y):
    return x if x < y else y

def get_max(x, y):
    return x if x > y else y

def main():
    h, w = map(int, input().split())
    ans = 0

    if h % 3 != 0 and w % 3 != 0:
        if h > w:
            h, w = w, h
        s = h * w
        smax, smin = 0, s
        min_h_loop = s
        for h_loop in range(1, h):
            s_a = h_loop * w
            s_b = ((h - h_loop) % 2 == 0) * ((h - h_loop) // 2) * w + ((h - h_loop) % 2 == 1) * (h - h_loop) * (w // 2)
            s_c = s - s_a - s_b
            smax = get_max(get_max(s_a, s_b), s_c)
            smin = get_min(get_min(s_a, s_b), s_c)
            min_h_loop = get_min(min_h_loop, smax - smin)
        ans = min_h_loop

        if h < w:
            min_w_loop = s
            for w_loop in range(1, w):
                s_a = w_loop * h
                s_b = ((w - w_loop) % 2 == 0) * ((w - w_loop) // 2) * h + ((w - w_loop) % 2 == 1) * (w - w_loop) * (h // 2)
                s_c = s - s_a - s_b
                smax = get_max(get_max(s_a, s_b), s_c)
                smin = get_min(get_min(s_a, s_b), s_c)
                min_w_loop = get_min(min_w_loop, smax - smin)
            ans = get_min(ans, min_w_loop)

    print(ans)

if __name__ == "__main__":
    main()