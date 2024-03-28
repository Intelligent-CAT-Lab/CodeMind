Here's the translated Python code for your provided Java code:

```python
def get_min(x, y):
    return min(x, y)

def get_max(x, y):
    return max(x, y)

def main():
    h = int(input())
    w = int(input())
    ans = 0

    if h % 3 != 0 and w % 3 != 0:
        if h > w:
            h, w = w, h

        s = h * w
        smax = smin = 0
        min_h_loop = s
        for h_loop in range(1, h):
            s_a = h_loop * w
            s_b = ((h - h_loop) // 2) * w if (h - h_loop) % 2 == 0 else (h - h_loop) * (w // 2)
            s_c = s - s_a - s_b
            smax = get_max(get_max(s_a, s_b), s_c)
            smin = get_min(get_min(s_a, s_b), s_c)
            min_h_loop = get_min(min_h_loop, smax - smin)
        ans = min_h_loop

        if h < w:
            min_w_loop = s
            for w_loop in range(1, w):
                s_a = w_loop * h
                s_b = ((w - w_loop) // 2) * h if (w - w_loop) % 2 == 0 else (w - w_loop) * (h // 2)
                s_c = s - s_a - s_b
                smax = get_max(get_max(s_a, s_b), s_c)
                smin = get_min(get_min(s_a, s_b), s_c)
                min_w_loop = get_min(min_w_loop, smax - smin)
            ans = get_min(ans, min_w_loop)

    print(ans)

if __name__ == "__main__":
    main()
```

Note that Python has built-in `min()` and `max()` functions, so I used those instead of writing separate functions for getting the minimum and maximum. Additionally, I replaced the `Scanner` class with built-in `input()` function for reading inputs. Integer division is done with `//` and swapping variables is straightforward with tuple unpacking. Also, the `main()` function was created to encapsulate the program's main logic, and the `if __name__ == "__main__":` idiom is used to run the `main()` function if the script is executed as the main program.
