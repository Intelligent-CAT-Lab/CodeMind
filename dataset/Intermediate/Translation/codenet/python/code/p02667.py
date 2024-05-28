def solve(t):
    res = 0
    length = 0
    n = len(t)
    used = [0] * n
    # insert 1 greedy
    for i in range(n):
        if t[i] == "1":
            length += 1
            res += (length + 1) // 2
            used[i] = 1

    # insert 0 greedy
    cnt_temp = 0
    for i in range(n):
        if used[i]:
            cnt_temp += 1
        elif cnt_temp % 2 == 1:
            # add 0 if it is 2, 4, 6 th
            cnt_temp += 1
            length += 1
            res += (length + 1) // 2
            used[i] = 1

    cnt_unused = n - sum(used)
    switch_count = 0
    # split by other 0
    st = 0
    cnt_1_even = 0
    cnt_1_odd = 0
    for i in range(n):
        if used[i] == 0:
            switched = (switch_count + 1) // 2
            non_switched = cnt_unused - switched
            res += cnt_1_even * non_switched + cnt_1_odd * switched
            st = i + 1
            switch_count += 1
            cnt_1_even = 0
            cnt_1_odd = 0
        if t[i] == "1":
            if (i - st) % 2 == 0:
                cnt_1_even += 1
            else:
                cnt_1_odd += 1

    # add last
    switched = (switch_count + 1) // 2
    non_switched = cnt_unused - switched
    res += cnt_1_even * non_switched + cnt_1_odd * switched

    return res


def main():
    t = input()
    res = solve(t)
    print(res)


def test():
    assert solve("1101") == 5
    assert solve("0111101101") == 26


if __name__ == "__main__":
    test()
    main()
