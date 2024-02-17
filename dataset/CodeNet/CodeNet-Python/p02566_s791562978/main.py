import os
import sys

import numpy as np


def solve(inp):
    def induce(s, n, sa, ls, sum_s, sum_l, lms):
        sa.fill(-1)

        buf = sum_s.copy()
        for i in range(lms.size):
            d = lms[i]
            if d == n:
                continue
            sa[buf[s[d]]] = d
            buf[s[d]] += 1

        buf = sum_l.copy()
        sa[buf[s[n - 1]]] = n - 1
        buf[s[n - 1]] += 1
        for i in range(n):
            v = sa[i]
            if v >= 1 and ls[v - 1] == 0:
                sa[buf[s[v - 1]]] = v - 1
                buf[s[v - 1]] += 1

        buf = sum_l.copy()
        for i in range(n - 1, -1, -1):
            v = sa[i]
            if v >= 1 and ls[v - 1] == 1:
                buf[s[v - 1] + 1] -= 1
                sa[buf[s[v - 1] + 1]] = v - 1

    def suffix_array(s, upper):

        stack = []

        while True:
            n = s.size
            sa = np.zeros(n, np.int64)
            if n < 2:
                break
            if n == 2:
                sa[int(s[0] < s[1])] = 1
                break

            ls = np.zeros(n, np.int64)
            for i in range(n - 2, -1, -1):
                ls[i] = ls[i + 1] if s[i] == s[i + 1] else s[i] < s[i + 1]
            sum_l = np.zeros(upper + 1, np.int64)
            sum_s = np.zeros(upper + 1, np.int64)
            for i in range(n):
                if ls[i]:
                    sum_l[s[i] + 1] += 1
                else:
                    sum_s[s[i]] += 1

            for i in range(upper + 1):
                sum_s[i] += sum_l[i]
                if i < upper:
                    sum_l[i + 1] += sum_s[i]

            lms_map = np.full(n + 1, -1, np.int64)
            m = 0
            for i in range(1, n):
                if ls[i - 1] == 0 and ls[i] == 1:
                    lms_map[i] = m
                    m += 1

            lms = np.zeros(m, np.int64)
            idx = 0
            for i in range(1, n):
                if ls[i - 1] == 0 and ls[i] == 1:
                    lms[idx] = i
                    idx += 1

            induce(s, n, sa, ls, sum_s, sum_l, lms)

            if m == 0:
                break

            sorted_lms = np.zeros(m, np.int64)
            idx = 0
            for i in range(n):
                if lms_map[sa[i]] != -1:
                    sorted_lms[idx] = sa[i]
                    idx += 1
            rec_s = np.zeros(m, np.int64)
            rec_upper = 0
            rec_s[lms_map[sorted_lms[0]]] = 0
            for i in range(1, m):
                l = sorted_lms[i - 1]
                r = sorted_lms[i]
                end_l = lms[lms_map[l] + 1] if lms_map[l] + 1 < m else n
                end_r = lms[lms_map[r] + 1] if lms_map[r] + 1 < m else n
                same = True
                if end_l - l != end_r - r:
                    same = False
                else:
                    while l < end_l:
                        if s[l] != s[r]:
                            break
                        l += 1
                        r += 1
                    if l == n or s[l] != s[r]:
                        same = False
                if not same:
                    rec_upper += 1
                rec_s[lms_map[sorted_lms[i]]] = rec_upper

            stack.append((s, sa, ls, sum_s, sum_l, lms, sorted_lms))

            s = rec_s
            upper = rec_upper

        while stack:
            s, _sa, ls, sum_s, sum_l, lms, sorted_lms = stack.pop()
            n = s.size
            m = lms.size
            for i in range(m):
                sorted_lms[i] = lms[sa[i]]
            induce(s, n, _sa, ls, sum_s, sum_l, sorted_lms)
            sa = _sa

        return sa

    def lcp_array(s, sa):
        n = s.size
        rnk = np.argsort(sa)
        lcp = np.zeros(n - 1, np.int64)
        h = 0
        for i in range(n):
            if h > 0:
                h -= 1
            if rnk[i] == 0:
                continue
            j = sa[rnk[i] - 1]
            while j + h < n and i + h < n:
                if s[j + h] != s[i + h]:
                    break
                h += 1
            lcp[rnk[i] - 1] = h
        return lcp

    sa = suffix_array(inp, 25)
    lcp = lcp_array(inp, sa)

    n = inp.size
    return n * (n + 1) // 2 - lcp.sum()


if sys.argv[-1] == 'ONLINE_JUDGE':
    from numba.pycc import CC

    cc = CC('my_module')
    cc.export('solve', '(i8[:],)')(solve)
    cc.compile()
    exit()

if os.name == 'posix':
    # noinspection PyUnresolvedReferences
    from my_module import solve
else:
    from numba import njit

    solve = njit('(i8[:],)', cache=True)(solve)
    print('compiled', file=sys.stderr)

inp = np.fromiter((ord(c) - 97 for c in input()), np.int64)
ans = solve(inp)
print(ans)
