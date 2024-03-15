import sys
from functools import cmp_to_key

def main():
    in_stream = sys.stdin.buffer
    out_stream = sys.stdout.buffer
    s = input().rstrip()
    n = len(s)
    lcp = StringUtil.lcp_array(s)
    ans = n * (n + 1) // 2 - sum(lcp)
    out_stream.write(f"{ans}\n".encode())

class StringUtil:
    SA_THRESHOLD_NAIVE = 10
    SA_THRESHOLD_DOUBLING = 40

    @staticmethod
    def sa_naive(s):
        n = len(s)
        sa = list(range(n))
        sa.sort(key=cmp_to_key(lambda l, r: (s[l:] > s[r:]) - (s[l:] < s[r:])))
        return sa

    @staticmethod
    def sa_doubling(s):
        n = len(s)
        SA = list(range(n))
        rnk = s[:]
        tmp = [0] * n

        SA.sort(key=cmp_to_key(lambda x, y: rnk[x] - rnk[y] if rnk[x] != rnk[y] else \
            rnk[x + k] - rnk[y + k] if x + k < n and y + k < n else \
            -1 if y + k < n else 1))
        tmp[SA[0]] = 0
        for i in range(1, n):
            tmp[SA[i]] = tmp[SA[i - 1]] + (rnk[SA[i]] != rnk[SA[i - 1]] or \
                                            rnk[SA[i] + k] != rnk[SA[i - 1] + k])
        rnk = tmp[:]
        return SA

    @staticmethod
    def lcp_array(s, sa):
        n = len(s)
        rnk = [0] * n
        for i in range(n):
            rnk[sa[i]] = i
        lcp = [0] * (n - 1)
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

    @staticmethod
    def lcp_array_chars(s):
        n = len(s)
        int_s = [ord(c) for c in s]
        return StringUtil.lcp_array(int_s, StringUtil.sa_naive(int_s) if n < StringUtil.SA_THRESHOLD_NAIVE \
            else StringUtil.sa_doubling(int_s) if n < StringUtil.SA_THRESHOLD_DOUBLING else \
            StringUtil.sais(int_s, max(int_s)))

    @staticmethod
    def sais(s, upper):
        #