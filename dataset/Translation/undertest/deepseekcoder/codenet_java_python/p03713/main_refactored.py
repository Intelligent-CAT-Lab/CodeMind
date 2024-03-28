class main:
    import sys
    
    def getMin(x, y):
        return x if x < y else y
    
    def getMax(x, y):
        return x if x > y else y
    
    def main():
        h, w = map(int, sys.stdin.readline().split())
        ans = 0
    
        if h % 3 != 0 and w % 3 != 0:
            if h > w:
                h, w = w, h
            s = h * w
            min_h_loop = s
            for h_loop in range(1, h):
                s_a = h_loop * w
                s_b = ((h - h_loop) % 2 == 0) * ((h - h_loop) // 2) * w or (h - h_loop) * (w // 2)
                s_c = s - s_a - s_b
                smax = getMax(getMax(s_a, s_b), s_c)
                smin = getMin(getMin(s_a, s_b), s_c)
                min_h_loop = getMin(min_h_loop, smax - smin)
            ans = min_h_loop
    
            if h < w:
                min_w_loop = s
                for w_loop in range(1, w):
                    s_a = w_loop * h
                    s_b = ((w - w_loop) % 2 == 0) * ((w - w_loop) // 2) * h or (w - w_loop) * (h // 2)
                    s_c = s - s_a - s_b
                    smax = getMax(getMax(s_a, s_b), s_c)
                    smin = getMin(getMin(s_a, s_b), s_c)
                    min_w_loop = getMin(min_w_loop, smax - smin)
                ans = getMin(ans, min_w_loop)
        print(ans)
    
    if __name__ == "__main__":
        main()